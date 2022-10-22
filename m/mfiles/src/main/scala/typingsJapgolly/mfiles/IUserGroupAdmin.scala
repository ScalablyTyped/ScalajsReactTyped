package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserGroupAdmin extends StObject {
  
  var AccessControlList: IAccessControlList
  
  def Clone(): IUserGroupAdmin
  
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): Unit
  
  var SemanticAliases: ISemanticAliases
  
  var UserGroup: IUserGroup
}
object IUserGroupAdmin {
  
  inline def apply(
    AccessControlList: IAccessControlList,
    Clone: CallbackTo[IUserGroupAdmin],
    CloneFrom: IUserGroupAdmin => Callback,
    SemanticAliases: ISemanticAliases,
    UserGroup: IUserGroup
  ): IUserGroupAdmin = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IUserGroupAdmin) => CloneFrom(t0).runNow()), SemanticAliases = SemanticAliases.asInstanceOf[js.Any], UserGroup = UserGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserGroupAdmin]
  }
  
  extension [Self <: IUserGroupAdmin](x: Self) {
    
    inline def setAccessControlList(value: IAccessControlList): Self = StObject.set(x, "AccessControlList", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IUserGroupAdmin]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IUserGroupAdmin => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IUserGroupAdmin) => value(t0).runNow()))
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
    
    inline def setUserGroup(value: IUserGroup): Self = StObject.set(x, "UserGroup", value.asInstanceOf[js.Any])
  }
}
