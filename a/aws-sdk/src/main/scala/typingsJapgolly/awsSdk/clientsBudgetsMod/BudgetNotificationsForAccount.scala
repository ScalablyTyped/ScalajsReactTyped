package typingsJapgolly.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetNotificationsForAccount extends StObject {
  
  var BudgetName: js.UndefOr[typingsJapgolly.awsSdk.clientsBudgetsMod.BudgetName] = js.undefined
  
  var Notifications: js.UndefOr[typingsJapgolly.awsSdk.clientsBudgetsMod.Notifications] = js.undefined
}
object BudgetNotificationsForAccount {
  
  inline def apply(): BudgetNotificationsForAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BudgetNotificationsForAccount]
  }
  
  extension [Self <: BudgetNotificationsForAccount](x: Self) {
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setBudgetNameUndefined: Self = StObject.set(x, "BudgetName", js.undefined)
    
    inline def setNotifications(value: Notifications): Self = StObject.set(x, "Notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "Notifications", js.undefined)
    
    inline def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "Notifications", js.Array(value*))
  }
}
