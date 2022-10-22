package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseAppTypes.privateMod.FirebaseAuthTokenData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthTokenProvider extends StObject {
  
  def addTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
  
  def getToken(forceRefresh: Boolean): js.Promise[FirebaseAuthTokenData]
  
  def notifyForInvalidToken(): Unit
  
  def removeTokenChangeListener(listener: js.Function1[/* token */ String | Null, Unit]): Unit
}
object AuthTokenProvider {
  
  inline def apply(
    addTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Callback,
    getToken: Boolean => js.Promise[FirebaseAuthTokenData],
    notifyForInvalidToken: Callback,
    removeTokenChangeListener: js.Function1[/* token */ String | Null, Unit] => Callback
  ): AuthTokenProvider = {
    val __obj = js.Dynamic.literal(addTokenChangeListener = js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => addTokenChangeListener(t0).runNow()), getToken = js.Any.fromFunction1(getToken), notifyForInvalidToken = notifyForInvalidToken.toJsFn, removeTokenChangeListener = js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => removeTokenChangeListener(t0).runNow()))
    __obj.asInstanceOf[AuthTokenProvider]
  }
  
  extension [Self <: AuthTokenProvider](x: Self) {
    
    inline def setAddTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Callback): Self = StObject.set(x, "addTokenChangeListener", js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => value(t0).runNow()))
    
    inline def setGetToken(value: Boolean => js.Promise[FirebaseAuthTokenData]): Self = StObject.set(x, "getToken", js.Any.fromFunction1(value))
    
    inline def setNotifyForInvalidToken(value: Callback): Self = StObject.set(x, "notifyForInvalidToken", value.toJsFn)
    
    inline def setRemoveTokenChangeListener(value: js.Function1[/* token */ String | Null, Unit] => Callback): Self = StObject.set(x, "removeTokenChangeListener", js.Any.fromFunction1((t0: js.Function1[/* token */ String | Null, Unit]) => value(t0).runNow()))
  }
}
