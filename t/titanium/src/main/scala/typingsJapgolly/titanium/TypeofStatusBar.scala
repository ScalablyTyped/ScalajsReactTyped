package typingsJapgolly.titanium

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofStatusBar extends js.Object {
  /**
  				 * Fade animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_FADE: Double
  /**
  				 * No animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_NONE: Double
  /**
  				 * Slide animation style, when the status bar is hidden or shown.
  				 */
  val ANIMATION_STYLE_SLIDE: Double
  /**
  				 * Default status bar style.
  				 */
  val DEFAULT: Double
  /**
  				 * Gray-colored status bar style.
  				 */
  val GRAY: Double
  /**
  				 * Gray-colored status bar style.
  				 */
  val GREY: Double
  /**
  				 * Status bar style to use with dark backgrounds.
  				 */
  val LIGHT_CONTENT: Double
  /**
  				 * The name of the API that this proxy corresponds to.
  				 */
  val apiName: String
  /**
  				 * Indicates if the proxy will bubble an event to its parent.
  				 */
  var bubbleParent: Boolean
  /**
  				 * Adds the specified callback as an event listener for the named event.
  				 */
  def addEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Applies the properties to the proxy.
  				 */
  def applyProperties(props: js.Any): Unit
  /**
  				 * Fires a synthesized event to any registered listeners.
  				 */
  def fireEvent(name: String, event: js.Any): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.StatusBar.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofStatusBar {
  @scala.inline
  def apply(
    ANIMATION_STYLE_FADE: Double,
    ANIMATION_STYLE_NONE: Double,
    ANIMATION_STYLE_SLIDE: Double,
    DEFAULT: Double,
    GRAY: Double,
    GREY: Double,
    LIGHT_CONTENT: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback
  ): TypeofStatusBar = {
    val __obj = js.Dynamic.literal(ANIMATION_STYLE_FADE = ANIMATION_STYLE_FADE.asInstanceOf[js.Any], ANIMATION_STYLE_NONE = ANIMATION_STYLE_NONE.asInstanceOf[js.Any], ANIMATION_STYLE_SLIDE = ANIMATION_STYLE_SLIDE.asInstanceOf[js.Any], DEFAULT = DEFAULT.asInstanceOf[js.Any], GRAY = GRAY.asInstanceOf[js.Any], GREY = GREY.asInstanceOf[js.Any], LIGHT_CONTENT = LIGHT_CONTENT.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.asInstanceOf[TypeofStatusBar]
  }
}

