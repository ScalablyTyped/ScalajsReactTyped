package typingsJapgolly.stripeV2.stripe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.stripeV2.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeApplePay extends js.Object {
  def buildSession(
    data: StripeApplePayPaymentRequest,
    onSuccessHandler: js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ],
    onErrorHanlder: js.Function1[/* error */ AnonMessage, Unit]
  ): js.Any
  def checkAvailability(resopnseHandler: js.Function1[/* result */ Boolean, Unit]): Unit
}

object StripeApplePay {
  @scala.inline
  def apply(
    buildSession: (StripeApplePayPaymentRequest, js.Function2[
      /* result */ StripeApplePaySessionResult, 
      /* completion */ js.Function1[/* value */ js.Any, Unit], 
      Unit
    ], js.Function1[/* error */ AnonMessage, Unit]) => CallbackTo[js.Any],
    checkAvailability: js.Function1[/* result */ Boolean, Unit] => Callback
  ): StripeApplePay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildSession")(js.Any.fromFunction3((t0: typingsJapgolly.stripeV2.stripe.StripeApplePayPaymentRequest, t1: js.Function2[
  /* result */ typingsJapgolly.stripeV2.stripe.StripeApplePaySessionResult, 
  /* completion */ js.Function1[/* value */ js.Any, scala.Unit], 
  scala.Unit], t2: js.Function1[/* error */ typingsJapgolly.stripeV2.AnonMessage, scala.Unit]) => buildSession(t0, t1, t2).runNow()))
    __obj.updateDynamic("checkAvailability")(js.Any.fromFunction1((t0: js.Function1[/* result */ scala.Boolean, scala.Unit]) => checkAvailability(t0).runNow()))
    __obj.asInstanceOf[StripeApplePay]
  }
}

