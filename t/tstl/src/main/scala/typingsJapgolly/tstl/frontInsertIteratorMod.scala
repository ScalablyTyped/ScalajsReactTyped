package typingsJapgolly.tstl

import typingsJapgolly.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typingsJapgolly.tstl.insertIteratorBaseMod.InsertIteratorBase
import typingsJapgolly.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/FrontInsertIterator", JSImport.Namespace)
@js.native
object frontInsertIteratorMod extends js.Object {
  @js.native
  class FrontInsertIterator[Source /* <: IPushFront[ValueType[Source]] */] protected () extends InsertIteratorBase[ValueType[Source], FrontInsertIterator[Source]] {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
    var source_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    @JSName("value")
    def value_MFrontInsertIterator(`val`: ValueType[Source]): js.Any = js.native
  }
  
  @js.native
  object FrontInsertIterator extends js.Object {
    type ValueType[Source /* <: IPushFront[_] */] = js.Any
  }
  
}

