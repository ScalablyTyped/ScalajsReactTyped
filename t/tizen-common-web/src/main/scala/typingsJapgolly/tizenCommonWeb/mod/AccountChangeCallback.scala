package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountChangeCallback extends StObject {
  
  /**
    * Called when an account is added.
    *
    * @param account Added account information.
    */
  def onadded(account: Account_): Unit
  
  /**
    * Called when an account is removed.
    *
    * @param accountId ID of the removed account.
    */
  def onremoved(accountId: AccountId): Unit
  
  /**
    * Called when an account is updated.
    *
    * @param account Updated account information.
    */
  def onupdated(account: Account_): Unit
}
object AccountChangeCallback {
  
  inline def apply(onadded: Account_ => Callback, onremoved: AccountId => Callback, onupdated: Account_ => Callback): AccountChangeCallback = {
    val __obj = js.Dynamic.literal(onadded = js.Any.fromFunction1((t0: Account_) => onadded(t0).runNow()), onremoved = js.Any.fromFunction1((t0: AccountId) => onremoved(t0).runNow()), onupdated = js.Any.fromFunction1((t0: Account_) => onupdated(t0).runNow()))
    __obj.asInstanceOf[AccountChangeCallback]
  }
  
  extension [Self <: AccountChangeCallback](x: Self) {
    
    inline def setOnadded(value: Account_ => Callback): Self = StObject.set(x, "onadded", js.Any.fromFunction1((t0: Account_) => value(t0).runNow()))
    
    inline def setOnremoved(value: AccountId => Callback): Self = StObject.set(x, "onremoved", js.Any.fromFunction1((t0: AccountId) => value(t0).runNow()))
    
    inline def setOnupdated(value: Account_ => Callback): Self = StObject.set(x, "onupdated", js.Any.fromFunction1((t0: Account_) => value(t0).runNow()))
  }
}
