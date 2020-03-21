package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fixture in the test script - by reference (uri)
  */
trait TestScriptFixture extends BackboneElement {
  /**
    * Contains extended information for property 'autocreate'.
    */
  var _autocreate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'autodelete'.
    */
  var _autodelete: js.UndefOr[Element] = js.undefined
  /**
    * Whether or not to implicitly create the fixture during setup
    */
  var autocreate: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether or not to implicitly delete the fixture during teardown
    */
  var autodelete: js.UndefOr[Boolean] = js.undefined
  /**
    * Reference of the resource
    */
  var resource: js.UndefOr[Reference] = js.undefined
}

object TestScriptFixture {
  @scala.inline
  def apply(
    _autocreate: Element = null,
    _autodelete: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    autocreate: js.UndefOr[Boolean] = js.undefined,
    autodelete: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    resource: Reference = null
  ): TestScriptFixture = {
    val __obj = js.Dynamic.literal()
    if (_autocreate != null) __obj.updateDynamic("_autocreate")(_autocreate.asInstanceOf[js.Any])
    if (_autodelete != null) __obj.updateDynamic("_autodelete")(_autodelete.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (!js.isUndefined(autocreate)) __obj.updateDynamic("autocreate")(autocreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autodelete)) __obj.updateDynamic("autodelete")(autodelete.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptFixture]
  }
}

