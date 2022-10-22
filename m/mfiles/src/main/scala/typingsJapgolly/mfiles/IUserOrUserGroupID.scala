package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupID extends StObject {
  
  def Clone(): IUserOrUserGroupID
  
  var UserOrGroupID: Double
  
  var UserOrGroupType: MFUserOrUserGroupType
}
object IUserOrUserGroupID {
  
  inline def apply(
    Clone: CallbackTo[IUserOrUserGroupID],
    UserOrGroupID: Double,
    UserOrGroupType: MFUserOrUserGroupType
  ): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
  
  extension [Self <: IUserOrUserGroupID](x: Self) {
    
    inline def setClone(value: CallbackTo[IUserOrUserGroupID]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
    
    inline def setUserOrGroupType(value: MFUserOrUserGroupType): Self = StObject.set(x, "UserOrGroupType", value.asInstanceOf[js.Any])
  }
}
