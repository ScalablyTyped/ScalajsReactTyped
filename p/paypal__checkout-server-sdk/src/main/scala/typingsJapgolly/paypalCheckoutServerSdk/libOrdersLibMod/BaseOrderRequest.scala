package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.CONNECT
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.DELETE
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.GET
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.HEAD
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.OPTIONS
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.PATCH
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.POST
import typingsJapgolly.paypalCheckoutServerSdk.paypalCheckoutServerSdkStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "BaseOrderRequest")
@js.native
open class BaseOrderRequest[H /* <: BaseOrderHeaders */, B] protected () extends StObject {
  def this(orderId: String) = this()
  
  val body: B = js.native
  
  val headers: H = js.native
  
  val path: String = js.native
  
  val verb: CONNECT | DELETE | GET | HEAD | OPTIONS | PATCH | POST | PUT = js.native
}
