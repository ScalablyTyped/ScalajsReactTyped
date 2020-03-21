package typingsJapgolly.cordovaIonic.Ionic

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Keyboard extends js.Object {
  /**
    * Whether or not the keyboard is currently visible.
    */
  var isVisible: Boolean
  /**
    * Close the keyboard if it is open.
    */
  def close(): Unit
  /**
    * Disable native scrolling, useful if you are using JavaScript to scroll
    *
    * @param disbale
    */
  def disableScroll(disbale: Boolean): Unit
  /**
    * Hide the keyboard accessory bar with the next, previous and done buttons.
    *
    * @param hide
    */
  def hideKeyboardAccessoryBar(hide: Boolean): Unit
  /**
    * Force keyboard to be shown on Android.
    * This typically helps if autofocus on a text element does not pop up the keyboard automatically
    *
    * Supported Platforms: Android, Blackberry 10
    */
  def show(): Unit
}

object Keyboard {
  @scala.inline
  def apply(
    close: Callback,
    disableScroll: Boolean => Callback,
    hideKeyboardAccessoryBar: Boolean => Callback,
    isVisible: Boolean,
    show: Callback
  ): Keyboard = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("disableScroll")(js.Any.fromFunction1((t0: scala.Boolean) => disableScroll(t0).runNow()))
    __obj.updateDynamic("hideKeyboardAccessoryBar")(js.Any.fromFunction1((t0: scala.Boolean) => hideKeyboardAccessoryBar(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Keyboard]
  }
}

