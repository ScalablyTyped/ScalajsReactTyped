package typingsJapgolly.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The error code that indicates whether an error on the payment sheet is for shipping or billing information, or for another kind of error.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.applepayjs.applepayjsStrings.shippingContactInvalid
  - typingsJapgolly.applepayjs.applepayjsStrings.billingContactInvalid
  - typingsJapgolly.applepayjs.applepayjsStrings.addressUnserviceable
  - typingsJapgolly.applepayjs.applepayjsStrings.unknown
*/
trait ApplePayErrorCode extends StObject
object ApplePayErrorCode {
  
  inline def addressUnserviceable: typingsJapgolly.applepayjs.applepayjsStrings.addressUnserviceable = "addressUnserviceable".asInstanceOf[typingsJapgolly.applepayjs.applepayjsStrings.addressUnserviceable]
  
  inline def billingContactInvalid: typingsJapgolly.applepayjs.applepayjsStrings.billingContactInvalid = "billingContactInvalid".asInstanceOf[typingsJapgolly.applepayjs.applepayjsStrings.billingContactInvalid]
  
  inline def shippingContactInvalid: typingsJapgolly.applepayjs.applepayjsStrings.shippingContactInvalid = "shippingContactInvalid".asInstanceOf[typingsJapgolly.applepayjs.applepayjsStrings.shippingContactInvalid]
  
  inline def unknown: typingsJapgolly.applepayjs.applepayjsStrings.unknown = "unknown".asInstanceOf[typingsJapgolly.applepayjs.applepayjsStrings.unknown]
}
