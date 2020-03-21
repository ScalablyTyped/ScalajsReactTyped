package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transaction Related Information
  */
trait BundleEntryResponse extends BackboneElement {
  /**
    * Contains extended information for property 'etag'.
    */
  var _etag: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'lastModified'.
    */
  var _lastModified: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'location'.
    */
  var _location: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The etag for the resource (if relevant)
    */
  var etag: js.UndefOr[String] = js.undefined
  /**
    * Server's date time modified
    */
  var lastModified: js.UndefOr[instant] = js.undefined
  /**
    * The location, if the operation returns a location
    */
  var location: js.UndefOr[uri] = js.undefined
  /**
    * OperationOutcome with hints and warnings (for batch/transaction)
    */
  var outcome: js.UndefOr[Resource] = js.undefined
  /**
    * Status response code (text optional)
    */
  var status: String
}

object BundleEntryResponse {
  @scala.inline
  def apply(
    status: String,
    _etag: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _lastModified: Element = null,
    _location: Element = null,
    _status: Element = null,
    etag: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    lastModified: instant = null,
    location: uri = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: Resource = null
  ): BundleEntryResponse = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_etag != null) __obj.updateDynamic("_etag")(_etag.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_lastModified != null) __obj.updateDynamic("_lastModified")(_lastModified.asInstanceOf[js.Any])
    if (_location != null) __obj.updateDynamic("_location")(_location.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleEntryResponse]
  }
}

