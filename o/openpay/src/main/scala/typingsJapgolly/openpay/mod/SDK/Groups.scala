package typingsJapgolly.openpay.mod.SDK

import typingsJapgolly.openpay.mod.Callback
import typingsJapgolly.openpay.mod.SDK.Groups.Customers.Subscriptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var charges: typingsJapgolly.openpay.mod.SDK.Groups.Charges
  
  var customers: typingsJapgolly.openpay.mod.SDK.Groups.Customers
}
object Groups {
  
  inline def apply(
    charges: typingsJapgolly.openpay.mod.SDK.Groups.Charges,
    customers: typingsJapgolly.openpay.mod.SDK.Groups.Customers
  ): Groups = {
    val __obj = js.Dynamic.literal(charges = charges.asInstanceOf[js.Any], customers = customers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  trait Charges extends StObject {
    
    def capture(merchantId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
    
    def create(merchantId: String, data: Any, callback: Callback[Any]): Unit
    
    def refund(merchantId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Charges {
    
    inline def apply(
      capture: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      create: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      refund: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Groups.Charges = {
      val __obj = js.Dynamic.literal(capture = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (capture(t0, t1, t2, t3)).runNow()), create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), refund = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (refund(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Groups.Charges]
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Groups.Charges](x: Self) {
      
      inline def setCapture(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "capture", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRefund(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "refund", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait Customers extends StObject {
    
    var cards: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Cards
    
    var charges: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Charges
    
    def create(data: Any, callback: Callback[Any]): Unit
    
    def delete(customerId: String, callback: Callback[Any]): Unit
    
    def get(customerId: String, callback: Callback[Any]): Unit
    
    def list(data: Any, callback: Callback[Any]): Unit
    
    var subscriptions: Subscriptions
    
    def update(customerId: String, data: Any, callback: Callback[Any]): Unit
  }
  object Customers {
    
    inline def apply(
      cards: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Cards,
      charges: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Charges,
      create: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      delete: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
      get: (String, Callback[Any]) => japgolly.scalajs.react.Callback,
      list: (Any, Callback[Any]) => japgolly.scalajs.react.Callback,
      subscriptions: Subscriptions,
      update: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
    ): typingsJapgolly.openpay.mod.SDK.Groups.Customers = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], charges = charges.asInstanceOf[js.Any], create = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (create(t0, t1)).runNow()), delete = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (delete(t0, t1)).runNow()), get = js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (get(t0, t1)).runNow()), list = js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (list(t0, t1)).runNow()), subscriptions = subscriptions.asInstanceOf[js.Any], update = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (update(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Groups.Customers]
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
      ): typingsJapgolly.openpay.mod.SDK.Groups.Customers.Cards = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (create(t0, t1, t2)).runNow()), delete = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (delete(t0, t1, t2)).runNow()), get = js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (get(t0, t1, t2)).runNow()), list = js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (list(t0, t1, t2)).runNow()))
        __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Groups.Customers.Cards]
      }
      
      extension [Self <: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Cards](x: Self) {
        
        inline def setCreate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setDelete(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setGet(value: (String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction3((t0: String, t1: String, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
        
        inline def setList(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
      }
    }
    
    trait Charges extends StObject {
      
      def capture(merchantId: String, customerId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
      
      def create(merchantId: String, customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def refund(merchantId: String, customerId: String, transactionId: String, data: Any, callback: Callback[Any]): Unit
    }
    object Charges {
      
      inline def apply(
        capture: (String, String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
        create: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
        refund: (String, String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
      ): typingsJapgolly.openpay.mod.SDK.Groups.Customers.Charges = {
        val __obj = js.Dynamic.literal(capture = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: Any, t4: Callback[Any]) => (capture(t0, t1, t2, t3, t4)).runNow()), create = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (create(t0, t1, t2, t3)).runNow()), refund = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: Any, t4: Callback[Any]) => (refund(t0, t1, t2, t3, t4)).runNow()))
        __obj.asInstanceOf[typingsJapgolly.openpay.mod.SDK.Groups.Customers.Charges]
      }
      
      extension [Self <: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Charges](x: Self) {
        
        inline def setCapture(value: (String, String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "capture", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: Any, t4: Callback[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
        
        inline def setCreate(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
        
        inline def setRefund(value: (String, String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "refund", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: Any, t4: Callback[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
      }
    }
    
    extension [Self <: typingsJapgolly.openpay.mod.SDK.Groups.Customers](x: Self) {
      
      inline def setCards(value: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Cards): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCharges(value: typingsJapgolly.openpay.mod.SDK.Groups.Customers.Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setDelete(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setGet(value: (String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction2((t0: String, t1: Callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setList(value: (Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction2((t0: Any, t1: Callback[Any]) => (value(t0, t1)).runNow()))
      
      inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: (String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: String, t1: Any, t2: Callback[Any]) => (value(t0, t1, t2)).runNow()))
    }
    
    trait Subscriptions extends StObject {
      
      def create(merchantId: String, customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def delete(merchantId: String, customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
      
      def get(merchantId: String, customerId: String, subscriptionId: String, callback: Callback[Any]): Unit
      
      def list(merchantId: String, customerId: String, data: Any, callback: Callback[Any]): Unit
      
      def update(merchantId: String, customerId: String, subscriptionId: String, data: Any, callback: Callback[Any]): Unit
    }
    object Subscriptions {
      
      inline def apply(
        create: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
        delete: (String, String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
        get: (String, String, String, Callback[Any]) => japgolly.scalajs.react.Callback,
        list: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback,
        update: (String, String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback
      ): Subscriptions = {
        val __obj = js.Dynamic.literal(create = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (create(t0, t1, t2, t3)).runNow()), delete = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Callback[Any]) => (delete(t0, t1, t2, t3)).runNow()), get = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Callback[Any]) => (get(t0, t1, t2, t3)).runNow()), list = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (list(t0, t1, t2, t3)).runNow()), update = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: Any, t4: Callback[Any]) => (update(t0, t1, t2, t3, t4)).runNow()))
        __obj.asInstanceOf[Subscriptions]
      }
      
      extension [Self <: Subscriptions](x: Self) {
        
        inline def setCreate(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "create", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
        
        inline def setDelete(value: (String, String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "delete", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
        
        inline def setGet(value: (String, String, String, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "get", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
        
        inline def setList(value: (String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "list", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: Callback[Any]) => (value(t0, t1, t2, t3)).runNow()))
        
        inline def setUpdate(value: (String, String, String, Any, Callback[Any]) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "update", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: Any, t4: Callback[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
      }
    }
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setCharges(value: typingsJapgolly.openpay.mod.SDK.Groups.Charges): Self = StObject.set(x, "charges", value.asInstanceOf[js.Any])
    
    inline def setCustomers(value: typingsJapgolly.openpay.mod.SDK.Groups.Customers): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
  }
}
