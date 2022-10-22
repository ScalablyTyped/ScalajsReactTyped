package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupIDEx extends StObject {
  
  def Clone(): IUserOrUserGroupIDEx
  
  val IndirectProperty: IIndirectPropertyID
  
  def SetIndirectPropertyPseudoUser(PseudoUserID: IIndirectPropertyID): Unit
  
  def SetUserAccount(UserAccount: Double): Unit
  
  def SetUserGroup(UserGroup: Double): Unit
  
  def SetWorkflowStatePseudoUser(WorkflowState: Double): Unit
  
  val UserOrGroupID: Double
  
  val UserOrGroupType: MFUserOrUserGroupType
  
  val WorkflowState: Double
}
object IUserOrUserGroupIDEx {
  
  inline def apply(
    Clone: CallbackTo[IUserOrUserGroupIDEx],
    IndirectProperty: IIndirectPropertyID,
    SetIndirectPropertyPseudoUser: IIndirectPropertyID => Callback,
    SetUserAccount: Double => Callback,
    SetUserGroup: Double => Callback,
    SetWorkflowStatePseudoUser: Double => Callback,
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType,
    WorkflowState: Double
  ): IUserOrUserGroupIDEx = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, IndirectProperty = IndirectProperty.asInstanceOf[js.Any], SetIndirectPropertyPseudoUser = js.Any.fromFunction1((t0: IIndirectPropertyID) => SetIndirectPropertyPseudoUser(t0).runNow()), SetUserAccount = js.Any.fromFunction1((t0: Double) => SetUserAccount(t0).runNow()), SetUserGroup = js.Any.fromFunction1((t0: Double) => SetUserGroup(t0).runNow()), SetWorkflowStatePseudoUser = js.Any.fromFunction1((t0: Double) => SetWorkflowStatePseudoUser(t0).runNow()), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any], WorkflowState = WorkflowState.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupIDEx]
  }
  
  extension [Self <: IUserOrUserGroupIDEx](x: Self) {
    
    inline def setClone(value: CallbackTo[IUserOrUserGroupIDEx]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setIndirectProperty(value: IIndirectPropertyID): Self = StObject.set(x, "IndirectProperty", value.asInstanceOf[js.Any])
    
    inline def setSetIndirectPropertyPseudoUser(value: IIndirectPropertyID => Callback): Self = StObject.set(x, "SetIndirectPropertyPseudoUser", js.Any.fromFunction1((t0: IIndirectPropertyID) => value(t0).runNow()))
    
    inline def setSetUserAccount(value: Double => Callback): Self = StObject.set(x, "SetUserAccount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetUserGroup(value: Double => Callback): Self = StObject.set(x, "SetUserGroup", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetWorkflowStatePseudoUser(value: Double => Callback): Self = StObject.set(x, "SetWorkflowStatePseudoUser", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
    
    inline def setUserOrGroupType(value: MFUserOrUserGroupType): Self = StObject.set(x, "UserOrGroupType", value.asInstanceOf[js.Any])
    
    inline def setWorkflowState(value: Double): Self = StObject.set(x, "WorkflowState", value.asInstanceOf[js.Any])
  }
}
