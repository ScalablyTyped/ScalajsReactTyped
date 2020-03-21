package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Page/Section in the Guide
  */
trait ImplementationGuidePage extends BackboneElement {
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
    * Name of package to include
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[Element | String]] = js.undefined
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Format of the page (e.g. html, markdown, etc.)
    */
  var format: js.UndefOr[code] = js.undefined
  /**
    * page | example | list | include | directory | dictionary | toc | resource
    */
  var kind: code
  /**
    * Nested Pages / Sections
    */
  var page: js.UndefOr[js.Array[ImplementationGuidePage]] = js.undefined
  /**
    * Where to find that page
    */
  var source: uri
  /**
    * Short title shown for navigational assistance
    */
  var title: String
  /**
    * Kind of resource to include in the list
    */
  var `type`: js.UndefOr[js.Array[code]] = js.undefined
}

object ImplementationGuidePage {
  @scala.inline
  def apply(
    kind: code,
    source: uri,
    title: String,
    _fhir_comments: js.Array[Element] = null,
    _format: Element = null,
    _id: Element = null,
    _kind: Element = null,
    _package: js.Array[Element | String] = null,
    _source: Element = null,
    _title: Element = null,
    _type: js.Array[Element] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    format: code = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    page: js.Array[ImplementationGuidePage] = null,
    `type`: js.Array[code] = null
  ): ImplementationGuidePage = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_format != null) __obj.updateDynamic("_format")(_format.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_kind != null) __obj.updateDynamic("_kind")(_kind.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_type != null) __obj.updateDynamic("_type")(_type.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuidePage]
  }
}

