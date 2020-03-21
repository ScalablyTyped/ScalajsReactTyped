package typingsJapgolly.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationPropertiesChangeEventArgs extends js.Object {
  /** Returns the id of the annotation added in the page of the PDF document.
    */
  var annotationID: js.UndefOr[Double] = js.undefined
  /** Returns the type of the annotation added in the page of the PDF document.
    */
  var annotationType: js.UndefOr[String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Specifies that the color of the annotation is changed.
    */
  var isColorChanged: js.UndefOr[Boolean] = js.undefined
  /** Specifies that the opacity of the annotation is changed.
    */
  var isOpacityChanged: js.UndefOr[Boolean] = js.undefined
  /** Returns the PDF viewer model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the page number in which the annotation is added.
    */
  var pageID: js.UndefOr[Double] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object AnnotationPropertiesChangeEventArgs {
  @scala.inline
  def apply(
    annotationID: Int | Double = null,
    annotationType: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    isColorChanged: js.UndefOr[Boolean] = js.undefined,
    isOpacityChanged: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    pageID: Int | Double = null,
    `type`: String = null
  ): AnnotationPropertiesChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (annotationID != null) __obj.updateDynamic("annotationID")(annotationID.asInstanceOf[js.Any])
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(isColorChanged)) __obj.updateDynamic("isColorChanged")(isColorChanged.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpacityChanged)) __obj.updateDynamic("isOpacityChanged")(isOpacityChanged.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (pageID != null) __obj.updateDynamic("pageID")(pageID.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationPropertiesChangeEventArgs]
  }
}

