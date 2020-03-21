package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfo extends js.Object {
  var Meaning: String
  var Reason: String
  def Clone(): ISignaturePromptInfo
}

object ISignaturePromptInfo {
  @scala.inline
  def apply(Clone: CallbackTo[ISignaturePromptInfo], Meaning: String, Reason: String): ISignaturePromptInfo = {
    val __obj = js.Dynamic.literal(Meaning = Meaning.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISignaturePromptInfo]
  }
}

