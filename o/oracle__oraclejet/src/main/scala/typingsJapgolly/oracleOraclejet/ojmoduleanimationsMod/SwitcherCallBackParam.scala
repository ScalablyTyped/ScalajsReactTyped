package typingsJapgolly.oracleOraclejet.ojmoduleanimationsMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitcherCallBackParam extends js.Object {
  var isInitial: Boolean
  var newViewModel: js.Any
  var node: Element
  var oldViewModel: js.Any
  def valueAccessor(): js.Any
}

object SwitcherCallBackParam {
  @scala.inline
  def apply(
    isInitial: Boolean,
    newViewModel: js.Any,
    node: Element,
    oldViewModel: js.Any,
    valueAccessor: CallbackTo[js.Any]
  ): SwitcherCallBackParam = {
    val __obj = js.Dynamic.literal(isInitial = isInitial.asInstanceOf[js.Any], newViewModel = newViewModel.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], oldViewModel = oldViewModel.asInstanceOf[js.Any])
    __obj.updateDynamic("valueAccessor")(valueAccessor.toJsFn)
    __obj.asInstanceOf[SwitcherCallBackParam]
  }
}

