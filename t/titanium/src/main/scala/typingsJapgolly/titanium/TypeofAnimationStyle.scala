package typingsJapgolly.titanium

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAnimationStyle extends js.Object {
  /**
  				 * A transition that dissolves from one view to the next.
  				 */
  val CROSS_DISSOLVE: Double
  /**
  				 * Curl downwards during a transition animation.
  				 */
  val CURL_DOWN: Double
  /**
  				 * Curl upwards during a transition animation.
  				 */
  val CURL_UP: Double
  /**
  				 * Flip from bottom to top during a transition animation.
  				 */
  val FLIP_FROM_BOTTOM: Double
  /**
  				 * Flip from left to right during a transition animation.
  				 */
  val FLIP_FROM_LEFT: Double
  /**
  				 * Flip from right to left during a transition animation.
  				 */
  val FLIP_FROM_RIGHT: Double
  /**
  				 * Flip from top to bottom during a transition animation.
  				 */
  val FLIP_FROM_TOP: Double
  /**
  				 * No animation.
  				 */
  val NONE: Double
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
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.apiName> property.
  				 */
  def getApiName(): String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def getBubbleParent(): Boolean
  /**
  				 * Removes the specified callback as an event listener for the named event.
  				 */
  def removeEventListener(name: String, callback: js.Function1[/* param0 */ js.Any, _]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.AnimationStyle.bubbleParent> property.
  				 */
  def setBubbleParent(bubbleParent: Boolean): Unit
}

object TypeofAnimationStyle {
  @scala.inline
  def apply(
    CROSS_DISSOLVE: Double,
    CURL_DOWN: Double,
    CURL_UP: Double,
    FLIP_FROM_BOTTOM: Double,
    FLIP_FROM_LEFT: Double,
    FLIP_FROM_RIGHT: Double,
    FLIP_FROM_TOP: Double,
    NONE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback
  ): TypeofAnimationStyle = {
    val __obj = js.Dynamic.literal(CROSS_DISSOLVE = CROSS_DISSOLVE.asInstanceOf[js.Any], CURL_DOWN = CURL_DOWN.asInstanceOf[js.Any], CURL_UP = CURL_UP.asInstanceOf[js.Any], FLIP_FROM_BOTTOM = FLIP_FROM_BOTTOM.asInstanceOf[js.Any], FLIP_FROM_LEFT = FLIP_FROM_LEFT.asInstanceOf[js.Any], FLIP_FROM_RIGHT = FLIP_FROM_RIGHT.asInstanceOf[js.Any], FLIP_FROM_TOP = FLIP_FROM_TOP.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.asInstanceOf[TypeofAnimationStyle]
  }
}

