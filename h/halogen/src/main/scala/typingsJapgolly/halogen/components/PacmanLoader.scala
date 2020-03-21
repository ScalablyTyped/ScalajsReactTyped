package typingsJapgolly.halogen.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.halogen.mod.MarginLoaderProps
import typingsJapgolly.halogen.mod.PacmanLoaderCls
import typingsJapgolly.halogen.mod.VerticalAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PacmanLoader {
  def apply(
    className: String = null,
    color: String = null,
    id: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    size: Int | Double = null,
    verticalAlign: VerticalAlign = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[MarginLoaderProps[Double], PacmanLoaderCls, Unit, MarginLoaderProps[Double]] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.halogen.mod.MarginLoaderProps[scala.Double], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.halogen.mod.PacmanLoaderCls](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.halogen.mod.MarginLoaderProps[scala.Double]])(children: _*)
  }
  @JSImport("halogen", "PacmanLoader")
  @js.native
  object componentImport extends js.Object
  
}

