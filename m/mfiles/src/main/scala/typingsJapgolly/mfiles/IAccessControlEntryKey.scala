package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlEntryKey extends StObject {
  
  def Clone(): IAccessControlEntryKey
  
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs
  
  val HasConcreteUserOrGroupID: Boolean
  
  val IsGroup: Boolean
  
  val IsPseudoUser: Boolean
  
  var PseudoUserID: IIndirectPropertyID
  
  def ResetResolvedPseudoUserOrGroupIDs(): Unit
  
  def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit
  
  val UserOrGroupID: Double
}
object IAccessControlEntryKey {
  
  inline def apply(
    Clone: CallbackTo[IAccessControlEntryKey],
    GetResolvedPseudoUserOrGroupIDs: CallbackTo[IUserOrUserGroupIDs],
    HasConcreteUserOrGroupID: Boolean,
    IsGroup: Boolean,
    IsPseudoUser: Boolean,
    PseudoUserID: IIndirectPropertyID,
    ResetResolvedPseudoUserOrGroupIDs: Callback,
    SetUserOrGroupID: (Double, Boolean) => Callback,
    UserOrGroupID: Double
  ): IAccessControlEntryKey = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, GetResolvedPseudoUserOrGroupIDs = GetResolvedPseudoUserOrGroupIDs.toJsFn, HasConcreteUserOrGroupID = HasConcreteUserOrGroupID.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], IsPseudoUser = IsPseudoUser.asInstanceOf[js.Any], PseudoUserID = PseudoUserID.asInstanceOf[js.Any], ResetResolvedPseudoUserOrGroupIDs = ResetResolvedPseudoUserOrGroupIDs.toJsFn, SetUserOrGroupID = js.Any.fromFunction2((t0: Double, t1: Boolean) => (SetUserOrGroupID(t0, t1)).runNow()), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntryKey]
  }
  
  extension [Self <: IAccessControlEntryKey](x: Self) {
    
    inline def setClone(value: CallbackTo[IAccessControlEntryKey]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setGetResolvedPseudoUserOrGroupIDs(value: CallbackTo[IUserOrUserGroupIDs]): Self = StObject.set(x, "GetResolvedPseudoUserOrGroupIDs", value.toJsFn)
    
    inline def setHasConcreteUserOrGroupID(value: Boolean): Self = StObject.set(x, "HasConcreteUserOrGroupID", value.asInstanceOf[js.Any])
    
    inline def setIsGroup(value: Boolean): Self = StObject.set(x, "IsGroup", value.asInstanceOf[js.Any])
    
    inline def setIsPseudoUser(value: Boolean): Self = StObject.set(x, "IsPseudoUser", value.asInstanceOf[js.Any])
    
    inline def setPseudoUserID(value: IIndirectPropertyID): Self = StObject.set(x, "PseudoUserID", value.asInstanceOf[js.Any])
    
    inline def setResetResolvedPseudoUserOrGroupIDs(value: Callback): Self = StObject.set(x, "ResetResolvedPseudoUserOrGroupIDs", value.toJsFn)
    
    inline def setSetUserOrGroupID(value: (Double, Boolean) => Callback): Self = StObject.set(x, "SetUserOrGroupID", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
  }
}
