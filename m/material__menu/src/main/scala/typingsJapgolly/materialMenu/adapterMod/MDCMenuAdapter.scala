package typingsJapgolly.materialMenu.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.materialMenu.AnonBottom
import typingsJapgolly.materialMenu.AnonHeight
import typingsJapgolly.materialMenu.AnonIndex
import typingsJapgolly.materialMenu.AnonLeft
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCMenuAdapter extends js.Object {
  def addClass(className: String): Unit
  def addClassForOptionAtIndex(index: Double, className: String): Unit
  def deregisterBodyClickHandler(handler: EventListener): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def focus(): Unit
  def focusItemAtIndex(index: Double): Unit
  def getAnchorDimensions(): AnonBottom
  def getAttributeForEventTarget(target: EventTarget, attributeName: String): String
  def getFocusedItemIndex(): Double
  def getIndexForEventTarget(target: EventTarget): Double
  def getInnerDimensions(): AnonHeight
  def getNumberOfItems(): Double
  def getWindowDimensions(): AnonHeight
  def hasAnchor(): Boolean
  def hasClass(className: String): Boolean
  def hasNecessaryDom(): Boolean
  def isFocused(): Boolean
  def isRtl(): Boolean
  def notifyCancel(): Unit
  def notifySelected(evtData: AnonIndex): Unit
  def registerBodyClickHandler(handler: EventListener): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def restoreFocus(): Unit
  def rmAttrForOptionAtIndex(index: Double, attr: String): Unit
  def rmClassForOptionAtIndex(index: Double, className: String): Unit
  def saveFocus(): Unit
  def setAttrForOptionAtIndex(index: Double, attr: String, value: String): Unit
  def setMaxHeight(height: Double): Unit
  def setPosition(position: AnonLeft): Unit
  def setTransformOrigin(origin: String): Unit
}

object MDCMenuAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    addClassForOptionAtIndex: (Double, String) => Callback,
    deregisterBodyClickHandler: EventListener => Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    focus: Callback,
    focusItemAtIndex: Double => Callback,
    getAnchorDimensions: CallbackTo[AnonBottom],
    getAttributeForEventTarget: (EventTarget, String) => CallbackTo[String],
    getFocusedItemIndex: CallbackTo[Double],
    getIndexForEventTarget: EventTarget => CallbackTo[Double],
    getInnerDimensions: CallbackTo[AnonHeight],
    getNumberOfItems: CallbackTo[Double],
    getWindowDimensions: CallbackTo[AnonHeight],
    hasAnchor: CallbackTo[Boolean],
    hasClass: String => CallbackTo[Boolean],
    hasNecessaryDom: CallbackTo[Boolean],
    isFocused: CallbackTo[Boolean],
    isRtl: CallbackTo[Boolean],
    notifyCancel: Callback,
    notifySelected: AnonIndex => Callback,
    registerBodyClickHandler: EventListener => Callback,
    registerInteractionHandler: (String, EventListener) => Callback,
    removeClass: String => Callback,
    restoreFocus: Callback,
    rmAttrForOptionAtIndex: (Double, String) => Callback,
    rmClassForOptionAtIndex: (Double, String) => Callback,
    saveFocus: Callback,
    setAttrForOptionAtIndex: (Double, String, String) => Callback,
    setMaxHeight: Double => Callback,
    setPosition: AnonLeft => Callback,
    setTransformOrigin: String => Callback
  ): MDCMenuAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("addClassForOptionAtIndex")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => addClassForOptionAtIndex(t0, t1).runNow()))
    __obj.updateDynamic("deregisterBodyClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterBodyClickHandler(t0).runNow()))
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("focusItemAtIndex")(js.Any.fromFunction1((t0: scala.Double) => focusItemAtIndex(t0).runNow()))
    __obj.updateDynamic("getAnchorDimensions")(getAnchorDimensions.toJsFn)
    __obj.updateDynamic("getAttributeForEventTarget")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.EventTarget, t1: java.lang.String) => getAttributeForEventTarget(t0, t1).runNow()))
    __obj.updateDynamic("getFocusedItemIndex")(getFocusedItemIndex.toJsFn)
    __obj.updateDynamic("getIndexForEventTarget")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.EventTarget) => getIndexForEventTarget(t0).runNow()))
    __obj.updateDynamic("getInnerDimensions")(getInnerDimensions.toJsFn)
    __obj.updateDynamic("getNumberOfItems")(getNumberOfItems.toJsFn)
    __obj.updateDynamic("getWindowDimensions")(getWindowDimensions.toJsFn)
    __obj.updateDynamic("hasAnchor")(hasAnchor.toJsFn)
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("hasNecessaryDom")(hasNecessaryDom.toJsFn)
    __obj.updateDynamic("isFocused")(isFocused.toJsFn)
    __obj.updateDynamic("isRtl")(isRtl.toJsFn)
    __obj.updateDynamic("notifyCancel")(notifyCancel.toJsFn)
    __obj.updateDynamic("notifySelected")(js.Any.fromFunction1((t0: typingsJapgolly.materialMenu.AnonIndex) => notifySelected(t0).runNow()))
    __obj.updateDynamic("registerBodyClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerBodyClickHandler(t0).runNow()))
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("restoreFocus")(restoreFocus.toJsFn)
    __obj.updateDynamic("rmAttrForOptionAtIndex")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => rmAttrForOptionAtIndex(t0, t1).runNow()))
    __obj.updateDynamic("rmClassForOptionAtIndex")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => rmClassForOptionAtIndex(t0, t1).runNow()))
    __obj.updateDynamic("saveFocus")(saveFocus.toJsFn)
    __obj.updateDynamic("setAttrForOptionAtIndex")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: java.lang.String) => setAttrForOptionAtIndex(t0, t1, t2).runNow()))
    __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1((t0: scala.Double) => setMaxHeight(t0).runNow()))
    __obj.updateDynamic("setPosition")(js.Any.fromFunction1((t0: typingsJapgolly.materialMenu.AnonLeft) => setPosition(t0).runNow()))
    __obj.updateDynamic("setTransformOrigin")(js.Any.fromFunction1((t0: java.lang.String) => setTransformOrigin(t0).runNow()))
    __obj.asInstanceOf[MDCMenuAdapter]
  }
}

