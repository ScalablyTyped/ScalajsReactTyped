package typingsJapgolly.stripeV2.stripe

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripeV2.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeApplePay extends StObject {
  
  def buildSession(
    data: StripeApplePayPaymentRequest,
    onSuccessHandler: js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ Any, Unit], 
      Unit
    ],
    onErrorHanlder: js.Function1[/* error */ Message, Unit]
  ): Any
  
  def checkAvailability(resopnseHandler: js.Function1[/* result */ Boolean, Unit]): Unit
}
object StripeApplePay {
  
  inline def apply(
    buildSession: (StripeApplePayPaymentRequest, js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ Any, Unit], 
      Unit
    ], js.Function1[/* error */ Message, Unit]) => Any,
    checkAvailability: js.Function1[/* result */ Boolean, Unit] => Callback
  ): StripeApplePay = {
    val __obj = js.Dynamic.literal(buildSession = js.Any.fromFunction3(buildSession), checkAvailability = js.Any.fromFunction1((t0: js.Function1[/* result */ Boolean, Unit]) => checkAvailability(t0).runNow()))
    __obj.asInstanceOf[StripeApplePay]
  }
  
  extension [Self <: StripeApplePay](x: Self) {
    
    inline def setBuildSession(
      value: (StripeApplePayPaymentRequest, js.Function2[
          /* result */ StripeApplePaySessionResult, 
          /* completion */ js.Function1[/* value */ Any, Unit], 
          Unit
        ], js.Function1[/* error */ Message, Unit]) => Any
    ): Self = StObject.set(x, "buildSession", js.Any.fromFunction3(value))
    
    inline def setCheckAvailability(value: js.Function1[/* result */ Boolean, Unit] => Callback): Self = StObject.set(x, "checkAvailability", js.Any.fromFunction1((t0: js.Function1[/* result */ Boolean, Unit]) => value(t0).runNow()))
  }
}
