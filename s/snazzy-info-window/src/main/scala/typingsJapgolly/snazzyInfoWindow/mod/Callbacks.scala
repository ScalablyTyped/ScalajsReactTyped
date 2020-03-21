package typingsJapgolly.snazzyInfoWindow.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  /**
    * Called after the info window has closed.
    * This occurs at the end of the OverlayView onRemove() implementation.
    * At this point the info window should be removed from the DOM.
    */
  var afterClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
  /**
    * Called when the info window has opened.
    * This occurs at the end of the OverlayView draw() implementation.
    * At this point the info window is added to the DOM and should be visible.
    */
  var afterOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
  /**
    * Called before the info window attempts to close.
    * Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
  /**
    * Called before the info window attempts to open.
    * Return false to cancel the open.
    */
  var beforeOpen: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
  /**
    * Called when the info window is closing.
    * This occurs at the beginning of the OverlayView onRemove() implementation.
    * At this point the info window is still in the DOM.
    */
  var close: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
  /**
    * Called when the info window is opening.
    * This occurs at the end of the OverlayView onAdd() implementation.
    * At this point the info window is added to the DOM but is not drawn yet.
    */
  var open: js.UndefOr[js.Function0[Boolean | Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    afterClose: js.UndefOr[CallbackTo[Boolean | Unit]] = js.undefined,
    afterOpen: js.UndefOr[CallbackTo[Boolean | Unit]] = js.undefined,
    beforeClose: js.UndefOr[CallbackTo[Boolean | Unit]] = js.undefined,
    beforeOpen: js.UndefOr[CallbackTo[Boolean | Unit]] = js.undefined,
    close: js.UndefOr[CallbackTo[Boolean | Unit]] = js.undefined,
    open: js.UndefOr[CallbackTo[Boolean | Unit]] = js.undefined
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    afterClose.foreach(p => __obj.updateDynamic("afterClose")(p.toJsFn))
    afterOpen.foreach(p => __obj.updateDynamic("afterOpen")(p.toJsFn))
    beforeClose.foreach(p => __obj.updateDynamic("beforeClose")(p.toJsFn))
    beforeOpen.foreach(p => __obj.updateDynamic("beforeOpen")(p.toJsFn))
    close.foreach(p => __obj.updateDynamic("close")(p.toJsFn))
    open.foreach(p => __obj.updateDynamic("open")(p.toJsFn))
    __obj.asInstanceOf[Callbacks]
  }
}

