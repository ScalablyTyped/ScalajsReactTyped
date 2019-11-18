package typingsJapgolly.semanticDashUiDashReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveMod.default
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveOnUpdateData
import typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Responsive {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    getWidth: js.UndefOr[CallbackTo[Double]] = js.undefined,
    maxWidth: Double | String = null,
    minWidth: Double | String = null,
    onUpdate: (/* event */ ReactEventFrom[HTMLElement], /* data */ ResponsiveOnUpdateData) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResponsiveProps, default, Unit, ResponsiveProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    getWidth.foreach(p => __obj.updateDynamic("getWidth")(p.toJsFn))
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* data */ typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveOnUpdateData) => onUpdate(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveMod.default](js.constructorOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.semanticDashUiDashReact.distCommonjsAddonsResponsiveResponsiveMod.ResponsiveProps])(children: _*)
  }
}

