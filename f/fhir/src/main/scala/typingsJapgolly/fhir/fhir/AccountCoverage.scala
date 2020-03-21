package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
  */
trait AccountCoverage extends BackboneElement {
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
    * The party(s) that are responsible for covering the payment of this account
    */
  var coverage: Reference
  /**
    * The priority of the coverage in the context of this account
    */
  var priority: js.UndefOr[positiveInt] = js.undefined
}

object AccountCoverage {
  @scala.inline
  def apply(
    coverage: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _priority: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    priority: Int | Double = null
  ): AccountCoverage = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountCoverage]
  }
}

