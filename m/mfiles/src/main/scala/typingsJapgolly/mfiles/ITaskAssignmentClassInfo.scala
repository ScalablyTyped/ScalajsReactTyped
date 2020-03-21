package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITaskAssignmentClassInfo extends js.Object {
  var AnyAssigneeCompletes: Boolean
  var SignatureForCompletion: ISignatureSettings
  def Clone(): ITaskAssignmentClassInfo
}

object ITaskAssignmentClassInfo {
  @scala.inline
  def apply(
    AnyAssigneeCompletes: Boolean,
    Clone: CallbackTo[ITaskAssignmentClassInfo],
    SignatureForCompletion: ISignatureSettings
  ): ITaskAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeCompletes = AnyAssigneeCompletes.asInstanceOf[js.Any], SignatureForCompletion = SignatureForCompletion.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[ITaskAssignmentClassInfo]
  }
}

