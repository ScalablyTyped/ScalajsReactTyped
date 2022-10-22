package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPermissionObject extends StObject {
  
  var ExpirationDate: Any
  
  /* private */ @JSName("InfoPath.UserPermissionObject_typekey")
  var InfoPathDotUserPermissionObject_typekey: UserPermissionObject
  
  val Parent: Any
  
  var Permission: Double
  
  def Remove(): Unit
  
  val UserId: String
}
object UserPermissionObject {
  
  inline def apply(
    ExpirationDate: Any,
    InfoPathDotUserPermissionObject_typekey: UserPermissionObject,
    Parent: Any,
    Permission: Double,
    Remove: Callback,
    UserId: String
  ): UserPermissionObject = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any], Remove = Remove.toJsFn, UserId = UserId.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.UserPermissionObject_typekey")(InfoPathDotUserPermissionObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPermissionObject]
  }
  
  extension [Self <: UserPermissionObject](x: Self) {
    
    inline def setExpirationDate(value: Any): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotUserPermissionObject_typekey(value: UserPermissionObject): Self = StObject.set(x, "InfoPath.UserPermissionObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: Double): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "Remove", value.toJsFn)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
