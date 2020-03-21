package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityInfoStatic extends js.Object {
  /**
    * Add an event handler. Supported events:
    * - announcementFinished: iOS-only event. Fires when the screen reader has finished making an announcement.
    *                         The argument to the event handler is a dictionary with these keys:
    *                          - announcement: The string announced by the screen reader.
    *                          - success: A boolean indicating whether the announcement was successfully made.
    * - AccessibilityEventName constants other than announcementFinished: Fires on accessibility feature change.
    *            The argument to the event handler is a boolean.
    *            The boolean is true when the related event's feature is enabled and false otherwise.
    *
    */
  def addEventListener(eventName: AccessibilityEventName, handler: js.Function1[/* event */ AccessibilityEvent, Unit]): Unit
  /**
    * Post a string to be announced by the screen reader.
    *
    * @platform ios
    */
  def announceForAccessibility(announcement: String): Unit
  /**
    * Query whether a screen reader is currently enabled.
    *
    * @deprecated use isScreenReaderChanged instead
    */
  def fetch(): js.Promise[Boolean]
  /**
    * Query whether bold text is currently enabled.
    *
    * @platform ios
    */
  def isBoldTextEnabled(): js.Promise[Boolean]
  /**
    * Query whether grayscale is currently enabled.
    *
    * @platform ios
    */
  def isGrayscaleEnabled(): js.Promise[Boolean]
  /**
    * Query whether invert colors is currently enabled.
    *
    * @platform ios
    */
  def isInvertColorsEnabled(): js.Promise[Boolean]
  /**
    * Query whether reduce motion is currently enabled.
    */
  def isReduceMotionEnabled(): js.Promise[Boolean]
  /**
    * Query whether reduce transparency is currently enabled.
    *
    * @platform ios
    */
  def isReduceTransparencyEnabled(): js.Promise[Boolean]
  /**
    * Query whether a screen reader is currently enabled.
    */
  def isScreenReaderEnabled(): js.Promise[Boolean]
  /**
    * Remove an event handler.
    */
  def removeEventListener(eventName: AccessibilityEventName, handler: js.Function1[/* event */ AccessibilityEvent, Unit]): Unit
  /**
    * Set acessibility focus to a react component.
    *
    * @platform ios
    */
  def setAccessibilityFocus(reactTag: Double): Unit
}

object AccessibilityInfoStatic {
  @scala.inline
  def apply(
    addEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Callback,
    announceForAccessibility: String => Callback,
    fetch: CallbackTo[js.Promise[Boolean]],
    isBoldTextEnabled: CallbackTo[js.Promise[Boolean]],
    isGrayscaleEnabled: CallbackTo[js.Promise[Boolean]],
    isInvertColorsEnabled: CallbackTo[js.Promise[Boolean]],
    isReduceMotionEnabled: CallbackTo[js.Promise[Boolean]],
    isReduceTransparencyEnabled: CallbackTo[js.Promise[Boolean]],
    isScreenReaderEnabled: CallbackTo[js.Promise[Boolean]],
    removeEventListener: (AccessibilityEventName, js.Function1[/* event */ AccessibilityEvent, Unit]) => Callback,
    setAccessibilityFocus: Double => Callback
  ): AccessibilityInfoStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNative.mod.AccessibilityEventName, t1: js.Function1[/* event */ typingsJapgolly.reactNative.mod.AccessibilityEvent, scala.Unit]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("announceForAccessibility")(js.Any.fromFunction1((t0: java.lang.String) => announceForAccessibility(t0).runNow()))
    __obj.updateDynamic("fetch")(fetch.toJsFn)
    __obj.updateDynamic("isBoldTextEnabled")(isBoldTextEnabled.toJsFn)
    __obj.updateDynamic("isGrayscaleEnabled")(isGrayscaleEnabled.toJsFn)
    __obj.updateDynamic("isInvertColorsEnabled")(isInvertColorsEnabled.toJsFn)
    __obj.updateDynamic("isReduceMotionEnabled")(isReduceMotionEnabled.toJsFn)
    __obj.updateDynamic("isReduceTransparencyEnabled")(isReduceTransparencyEnabled.toJsFn)
    __obj.updateDynamic("isScreenReaderEnabled")(isScreenReaderEnabled.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNative.mod.AccessibilityEventName, t1: js.Function1[/* event */ typingsJapgolly.reactNative.mod.AccessibilityEvent, scala.Unit]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setAccessibilityFocus")(js.Any.fromFunction1((t0: scala.Double) => setAccessibilityFocus(t0).runNow()))
    __obj.asInstanceOf[AccessibilityInfoStatic]
  }
}

