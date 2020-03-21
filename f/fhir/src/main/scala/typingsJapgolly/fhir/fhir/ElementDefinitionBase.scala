package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base definition information for tools
  */
trait ElementDefinitionBase extends Element {
  /**
    * Contains extended information for property 'max'.
    */
  var _max: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'min'.
    */
  var _min: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Max cardinality of the base element
    */
  var max: String
  /**
    * Min cardinality of the base element
    */
  var min: unsignedInt
  /**
    * Path that identifies the base element
    */
  var path: String
}

object ElementDefinitionBase {
  @scala.inline
  def apply(
    max: String,
    min: unsignedInt,
    path: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _max: Element = null,
    _min: Element = null,
    _path: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null
  ): ElementDefinitionBase = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_max != null) __obj.updateDynamic("_max")(_max.asInstanceOf[js.Any])
    if (_min != null) __obj.updateDynamic("_min")(_min.asInstanceOf[js.Any])
    if (_path != null) __obj.updateDynamic("_path")(_path.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBase]
  }
}

