package typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.distTypesMod.Rank
import typingsJapgolly.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpMapper extends js.Object {
  var attrs: js.UndefOr[js.Array[AttrParamMapper]] = js.undefined
  var category: Category
  var customExecutor: js.UndefOr[OpExecutor] = js.undefined
  var inputs: js.UndefOr[js.Array[InputParamMapper]] = js.undefined
  var tfOpName: String
}

object OpMapper {
  @scala.inline
  def apply(
    category: Category,
    tfOpName: String,
    attrs: js.Array[AttrParamMapper] = null,
    customExecutor: /* node */ GraphNode => CallbackTo[
      Tensor_[Rank] | js.Array[Tensor_[Rank]] | (js.Promise[Tensor_[Rank] | js.Array[Tensor_[Rank]]])
    ] = null,
    inputs: js.Array[InputParamMapper] = null
  ): OpMapper = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], tfOpName = tfOpName.asInstanceOf[js.Any])
    if (attrs != null) __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    if (customExecutor != null) __obj.updateDynamic("customExecutor")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.tensorflowTfjsConverter.operationsTypesMod.GraphNode) => customExecutor(t0).runNow()))
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpMapper]
  }
}

