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
			 * A PreviewContext provides options to configure the iOS 9 3D-Touch "Peek and Pop" feature.
			 */
trait PreviewContext extends Proxy {
  /**
  				 * The preview actions and preview action groups.
  				 */
  var actions: js.Array[PreviewAction]
  /**
  				 * The height of the preview.
  				 */
  var contentHeight: Double
  /**
  				 * The preview view.
  				 */
  var preview: View
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def getActions(): js.Array[PreviewAction]
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def getContentHeight(): Double
  /**
  				 * Gets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def getPreview(): View
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.actions> property.
  				 */
  def setActions(actions: js.Array[PreviewAction]): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.contentHeight> property.
  				 */
  def setContentHeight(contentHeight: Double): Unit
  /**
  				 * Sets the value of the <Titanium.UI.iOS.PreviewContext.preview> property.
  				 */
  def setPreview(preview: js.Any): Unit
}

object PreviewContext {
  @scala.inline
  def apply(
    actions: js.Array[PreviewAction],
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    contentHeight: Double,
    fireEvent: (String, js.Any) => Callback,
    getActions: CallbackTo[js.Array[PreviewAction]],
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getContentHeight: CallbackTo[Double],
    getPreview: CallbackTo[View],
    preview: View,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setActions: js.Array[PreviewAction] => Callback,
    setBubbleParent: Boolean => Callback,
    setContentHeight: Double => Callback,
    setPreview: js.Any => Callback,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PreviewContext = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getActions")(getActions.toJsFn)
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getContentHeight")(getContentHeight.toJsFn)
    __obj.updateDynamic("getPreview")(getPreview.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setActions")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.titanium.Titanium.UI.iOS.PreviewAction]) => setActions(t0).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setContentHeight")(js.Any.fromFunction1((t0: scala.Double) => setContentHeight(t0).runNow()))
    __obj.updateDynamic("setPreview")(js.Any.fromFunction1((t0: js.Any) => setPreview(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewContext]
  }
}

