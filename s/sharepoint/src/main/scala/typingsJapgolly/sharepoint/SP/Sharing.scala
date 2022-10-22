package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sharing {
  
  @js.native
  sealed trait Role extends StObject
  @JSGlobal("SP.Sharing.Role")
  @js.native
  object Role extends StObject {
    
    @js.native
    sealed trait edit
      extends StObject
         with Role
    
    @js.native
    sealed trait none
      extends StObject
         with Role
    
    @js.native
    sealed trait owner
      extends StObject
         with Role
    
    @js.native
    sealed trait view
      extends StObject
         with Role
  }
  
  trait DocumentSharingManager extends StObject
  
  trait UserRoleAssignment
    extends StObject
       with ClientValueObject {
    
    def get_role(): Role
    
    def get_userId(): String
    
    def set_role(value: Role): Unit
    
    def set_userId(value: String): Unit
  }
  object UserRoleAssignment {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_role: CallbackTo[Role],
      get_typeId: CallbackTo[String],
      get_userId: CallbackTo[String],
      set_role: Role => Callback,
      set_userId: String => Callback,
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): UserRoleAssignment = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_role = get_role.toJsFn, get_typeId = get_typeId.toJsFn, get_userId = get_userId.toJsFn, set_role = js.Any.fromFunction1((t0: Role) => set_role(t0).runNow()), set_userId = js.Any.fromFunction1((t0: String) => set_userId(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[UserRoleAssignment]
    }
    
    extension [Self <: UserRoleAssignment](x: Self) {
      
      inline def setGet_role(value: CallbackTo[Role]): Self = StObject.set(x, "get_role", value.toJsFn)
      
      inline def setGet_userId(value: CallbackTo[String]): Self = StObject.set(x, "get_userId", value.toJsFn)
      
      inline def setSet_role(value: Role => Callback): Self = StObject.set(x, "set_role", js.Any.fromFunction1((t0: Role) => value(t0).runNow()))
      
      inline def setSet_userId(value: String => Callback): Self = StObject.set(x, "set_userId", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait UserSharingResult
    extends StObject
       with ClientValueObject {
    
    def get_allowedRoles(): js.Array[Role]
    
    def get_currentRole(): Role
    
    def get_isUserKnown(): Boolean
    
    def get_message(): String
    
    def get_status(): Boolean
    
    def get_user(): String
  }
  object UserSharingResult {
    
    inline def apply(
      customFromJson: Any => Boolean,
      customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
      fromJson: Any => Callback,
      get_allowedRoles: CallbackTo[js.Array[Role]],
      get_currentRole: CallbackTo[Role],
      get_isUserKnown: CallbackTo[Boolean],
      get_message: CallbackTo[String],
      get_status: CallbackTo[Boolean],
      get_typeId: CallbackTo[String],
      get_user: CallbackTo[String],
      writeToXml: (XmlWriter, SerializationContext) => Callback
    ): UserSharingResult = {
      val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_allowedRoles = get_allowedRoles.toJsFn, get_currentRole = get_currentRole.toJsFn, get_isUserKnown = get_isUserKnown.toJsFn, get_message = get_message.toJsFn, get_status = get_status.toJsFn, get_typeId = get_typeId.toJsFn, get_user = get_user.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
      __obj.asInstanceOf[UserSharingResult]
    }
    
    extension [Self <: UserSharingResult](x: Self) {
      
      inline def setGet_allowedRoles(value: CallbackTo[js.Array[Role]]): Self = StObject.set(x, "get_allowedRoles", value.toJsFn)
      
      inline def setGet_currentRole(value: CallbackTo[Role]): Self = StObject.set(x, "get_currentRole", value.toJsFn)
      
      inline def setGet_isUserKnown(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_isUserKnown", value.toJsFn)
      
      inline def setGet_message(value: CallbackTo[String]): Self = StObject.set(x, "get_message", value.toJsFn)
      
      inline def setGet_status(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_status", value.toJsFn)
      
      inline def setGet_user(value: CallbackTo[String]): Self = StObject.set(x, "get_user", value.toJsFn)
    }
  }
}
