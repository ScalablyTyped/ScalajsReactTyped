package typingsJapgolly.picturefill.mod.Picturefill

import org.scalajs.dom.raw.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateArg extends js.Object {
  var elements: NodeList | js.Array[ElementNullable]
  var reevaluate: js.UndefOr[Boolean] = js.undefined
}

object EvaluateArg {
  @scala.inline
  def apply(elements: NodeList | js.Array[ElementNullable], reevaluate: js.UndefOr[Boolean] = js.undefined): EvaluateArg = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (!js.isUndefined(reevaluate)) __obj.updateDynamic("reevaluate")(reevaluate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateArg]
  }
}

