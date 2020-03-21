package typingsJapgolly.reactVisibilitySensor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactVisibilitySensor.mod.ChildFunction
import typingsJapgolly.reactVisibilitySensor.mod.Props
import typingsJapgolly.reactVisibilitySensor.mod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactVisibilitySensor {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    containment: HTMLElement = null,
    delayedCall: js.UndefOr[Boolean] = js.undefined,
    intervalCheck: js.UndefOr[Boolean] = js.undefined,
    intervalDelay: Int | Double = null,
    minTopValue: Int | Double = null,
    offset: Shape = null,
    onChange: /* isVisible */ Boolean => Callback = null,
    partialVisibility: js.UndefOr[Boolean] = js.undefined,
    resizeCheck: js.UndefOr[Boolean] = js.undefined,
    resizeDelay: Int | Double = null,
    resizeThrottle: Int | Double = null,
    scrollCheck: js.UndefOr[Boolean] = js.undefined,
    scrollDelay: Int | Double = null,
    scrollThrottle: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | ChildFunction = null
  ): UnmountedSimple[Props, MountedWithRawType[Props, js.Object, RawMounted[Props, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (containment != null) __obj.updateDynamic("containment")(containment.asInstanceOf[js.Any])
    if (!js.isUndefined(delayedCall)) __obj.updateDynamic("delayedCall")(delayedCall.asInstanceOf[js.Any])
    if (!js.isUndefined(intervalCheck)) __obj.updateDynamic("intervalCheck")(intervalCheck.asInstanceOf[js.Any])
    if (intervalDelay != null) __obj.updateDynamic("intervalDelay")(intervalDelay.asInstanceOf[js.Any])
    if (minTopValue != null) __obj.updateDynamic("minTopValue")(minTopValue.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* isVisible */ scala.Boolean) => onChange(t0).runNow()))
    if (!js.isUndefined(partialVisibility)) __obj.updateDynamic("partialVisibility")(partialVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeCheck)) __obj.updateDynamic("resizeCheck")(resizeCheck.asInstanceOf[js.Any])
    if (resizeDelay != null) __obj.updateDynamic("resizeDelay")(resizeDelay.asInstanceOf[js.Any])
    if (resizeThrottle != null) __obj.updateDynamic("resizeThrottle")(resizeThrottle.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollCheck)) __obj.updateDynamic("scrollCheck")(scrollCheck.asInstanceOf[js.Any])
    if (scrollDelay != null) __obj.updateDynamic("scrollDelay")(scrollDelay.asInstanceOf[js.Any])
    if (scrollThrottle != null) __obj.updateDynamic("scrollThrottle")(scrollThrottle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactVisibilitySensor.mod.Props, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVisibilitySensor.mod.Props])
  }
  @JSImport("react-visibility-sensor", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

