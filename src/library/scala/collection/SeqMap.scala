/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.collection

/**
  * A generic trait for ordered maps. Concrete classes have to provide
  * functionality for the abstract methods in `SeqMap`.
  *
  * Note that when checking for equality [[SeqMap]] does not take into account
  * ordering.
  *
  * @tparam K      the type of the keys contained in this linked map.
  * @tparam V      the type of the values associated with the keys in this linked map.
  * @author Matthew de Detrich, Josh Lemer
  * @version 2.13
  * @since 2.13
  * @define coll immutable seq map
  * @define Coll `immutable.SeqMap`
  */

trait SeqMap[K, +V] extends Map[K, V]
  with MapOps[K, V, SeqMap, SeqMap[K, V]]
  with MapFactoryDefaults[K, V, SeqMap, Iterable] {
  override def mapFactory: MapFactory[SeqMap] = SeqMap
}

object SeqMap extends MapFactory.Delegate[immutable.SeqMap](immutable.SeqMap)

