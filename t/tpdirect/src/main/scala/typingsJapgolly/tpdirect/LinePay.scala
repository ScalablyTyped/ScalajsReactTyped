package typingsJapgolly.tpdirect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePay extends StObject {
  
  def getPrime(callback: js.Function1[/* result */ LinePayGetPrimeResult, Unit]): Unit
}
object LinePay {
  
  inline def apply(getPrime: js.Function1[/* result */ LinePayGetPrimeResult, Unit] => Callback): LinePay = {
    val __obj = js.Dynamic.literal(getPrime = js.Any.fromFunction1((t0: js.Function1[/* result */ LinePayGetPrimeResult, Unit]) => getPrime(t0).runNow()))
    __obj.asInstanceOf[LinePay]
  }
  
  extension [Self <: LinePay](x: Self) {
    
    inline def setGetPrime(value: js.Function1[/* result */ LinePayGetPrimeResult, Unit] => Callback): Self = StObject.set(x, "getPrime", js.Any.fromFunction1((t0: js.Function1[/* result */ LinePayGetPrimeResult, Unit]) => value(t0).runNow()))
  }
}
