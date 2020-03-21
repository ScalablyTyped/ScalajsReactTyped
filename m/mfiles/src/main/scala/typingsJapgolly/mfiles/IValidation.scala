package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidation extends js.Object {
  var RegularExpression: String
  var VBScript: String
  def Clone(): IValidation
}

object IValidation {
  @scala.inline
  def apply(Clone: CallbackTo[IValidation], RegularExpression: String, VBScript: String): IValidation = {
    val __obj = js.Dynamic.literal(RegularExpression = RegularExpression.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IValidation]
  }
}

