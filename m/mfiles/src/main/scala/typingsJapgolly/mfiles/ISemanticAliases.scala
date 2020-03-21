package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISemanticAliases extends js.Object {
  var Value: String
  def Clone(): ISemanticAliases
}

object ISemanticAliases {
  @scala.inline
  def apply(Clone: CallbackTo[ISemanticAliases], Value: String): ISemanticAliases = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISemanticAliases]
  }
}

