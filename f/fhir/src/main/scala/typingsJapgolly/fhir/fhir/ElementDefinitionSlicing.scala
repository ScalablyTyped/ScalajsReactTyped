package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This element is sliced - slices follow
  */
trait ElementDefinitionSlicing extends Element {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'ordered'.
    */
  var _ordered: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rules'.
    */
  var _rules: js.UndefOr[Element] = js.undefined
  /**
    * Text description of how slicing works (or not)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Element values that are used to distinguish the slices
    */
  var discriminator: js.UndefOr[js.Array[ElementDefinitionSlicingDiscriminator]] = js.undefined
  /**
    * If elements must be in same order as slices
    */
  var ordered: js.UndefOr[Boolean] = js.undefined
  /**
    * closed | open | openAtEnd
    */
  var rules: code
}

object ElementDefinitionSlicing {
  @scala.inline
  def apply(
    rules: code,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _ordered: Element = null,
    _rules: Element = null,
    description: String = null,
    discriminator: js.Array[ElementDefinitionSlicingDiscriminator] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    ordered: js.UndefOr[Boolean] = js.undefined
  ): ElementDefinitionSlicing = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_ordered != null) __obj.updateDynamic("_ordered")(_ordered.asInstanceOf[js.Any])
    if (_rules != null) __obj.updateDynamic("_rules")(_rules.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (discriminator != null) __obj.updateDynamic("discriminator")(discriminator.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicing]
  }
}

