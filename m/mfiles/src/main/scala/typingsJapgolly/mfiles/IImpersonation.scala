package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFImpersonationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImpersonation extends js.Object {
  var Account: String
  var ImpersonationType: MFImpersonationType
  var Password: String
  def Clone(): IImpersonation
}

object IImpersonation {
  @scala.inline
  def apply(
    Account: String,
    Clone: CallbackTo[IImpersonation],
    ImpersonationType: MFImpersonationType,
    Password: String
  ): IImpersonation = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], ImpersonationType = ImpersonationType.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IImpersonation]
  }
}

