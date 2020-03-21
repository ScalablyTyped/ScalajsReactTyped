package typingsJapgolly.tstl.baseMod

import typingsJapgolly.tstl.entryMod.Entry
import typingsJapgolly.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import typingsJapgolly.tstl.mapContainerMod.MapContainer.Iterator
import typingsJapgolly.tstl.mapContainerMod.MapContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "MapContainer")
@js.native
abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: typingsJapgolly.tstl.mapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends typingsJapgolly.tstl.containerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ Source, 
        ILinearContainerBase[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]]
      ]) = this()
}

