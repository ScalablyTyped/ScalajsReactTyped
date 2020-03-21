package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time range defined by start and end date/time
  */
trait Period extends Element {
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'start'.
    */
  var _start: js.UndefOr[Element] = js.undefined
  /**
    * End time with inclusive boundary, if not ongoing
    */
  var end: js.UndefOr[dateTime] = js.undefined
  /**
    * Starting time with inclusive boundary
    */
  var start: js.UndefOr[dateTime] = js.undefined
}

object Period {
  @scala.inline
  def apply(
    _end: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _start: Element = null,
    end: dateTime = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    start: dateTime = null
  ): Period = {
    val __obj = js.Dynamic.literal()
    if (_end != null) __obj.updateDynamic("_end")(_end.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_start != null) __obj.updateDynamic("_start")(_start.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Period]
  }
}

