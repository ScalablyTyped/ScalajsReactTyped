package typingsJapgolly.tstl.containerMod

import typingsJapgolly.tstl.ilinearcontainerbaseMod.ILinearContainerBase
import typingsJapgolly.tstl.setContainerMod.SetContainer.Iterator
import typingsJapgolly.tstl.setContainerMod.SetContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container", "SetContainer")
@js.native
abstract class SetContainer[Key, Unique /* <: Boolean */, SourceT /* <: typingsJapgolly.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, Unique, SourceT, IteratorT, ReverseT] */] protected ()
  extends typingsJapgolly.tstl.setContainerMod.SetContainer[Key, Unique, SourceT, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ SourceT, 
        ILinearContainerBase[Key, SourceT, IteratorT, ReverseT, Key]
      ]) = this()
}

