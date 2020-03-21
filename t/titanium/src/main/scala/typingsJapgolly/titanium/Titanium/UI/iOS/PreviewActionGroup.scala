package typingsJapgolly.titanium.Titanium.UI.iOS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * A PreviewActionGroup provides options to configure a group of actions used by the iOS9 3D-Touch
			 * feature "Peek and Pop".
			 */
trait PreviewActionGroup extends Proxy {
  /**
  				 * The preview actions assigned to this preview action group.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The style of the action group.
  				 */
  var style: Double
  /**
  				 * The title of the action group.
  				 */
  var title: String
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def getStyle(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def getTitle(): String
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.style> property.
  				 */
  def setStyle(style: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewActionGroup.title> property.
  				 */
  def setTitle(title: String): Unit
}

object PreviewActionGroup {
  @scala.inline
  def apply(
    actions: js.Array[PreviewAction],
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getActions: CallbackTo[js.Array[PreviewAction]],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getStyle: CallbackTo[Double],
    getTitle: CallbackTo[String],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setActions: js.Array[PreviewAction] => Callback,
    setBubbleParent: Boolean => Callback,
    setStyle: Double => Callback,
    setTitle: String => Callback,
    style: Double,
    title: String,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PreviewActionGroup = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getActions")(getActions.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getStyle")(getStyle.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setActions")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.Titanium.UI.iOS.PreviewAction]) => setActions(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction1((t0: scala.Double) => setStyle(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionGroup]
  }
}

