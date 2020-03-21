package typingsJapgolly.jqueryTools.JQueryTools.overlay

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryTools.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overlay extends js.Object {
  /** Closes the overlay. */
  def close(): Overlay
  /** Returns the closing element(s) as a jQuery object. */
  def getClosers(): JQuery
  /** Returns the configuration for the overlay. */
  def getConf(): OverlayOptions
  /** Returns the overlayed element as a jQuery object. */
  def getOverlay(): JQuery
  /** Returns the triggering element as a jQuery object. */
  def getTrigger(): JQuery
  /** Returns `true` if the overlay is opened. */
  def isOpened(): Boolean
  /** Opens the overlay. */
  def load(): Overlay
}

object Overlay {
  @scala.inline
  def apply(
    close: CallbackTo[Overlay],
    getClosers: CallbackTo[JQuery],
    getConf: CallbackTo[OverlayOptions],
    getOverlay: CallbackTo[JQuery],
    getTrigger: CallbackTo[JQuery],
    isOpened: CallbackTo[Boolean],
    load: CallbackTo[Overlay]
  ): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("getClosers")(getClosers.toJsFn)
    __obj.updateDynamic("getConf")(getConf.toJsFn)
    __obj.updateDynamic("getOverlay")(getOverlay.toJsFn)
    __obj.updateDynamic("getTrigger")(getTrigger.toJsFn)
    __obj.updateDynamic("isOpened")(isOpened.toJsFn)
    __obj.updateDynamic("load")(load.toJsFn)
    __obj.asInstanceOf[Overlay]
  }
}

