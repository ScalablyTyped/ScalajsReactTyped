package typingsJapgolly.tstl.mod

import typingsJapgolly.tstl.iforwarditeratorMod.IForwardIterator
import typingsJapgolly.tstl.ipointerMod.IPointer.ValueType
import typingsJapgolly.tstl.operationsMod.Operator
import typingsJapgolly.tstl.operationsMod.Transformer
import typingsJapgolly.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "transform_exclusive_scan")
@js.native
object transformExclusiveScan extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: ValueType[InputIterator],
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
}

