package typingsJapgolly.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ApplePayShippingMethodSelectedEvent class defines the attribute contained by the ApplePaySession.onshippingmethodselected callback function.
  */
@JSGlobal("ApplePayJS.ApplePayShippingMethodSelectedEvent")
@js.native
abstract class ApplePayShippingMethodSelectedEvent () extends Event {
  /**
    * The shipping method selected by the user.
    */
  val shippingMethod: ApplePayShippingMethod = js.native
}

