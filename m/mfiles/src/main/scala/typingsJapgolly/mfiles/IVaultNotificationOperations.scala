package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultNotificationOperations extends StObject {
  
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit
}
object IVaultNotificationOperations {
  
  inline def apply(
    SendCustomNotification: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Callback
  ): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal(SendCustomNotification = js.Any.fromFunction6((t0: IUserOrUserGroupIDs, t1: Boolean, t2: IStrings, t3: Boolean, t4: String, t5: String) => (SendCustomNotification(t0, t1, t2, t3, t4, t5)).runNow()))
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
  
  extension [Self <: IVaultNotificationOperations](x: Self) {
    
    inline def setSendCustomNotification(value: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Callback): Self = StObject.set(x, "SendCustomNotification", js.Any.fromFunction6((t0: IUserOrUserGroupIDs, t1: Boolean, t2: IStrings, t3: Boolean, t4: String, t5: String) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
  }
}
