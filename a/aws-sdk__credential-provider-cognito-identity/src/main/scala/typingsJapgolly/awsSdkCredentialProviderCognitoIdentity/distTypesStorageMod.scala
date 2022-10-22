package typingsJapgolly.awsSdkCredentialProviderCognitoIdentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStorageMod {
  
  trait Storage extends StObject {
    
    def getItem(key: String): String | Null | (js.Promise[String | Null])
    
    def removeItem(key: String): Unit | js.Promise[Unit]
    
    def setItem(key: String, data: String): Unit | js.Promise[Unit]
  }
  object Storage {
    
    inline def apply(
      getItem: String => String | Null | (js.Promise[String | Null]),
      removeItem: String => Unit | js.Promise[Unit],
      setItem: (String, String) => Unit | js.Promise[Unit]
    ): Storage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[Storage]
    }
    
    extension [Self <: Storage](x: Self) {
      
      inline def setGetItem(value: String => String | Null | (js.Promise[String | Null])): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => Unit | js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => Unit | js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
