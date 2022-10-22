package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import typingsJapgolly.openpay.mod.SDK.Customers.Subscriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customers extends StObject {
  
  var bankaccounts: typingsJapgolly.openpay.mod.SDK.Customers.BankAccounts
  
  var cards: typingsJapgolly.openpay.mod.SDK.Customers.Cards
  
  var charges: typingsJapgolly.openpay.mod.SDK.Customers.Charges
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(customerId: String, callback: Callback[Any]): Unit
  
  def get(customerId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
  
  var payouts: typingsJapgolly.openpay.mod.SDK.Customers.Payouts
  
  var subscriptions: Subscriptions
  
  var transfers: typingsJapgolly.openpay.mod.SDK.Customers.Transfers
  
  def update(customerId: String, callback: Callback[Any]): Unit
}
object Customers {
  
  inline def apply(
    bankaccounts: typingsJapgolly.openpay.mod.SDK.Customers.BankAccounts,
    cards: typingsJapgolly.openpay.mod.SDK.Customers.Cards,
    charges: typingsJapgolly.openpay.mod.SDK.Customers.Charges,
    create: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    delete: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    get: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
    list: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
    payouts: typingsJapgolly.openpay.mod.SDK.Customers.Payouts,
    subscriptions: Subscriptions,
    transfers: typingsJapgolly.openpay.mod.SDK.Customers.Transfers,
    update: (String, Callback[Any]) => japgolly.scalajs.react.Callback
  ): Customers = {
    val __obj = js.Dynamic.literal(bankaccounts = bankaccounts.asInstanceOf[js.Any], cards = cards.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], create = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (delete(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (get(t0, t1)).runNow()), list = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (list(t0, t1)).runNow()), payouts = payouts.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[Customers]
  }
  
  trait BankAccounts extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, bankId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, bankId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object BankAccounts {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      delete: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Customers.BankAccounts = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), delete = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (delete(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Customers.BankAccounts]
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Customers.BankAccounts](x: Self) {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDelete(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Cards extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, cardId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, cardId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Cards {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      delete: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Customers.Cards = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), delete = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (delete(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Customers.Cards]
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Customers.Cards](x: Self) {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDelete(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Charges extends StObject {
    
    def capture(customerId: String, transactionId: String, captureRequest: js.Object, callback: Callback[Any]): Unit
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def get(customerId: String, transactionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def refund(customerId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Charges {
    
    inline def apply(
      capture: (String, String, js.Object, Callback[Any]) => japgolly.scalajs.react.Callback,
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      refund: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Customers.Charges = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction4((t0: String, t1: String, t2: js.Object, t3: Callback[Any]) => (capture(t0, t1, t2, t3)).runNow()), create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()), refund = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (refund(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Customers.Charges]
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Customers.Charges](x: Self) {
      
      inline def setCapture(value: (String, String, js.Object, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "capture", js.Any.fromFunction4((t0: String, t1: String, t2: js.Object, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRefund(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "refund", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  extension [Self <: Customers](x: Self) {
    
    inline def setBankaccounts(value: typingsJapgolly.openpay.mod.SDK.Customers.BankAccounts): Self = StObject.set(x, "bankaccounts", value.asInstanceOf[js.Any])
    
    inline def setCards(value: typingsJapgolly.openpay.mod.SDK.Customers.Cards): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
    
    inline def setCharges(value: typingsJapgolly.openpay.mod.SDK.Customers.Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setDelete(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setGet(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setList(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
    
    inline def setPayouts(value: typingsJapgolly.openpay.mod.SDK.Customers.Payouts): Self = StObject.set(x, "payouts", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setTransfers(value: typingsJapgolly.openpay.mod.SDK.Customers.Transfers): Self = StObject.set(x, "transfers", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
  }
  
  trait Payouts extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def get(customerId: String, transactionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Payouts {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Customers.Payouts = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Customers.Payouts]
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Customers.Payouts](x: Self) {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Subscriptions extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def update(customerId: String, subscriptionId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Subscriptions {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      delete: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      update: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): Subscriptions = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), delete = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (delete(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()), update = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (update(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[Subscriptions]
    }
    
    extension [Self <: Subscriptions](x: Self) {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setDelete(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUpdate(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "update", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait Transfers extends StObject {
    
    def create(customerId: String, data: Any, callback: Callback[Any]): Unit
    
    def get(customerId: String, transactionId: String, callback: Callback[Any]): Unit
    
    def list(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Transfers {
    
    inline def apply(
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Customers.Transfers = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Customers.Transfers]
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Customers.Transfers](x: Self) {
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
    }
  }
}
