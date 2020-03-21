package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.View
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Provides support for the built-in iOS dynamic animations
			 */
trait Animator extends Proxy {
  /**
  				 * Behaviors associated with this animator.
  				 */
  var behaviors: js.Array[Proxy]
  /**
  				 * Titanium View object to initialize as the reference view for the animator.
  				 */
  var referenceView: View
  /**
  				 * Returns `true` if the animator is running else `false`.
  				 */
  val running: Boolean
  /**
  				 * Adds a dynamic behavior to the animator.
  				 */
  def addBehavior(behavior: Proxy): Unit
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
  				 */
  def getBehaviors(): js.Array[Proxy]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
  				 */
  def getReferenceView(): View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.Animator.running> property.
  				 */
  def getRunning(): Boolean
  /**
  				 * Removes all behaviors from this animator.
  				 */
  def removeAllBehaviors(): Unit
  /**
  				 * Removes the specified behavior from the animator.
  				 */
  def removeBehavior(behavior: Proxy): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Animator.behaviors> property.
  				 */
  def setBehaviors(behaviors: js.Array[Proxy]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.Animator.referenceView> property.
  				 */
  def setReferenceView(referenceView: js.Any): Unit
  /**
  				 * Starts the animation behaviors.
  				 */
  def startAnimator(): Unit
  /**
  				 * Stops the animation behaviors.
  				 */
  def stopAnimator(): Unit
  /**
  				 * Updates the animator's state information with the current state of the specified item.
  				 */
  def updateItemUsingCurrentState(item: js.Any): Unit
}

object Animator {
  @scala.inline
  def apply(
    addBehavior: Proxy => Callback,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    behaviors: js.Array[Proxy],
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBehaviors: CallbackTo[js.Array[Proxy]],
    getBubbleParent: CallbackTo[Boolean],
    getReferenceView: CallbackTo[View],
    getRunning: CallbackTo[Boolean],
    referenceView: View,
    removeAllBehaviors: Callback,
    removeBehavior: Proxy => Callback,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    running: Boolean,
    setBehaviors: js.Array[Proxy] => Callback,
    setBubbleParent: Boolean => Callback,
    setReferenceView: js.Any => Callback,
    startAnimator: Callback,
    stopAnimator: Callback,
    updateItemUsingCurrentState: js.Any => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Animator = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], behaviors = behaviors.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], referenceView = referenceView.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.updateDynamic("addBehavior")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Proxy) => addBehavior(t0).runNow()))
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBehaviors")(getBehaviors.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getReferenceView")(getReferenceView.toJsFn)
    __obj.updateDynamic("getRunning")(getRunning.toJsFn)
    __obj.updateDynamic("removeAllBehaviors")(removeAllBehaviors.toJsFn)
    __obj.updateDynamic("removeBehavior")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.Proxy) => removeBehavior(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBehaviors")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.Titanium.Proxy]) => setBehaviors(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setReferenceView")(js.Any.fromFunction1((t0: js.Any) => setReferenceView(t0).runNow()))
    __obj.updateDynamic("startAnimator")(startAnimator.toJsFn)
    __obj.updateDynamic("stopAnimator")(stopAnimator.toJsFn)
    __obj.updateDynamic("updateItemUsingCurrentState")(js.Any.fromFunction1((t0: js.Any) => updateItemUsingCurrentState(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animator]
  }
}

