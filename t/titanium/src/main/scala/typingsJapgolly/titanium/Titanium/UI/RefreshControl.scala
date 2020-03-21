package typingsJapgolly.titanium.Titanium.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The RefreshControl is a representation of the native iOS
		 * [UIRefreshControl](https://developer.apple.com/documentation/uikit/uirefreshcontrol)
		 * and Android [SwipeRefreshLayout](https://developer.android.com/reference/android/support/v4/widget/SwipeRefreshLayout.html).
		 */
trait RefreshControl extends Proxy {
  /**
  			 * The tint color for the refresh control, as a color name or hex triplet.
  			 */
  var tintColor: String
  /**
  			 * The attributed title of the control.
  			 */
  var title: AttributedString
  /**
  			 * Tells the control that a refresh operation was started programmatically.
  			 */
  def beginRefreshing(): Unit
  /**
  			 * Tells the control that a refresh operation has ended.
  			 */
  def endRefreshing(): Unit
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def getTintColor(): String
  /**
  			 * Gets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def getTitle(): AttributedString
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.tintColor> property.
  			 */
  def setTintColor(tintColor: String): Unit
  /**
  			 * Sets the value of the <Titanium.UI.RefreshControl.title> property.
  			 */
  def setTitle(title: AttributedString): Unit
}

object RefreshControl {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    beginRefreshing: Callback,
    bubbleParent: Boolean,
    endRefreshing: Callback,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getTintColor: CallbackTo[String],
    getTitle: CallbackTo[AttributedString],
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    setBubbleParent: Boolean => Callback,
    setTintColor: String => Callback,
    setTitle: AttributedString => Callback,
    tintColor: String,
    title: AttributedString,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): RefreshControl = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("beginRefreshing")(beginRefreshing.toJsFn)
    __obj.updateDynamic("endRefreshing")(endRefreshing.toJsFn)
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getTintColor")(getTintColor.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setTintColor")(js.Any.fromFunction1((t0: java.lang.String) => setTintColor(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.UI.AttributedString) => setTitle(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshControl]
  }
}

