package typingsJapgolly.tstl.mapContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MapContainer {
  type InsertRet[Key, T, Unique /* <: scala.Boolean */, SourceT /* <: typingsJapgolly.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, Reverse] */, IteratorT /* <: typingsJapgolly.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, SourceT, IteratorT, Reverse] */, Reverse /* <: typingsJapgolly.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, SourceT, IteratorT, Reverse] */] = IteratorT | (typingsJapgolly.tstl.pairMod.Pair[IteratorT, scala.Boolean])
}
