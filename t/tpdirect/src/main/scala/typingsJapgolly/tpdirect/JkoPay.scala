package typingsJapgolly.tpdirect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JkoPay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ BaseResult, Unit]): Unit
}
object JkoPay {
  
  inline def apply(getPrime: js.Function1[/* result */ BaseResult, Unit] => Callback): JkoPay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1((t0: js.Function1[/* result */ BaseResult, Unit]) => getPrime(t0).runNow()))
    __obj.asInstanceOf[JkoPay]
  }
  
  extension [Self <: JkoPay](x: Self) {
    
    inline def setGetPrime(value: js.Function1[/* result */ BaseResult, Unit] => Callback): Self = StObject.set(x, "getPrime", js.Any.fromFunction1((t0: js.Function1[/* result */ BaseResult, Unit]) => value(t0).runNow()))
  }
}
