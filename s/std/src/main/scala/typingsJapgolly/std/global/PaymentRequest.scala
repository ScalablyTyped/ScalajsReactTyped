package typingsJapgolly.std.global

import typingsJapgolly.std.PaymentDetailsInit
import typingsJapgolly.std.PaymentMethodData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PaymentRequest")
@js.native
open class PaymentRequest protected ()
  extends StObject
     with typingsJapgolly.std.PaymentRequest {
  /* standard dom */
  def this(methodData: js.Array[PaymentMethodData], details: PaymentDetailsInit) = this()
}
