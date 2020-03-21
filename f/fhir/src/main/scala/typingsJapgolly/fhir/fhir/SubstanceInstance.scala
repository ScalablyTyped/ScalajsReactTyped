package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this describes a specific package/container of the substance
  */
trait SubstanceInstance extends BackboneElement {
  /**
    * Contains extended information for property 'expiry'.
    */
  var _expiry: js.UndefOr[Element] = js.undefined
  /**
    * When no longer valid to use
    */
  var expiry: js.UndefOr[dateTime] = js.undefined
  /**
    * Identifier of the package/container
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Amount of substance in the package
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}

object SubstanceInstance {
  @scala.inline
  def apply(
    _expiry: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    expiry: dateTime = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    identifier: Identifier = null,
    modifierExtension: js.Array[Extension] = null,
    quantity: Quantity = null
  ): SubstanceInstance = {
    val __obj = js.Dynamic.literal()
    if (_expiry != null) __obj.updateDynamic("_expiry")(_expiry.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstanceInstance]
  }
}

