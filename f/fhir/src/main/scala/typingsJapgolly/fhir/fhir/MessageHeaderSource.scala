package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message source application
  */
trait MessageHeaderSource extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'software'.
    */
  var _software: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Human contact for problems
    */
  var contact: js.UndefOr[ContactPoint] = js.undefined
  /**
    * Actual message source address or id
    */
  var endpoint: uri
  /**
    * Name of system
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Name of software running the system
    */
  var software: js.UndefOr[String] = js.undefined
  /**
    * Version of software running
    */
  var version: js.UndefOr[String] = js.undefined
}

object MessageHeaderSource {
  @scala.inline
  def apply(
    endpoint: uri,
    _endpoint: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _software: Element = null,
    _version: Element = null,
    contact: ContactPoint = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    software: String = null,
    version: String = null
  ): MessageHeaderSource = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (_endpoint != null) __obj.updateDynamic("_endpoint")(_endpoint.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_name != null) __obj.updateDynamic("_name")(_name.asInstanceOf[js.Any])
    if (_software != null) __obj.updateDynamic("_software")(_software.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (software != null) __obj.updateDynamic("software")(software.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderSource]
  }
}

