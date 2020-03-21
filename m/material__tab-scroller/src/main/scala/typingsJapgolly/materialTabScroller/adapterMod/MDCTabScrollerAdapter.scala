package typingsJapgolly.materialTabScroller.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabScrollerAdapter extends js.Object {
  /**
    * Adds the given className to the root element.
    * @param className The className to add
    */
  def addClass(className: String): Unit
  /**
    * Adds the given className to the scroll area element.
    * @param className The className to add
    */
  def addScrollAreaClass(className: String): Unit
  /**
    * Returns the height of the browser's horizontal scrollbars (in px).
    */
  def computeHorizontalScrollbarHeight(): Double
  /**
    * Returns the bounding client rect of the scroll area element.
    */
  def computeScrollAreaClientRect(): ClientRect
  /**
    * Returns the bounding client rect of the scroll content element.
    */
  def computeScrollContentClientRect(): ClientRect
  /**
    * Returns whether the event target matches given className.
    * @param evtTarget The event target
    * @param selector The selector to check
    */
  def eventTargetMatchesSelector(evtTarget: EventTarget, selector: String): Boolean
  /**
    * Returns the offsetWitdth of the scroll area element.
    */
  def getScrollAreaOffsetWidth(): Double
  /**
    * Returns the scrollLeft value of the scroll area element.
    */
  def getScrollAreaScrollLeft(): Double
  /**
    * Returns the offsetWidth of the scroll content element.
    */
  def getScrollContentOffsetWidth(): Double
  /**
    * Returns the scroll content element's computed style value of the given css property `propertyName`.
    * We achieve this via `getComputedStyle(...).getPropertyValue(propertyName)`.
    */
  def getScrollContentStyleValue(propertyName: String): String
  /**
    * Removes the given className from the root element.
    * @param className The className to remove
    */
  def removeClass(className: String): Unit
  /**
    * Sets the scrollLeft value of the scroll area element to the passed value.
    * @param scrollLeft The new scrollLeft value
    */
  def setScrollAreaScrollLeft(scrollLeft: Double): Unit
  /**
    * Sets a style property of the area element to the passed value.
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setScrollAreaStyleProperty(propName: String, value: String): Unit
  /**
    * Sets a style property of the content element to the passed value.
    * @param propName The style property name to set
    * @param value The style property value
    */
  def setScrollContentStyleProperty(propName: String, value: String): Unit
}

object MDCTabScrollerAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    addScrollAreaClass: String => Callback,
    computeHorizontalScrollbarHeight: CallbackTo[Double],
    computeScrollAreaClientRect: CallbackTo[ClientRect],
    computeScrollContentClientRect: CallbackTo[ClientRect],
    eventTargetMatchesSelector: (EventTarget, String) => CallbackTo[Boolean],
    getScrollAreaOffsetWidth: CallbackTo[Double],
    getScrollAreaScrollLeft: CallbackTo[Double],
    getScrollContentOffsetWidth: CallbackTo[Double],
    getScrollContentStyleValue: String => CallbackTo[String],
    removeClass: String => Callback,
    setScrollAreaScrollLeft: Double => Callback,
    setScrollAreaStyleProperty: (String, String) => Callback,
    setScrollContentStyleProperty: (String, String) => Callback
  ): MDCTabScrollerAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("addScrollAreaClass")(js.Any.fromFunction1((t0: java.lang.String) => addScrollAreaClass(t0).runNow()))
    __obj.updateDynamic("computeHorizontalScrollbarHeight")(computeHorizontalScrollbarHeight.toJsFn)
    __obj.updateDynamic("computeScrollAreaClientRect")(computeScrollAreaClientRect.toJsFn)
    __obj.updateDynamic("computeScrollContentClientRect")(computeScrollContentClientRect.toJsFn)
    __obj.updateDynamic("eventTargetMatchesSelector")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.EventTarget, t1: java.lang.String) => eventTargetMatchesSelector(t0, t1).runNow()))
    __obj.updateDynamic("getScrollAreaOffsetWidth")(getScrollAreaOffsetWidth.toJsFn)
    __obj.updateDynamic("getScrollAreaScrollLeft")(getScrollAreaScrollLeft.toJsFn)
    __obj.updateDynamic("getScrollContentOffsetWidth")(getScrollContentOffsetWidth.toJsFn)
    __obj.updateDynamic("getScrollContentStyleValue")(js.Any.fromFunction1((t0: java.lang.String) => getScrollContentStyleValue(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setScrollAreaScrollLeft")(js.Any.fromFunction1((t0: scala.Double) => setScrollAreaScrollLeft(t0).runNow()))
    __obj.updateDynamic("setScrollAreaStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setScrollAreaStyleProperty(t0, t1).runNow()))
    __obj.updateDynamic("setScrollContentStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setScrollContentStyleProperty(t0, t1).runNow()))
    __obj.asInstanceOf[MDCTabScrollerAdapter]
  }
}

