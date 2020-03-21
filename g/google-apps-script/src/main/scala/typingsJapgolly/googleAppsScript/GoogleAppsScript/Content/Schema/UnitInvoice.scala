package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitInvoice extends js.Object {
  var additionalCharges: js.UndefOr[js.Array[UnitInvoiceAdditionalCharge]] = js.undefined
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  var unitPricePretax: js.UndefOr[Price] = js.undefined
  var unitPriceTaxes: js.UndefOr[js.Array[UnitInvoiceTaxLine]] = js.undefined
}

object UnitInvoice {
  @scala.inline
  def apply(
    additionalCharges: js.Array[UnitInvoiceAdditionalCharge] = null,
    promotions: js.Array[Promotion] = null,
    unitPricePretax: Price = null,
    unitPriceTaxes: js.Array[UnitInvoiceTaxLine] = null
  ): UnitInvoice = {
    val __obj = js.Dynamic.literal()
    if (additionalCharges != null) __obj.updateDynamic("additionalCharges")(additionalCharges.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (unitPricePretax != null) __obj.updateDynamic("unitPricePretax")(unitPricePretax.asInstanceOf[js.Any])
    if (unitPriceTaxes != null) __obj.updateDynamic("unitPriceTaxes")(unitPriceTaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitInvoice]
  }
}

