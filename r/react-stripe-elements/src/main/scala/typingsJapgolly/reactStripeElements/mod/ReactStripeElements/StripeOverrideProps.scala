package typingsJapgolly.reactStripeElements.mod.ReactStripeElements

import typingsJapgolly.stripeV3.stripe.BankAccountTokenOptions
import typingsJapgolly.stripeV3.stripe.CreatePaymentMethodOptions
import typingsJapgolly.stripeV3.stripe.HandleCardPaymentWithoutElementsOptions
import typingsJapgolly.stripeV3.stripe.HandleCardSetupOptions
import typingsJapgolly.stripeV3.stripe.PaymentIntentResponse
import typingsJapgolly.stripeV3.stripe.PaymentMethodData
import typingsJapgolly.stripeV3.stripe.PaymentMethodResponse
import typingsJapgolly.stripeV3.stripe.SetupIntentResponse
import typingsJapgolly.stripeV3.stripe.paymentMethod.paymentMethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeOverrideProps extends js.Object {
  def createPaymentMethod(data: PaymentMethodData): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement): js.Promise[PaymentMethodResponse] = js.native
  def createPaymentMethod(paymentMethodType: paymentMethodType, element: HTMLStripeElement, data: CreatePaymentMethodOptions): js.Promise[PaymentMethodResponse] = js.native
  def createSource(): js.Promise[SourceResponse] = js.native
  def createSource(sourceData: SourceOptions): js.Promise[SourceResponse] = js.native
  /*
    * react-stripe-elements let's you use the same createToken function
    * with either credit card or bank account options
    * which one to choose depends solely on the inferred elements and can't be expressed in TypeScript
    */
  def createToken(): js.Promise[TokenResponse] = js.native
  def createToken(options: TokenOptions): js.Promise[TokenResponse] = js.native
  def createToken(options: BankAccountTokenOptions): js.Promise[TokenResponse] = js.native
  def handleCardPayment(clientSecret: String): js.Promise[PaymentIntentResponse] = js.native
  def handleCardPayment(clientSecret: String, options: HandleCardPaymentWithoutElementsOptions): js.Promise[PaymentIntentResponse] = js.native
  def handleCardSetup(clientSecret: String): js.Promise[SetupIntentResponse] = js.native
  def handleCardSetup(clientSecret: String, data: HandleCardSetupOptions): js.Promise[SetupIntentResponse] = js.native
}

