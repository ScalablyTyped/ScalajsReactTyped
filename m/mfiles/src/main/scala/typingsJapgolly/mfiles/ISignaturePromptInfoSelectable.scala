package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISignaturePromptInfoSelectable extends js.Object {
  var PromptInfos: ISignaturePromptInfos
  def Clone(): ISignaturePromptInfoSelectable
}

object ISignaturePromptInfoSelectable {
  @scala.inline
  def apply(Clone: CallbackTo[ISignaturePromptInfoSelectable], PromptInfos: ISignaturePromptInfos): ISignaturePromptInfoSelectable = {
    val __obj = js.Dynamic.literal(PromptInfos = PromptInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ISignaturePromptInfoSelectable]
  }
}

