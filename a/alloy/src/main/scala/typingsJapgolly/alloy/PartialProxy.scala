package typingsJapgolly.alloy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<titanium.Titanium.Proxy> */
trait PartialProxy extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ js.Any, _], Unit]
  ] = js.undefined
  var apiName: js.UndefOr[String] = js.undefined
  var applyProperties: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.undefined
  var bubbleParent: js.UndefOr[Boolean] = js.undefined
  var fireEvent: js.UndefOr[js.Function2[/* name */ String, /* event */ js.Any, Unit]] = js.undefined
  var getApiName: js.UndefOr[js.Function0[String]] = js.undefined
  var getBubbleParent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var getLifecycleContainer: js.UndefOr[js.Function0[Window | TabGroup]] = js.undefined
  var lifecycleContainer: js.UndefOr[Window | TabGroup] = js.undefined
  var removeEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ js.Any, _], Unit]
  ] = js.undefined
  var setBubbleParent: js.UndefOr[js.Function1[/* bubbleParent */ Boolean, Unit]] = js.undefined
  var setLifecycleContainer: js.UndefOr[
    (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit])
  ] = js.undefined
}

object PartialProxy {
  @scala.inline
  def apply(
    addEventListener: (/* name */ String, /* callback */ js.Function1[/* param0 */ js.Any, js.Any]) => Callback = null,
    apiName: String = null,
    applyProperties: /* props */ js.Any => Callback = null,
    bubbleParent: js.UndefOr[Boolean] = js.undefined,
    fireEvent: (/* name */ String, /* event */ js.Any) => Callback = null,
    getApiName: js.UndefOr[CallbackTo[String]] = js.undefined,
    getBubbleParent: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    removeEventListener: (/* name */ String, /* callback */ js.Function1[/* param0 */ js.Any, js.Any]) => Callback = null,
    setBubbleParent: /* bubbleParent */ Boolean => Callback = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): PartialProxy = {
    val __obj = js.Dynamic.literal()
    if (addEventListener != null) __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* callback */ js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    if (apiName != null) __obj.updateDynamic("apiName")(apiName.asInstanceOf[js.Any])
    if (applyProperties != null) __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: /* props */ js.Any) => applyProperties(t0).runNow()))
    if (!js.isUndefined(bubbleParent)) __obj.updateDynamic("bubbleParent")(bubbleParent.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* event */ js.Any) => fireEvent(t0, t1).runNow()))
    getApiName.foreach(p => __obj.updateDynamic("getApiName")(p.toJsFn))
    getBubbleParent.foreach(p => __obj.updateDynamic("getBubbleParent")(p.toJsFn))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (removeEventListener != null) __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* callback */ js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    if (setBubbleParent != null) __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: /* bubbleParent */ scala.Boolean) => setBubbleParent(t0).runNow()))
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialProxy]
  }
}

