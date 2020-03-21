package typingsJapgolly.reactVega.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVega.AnonBottom
import typingsJapgolly.reactVega.mod.VegaPropsWithSpec
import typingsJapgolly.reactVega.mod.default
import typingsJapgolly.std.Record
import typingsJapgolly.vegaTypings.mod.View
import typingsJapgolly.vegaTypings.runtimeMod.Item
import typingsJapgolly.vegaTypings.specMod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactVega {
  def apply(
    spec: Spec,
    background: String = null,
    className: String = null,
    data: Record[String, js.Array[_]] = null,
    enableHover: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    logLevel: Int | Double = null,
    onNewView: /* view */ View => Callback = null,
    onParseError: /* error */ js.Error => Callback = null,
    padding: Double | AnonBottom = null,
    renderer: String = null,
    style: CSSProperties = null,
    tooltip: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Callback = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[VegaPropsWithSpec, default, Unit, VegaPropsWithSpec] = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
  
      if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHover)) __obj.updateDynamic("enableHover")(enableHover.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (onNewView != null) __obj.updateDynamic("onNewView")(js.Any.fromFunction1((t0: /* view */ typingsJapgolly.vegaTypings.mod.View) => onNewView(t0).runNow()))
    if (onParseError != null) __obj.updateDynamic("onParseError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onParseError(t0).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction4((t0: /* handler */ js.Any, t1: /* event */ org.scalajs.dom.raw.MouseEvent, t2: /* item */ typingsJapgolly.vegaTypings.runtimeMod.Item[js.Any], t3: /* value */ js.Any) => tooltip(t0, t1, t2, t3).runNow()))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVega.mod.VegaPropsWithSpec, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVega.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVega.mod.VegaPropsWithSpec])(children: _*)
  }
  @JSImport("react-vega", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

