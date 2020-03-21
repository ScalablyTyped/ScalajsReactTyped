package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAutoStateTransitionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStateTransition extends js.Object {
  var AccessControlList: IAccessControlList
  var Description: String
  var EvaluationOrderNumber: Double
  var FromState: Double
  var ID: Double
  var Name: String
  var SemanticAliases: ISemanticAliases
  var SignatureSettings: ISignatureSettings
  var ToState: Double
  var TriggerAllowedByVBScript: String
  var TriggerCriteria: ISearchConditions
  var TriggerInDays: Double
  var TriggerMode: MFAutoStateTransitionMode
  def Clone(): IStateTransition
}

object IStateTransition {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[IStateTransition],
    Description: String,
    EvaluationOrderNumber: Double,
    FromState: Double,
    ID: Double,
    Name: String,
    SemanticAliases: ISemanticAliases,
    SignatureSettings: ISignatureSettings,
    ToState: Double,
    TriggerAllowedByVBScript: String,
    TriggerCriteria: ISearchConditions,
    TriggerInDays: Double,
    TriggerMode: MFAutoStateTransitionMode
  ): IStateTransition = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], EvaluationOrderNumber = EvaluationOrderNumber.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any], SignatureSettings = SignatureSettings.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any], TriggerAllowedByVBScript = TriggerAllowedByVBScript.asInstanceOf[js.Any], TriggerCriteria = TriggerCriteria.asInstanceOf[js.Any], TriggerInDays = TriggerInDays.asInstanceOf[js.Any], TriggerMode = TriggerMode.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IStateTransition]
  }
}

