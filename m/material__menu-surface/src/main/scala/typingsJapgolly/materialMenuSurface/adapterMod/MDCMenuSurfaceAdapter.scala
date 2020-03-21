package typingsJapgolly.materialMenuSurface.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialMenuSurface.PartialMDCMenuDistance
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuDimensions
import typingsJapgolly.materialMenuSurface.typesMod.MDCMenuPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCMenuSurfaceAdapter extends js.Object {
  def addClass(className: String): Unit
  def getAnchorDimensions(): ClientRect | Null
  def getBodyDimensions(): MDCMenuDimensions
  def getInnerDimensions(): MDCMenuDimensions
  def getWindowDimensions(): MDCMenuDimensions
  def getWindowScroll(): MDCMenuPoint
  def hasAnchor(): Boolean
  def hasClass(className: String): Boolean
  def isElementInContainer(el: Element): Boolean
  def isFocused(): Boolean
  def isRtl(): Boolean
  /** Emits an event when the menu surface is closed. */
  def notifyClose(): Unit
  /** Emits an event when the menu surface is opened. */
  def notifyOpen(): Unit
  def removeClass(className: String): Unit
  /** Restores focus to the element that was focused before the menu surface was opened. */
  def restoreFocus(): Unit
  /** Saves the element that was focused before the menu surface was opened. */
  def saveFocus(): Unit
  def setMaxHeight(height: String): Unit
  def setPosition(position: PartialMDCMenuDistance): Unit
  def setTransformOrigin(origin: String): Unit
}

object MDCMenuSurfaceAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    getAnchorDimensions: CallbackTo[ClientRect | Null],
    getBodyDimensions: CallbackTo[MDCMenuDimensions],
    getInnerDimensions: CallbackTo[MDCMenuDimensions],
    getWindowDimensions: CallbackTo[MDCMenuDimensions],
    getWindowScroll: CallbackTo[MDCMenuPoint],
    hasAnchor: CallbackTo[Boolean],
    hasClass: String => CallbackTo[Boolean],
    isElementInContainer: Element => CallbackTo[Boolean],
    isFocused: CallbackTo[Boolean],
    isRtl: CallbackTo[Boolean],
    notifyClose: Callback,
    notifyOpen: Callback,
    removeClass: String => Callback,
    restoreFocus: Callback,
    saveFocus: Callback,
    setMaxHeight: String => Callback,
    setPosition: PartialMDCMenuDistance => Callback,
    setTransformOrigin: String => Callback
  ): MDCMenuSurfaceAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("getAnchorDimensions")(getAnchorDimensions.toJsFn)
    __obj.updateDynamic("getBodyDimensions")(getBodyDimensions.toJsFn)
    __obj.updateDynamic("getInnerDimensions")(getInnerDimensions.toJsFn)
    __obj.updateDynamic("getWindowDimensions")(getWindowDimensions.toJsFn)
    __obj.updateDynamic("getWindowScroll")(getWindowScroll.toJsFn)
    __obj.updateDynamic("hasAnchor")(hasAnchor.toJsFn)
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("isElementInContainer")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Element) => isElementInContainer(t0).runNow()))
    __obj.updateDynamic("isFocused")(isFocused.toJsFn)
    __obj.updateDynamic("isRtl")(isRtl.toJsFn)
    __obj.updateDynamic("notifyClose")(notifyClose.toJsFn)
    __obj.updateDynamic("notifyOpen")(notifyOpen.toJsFn)
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("restoreFocus")(restoreFocus.toJsFn)
    __obj.updateDynamic("saveFocus")(saveFocus.toJsFn)
    __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1((t0: java.lang.String) => setMaxHeight(t0).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: typingsJapgolly.materialMenuSurface.PartialMDCMenuDistance) => setPosition(t0).runNow()))
    __obj.updateDynamic("setTransformOrigin")(js.Any.fromFunction1((t0: java.lang.String) => setTransformOrigin(t0).runNow()))
    __obj.asInstanceOf[MDCMenuSurfaceAdapter]
  }
}

