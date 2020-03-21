package typingsJapgolly.tstl.setContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SetContainer {
  /**
    * Return type of {@link SetContainer.insert}
    */
  type InsertRet[Key, Unique /* <: scala.Boolean */, Source /* <: typingsJapgolly.tstl.setContainerMod.SetContainer[Key, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: typingsJapgolly.tstl.setContainerMod.SetContainer.Iterator[Key, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: typingsJapgolly.tstl.setContainerMod.SetContainer.ReverseIterator[Key, Unique, Source, IteratorT, ReverseT] */] = IteratorT | (typingsJapgolly.tstl.pairMod.Pair[IteratorT, scala.Boolean])
}
