package typingsJapgolly.stripe.mod.customerTaxIds

import typingsJapgolly.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.stripeStrings.au_abn
  - typingsJapgolly.stripe.stripeStrings.eu_vat
  - typingsJapgolly.stripe.stripeStrings.in_gst
  - typingsJapgolly.stripe.stripeStrings.no_vat
  - typingsJapgolly.stripe.stripeStrings.nz_gst
  - typingsJapgolly.stripe.stripeStrings.unknown_
*/
trait TaxIdType extends js.Object

object TaxIdType {
  @scala.inline
  def au_abn: typingsJapgolly.stripe.stripeStrings.au_abn = this.cast("au_abn")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eu_vat: typingsJapgolly.stripe.stripeStrings.eu_vat = this.cast("eu_vat")
  @scala.inline
  def in_gst: typingsJapgolly.stripe.stripeStrings.in_gst = this.cast("in_gst")
  @scala.inline
  def no_vat: typingsJapgolly.stripe.stripeStrings.no_vat = this.cast("no_vat")
  @scala.inline
  def nz_gst: typingsJapgolly.stripe.stripeStrings.nz_gst = this.cast("nz_gst")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

