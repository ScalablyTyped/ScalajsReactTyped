package typingsJapgolly.jqueryCropbox.jQueryCropBox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cropbox extends js.Object {
  /**
    * Simulate image dragging, starting from (startX,startY) and moving a delta of (dx,dy). Need to call update to reflect the changes.
    */
  def drag(options: CropboxDragOptions): Unit
  /**
    * Generate a Blob with the cropped image (requires HTML5 compliant browser).
    */
  def getBlob(): js.Any
  /**
    * Generate a URL for the cropped image on the client (requires HTML5 compliant browser).
    */
  def getDataURL(): String
  /**
    * Attach an event handler function for one event on the Crop Box
    */
  def on(event: String, callback: EventCallback): Unit
  /**
    * Remove the cropbox functionality from the image.
    */
  def remove(): Unit
  /**
    * Set crop window.
    */
  def setCrop(options: CropboxSetCropOptions): Unit
  /**
    * Update the cropped result (must call after zoom and drag).
    */
  def update(): Unit
  /**
    * Set zoom leevl to a value between 0 and 1. Need to call update to reflect the changes.
    */
  def zoom(percent: Double): Unit
  /**
    * Increase image zoom level by one step
    */
  def zoomIn(): Unit
  /**
    * Decrease image zoom level by one step
    */
  def zoomOut(): Unit
}

object Cropbox {
  @scala.inline
  def apply(
    drag: CropboxDragOptions => Callback,
    getBlob: CallbackTo[js.Any],
    getDataURL: CallbackTo[String],
    on: (String, EventCallback) => Callback,
    remove: Callback,
    setCrop: CropboxSetCropOptions => Callback,
    update: Callback,
    zoom: Double => Callback,
    zoomIn: Callback,
    zoomOut: Callback
  ): Cropbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryCropbox.jQueryCropBox.CropboxDragOptions) => drag(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getDataURL")(getDataURL.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jqueryCropbox.jQueryCropBox.EventCallback) => on(t0, t1).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setCrop")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryCropbox.jQueryCropBox.CropboxSetCropOptions) => setCrop(t0).runNow()))
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: scala.Double) => zoom(t0).runNow()))
    __obj.updateDynamic("zoomIn")(zoomIn.toJsFn)
    __obj.updateDynamic("zoomOut")(zoomOut.toJsFn)
    __obj.asInstanceOf[Cropbox]
  }
}

