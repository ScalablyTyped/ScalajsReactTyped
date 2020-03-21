package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.RefreshIndicatorProps
import typingsJapgolly.materialUi.materialUiStrings.hide
import typingsJapgolly.materialUi.materialUiStrings.loading
import typingsJapgolly.materialUi.materialUiStrings.ready
import typingsJapgolly.materialUi.refreshIndicatorMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RefreshIndicator {
  def apply(
    left: Double,
    top: Double,
    color: String = null,
    loadingColor: String = null,
    percentage: Int | Double = null,
    size: Int | Double = null,
    status: ready | loading | hide = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RefreshIndicatorProps, default, Unit, RefreshIndicatorProps] = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (loadingColor != null) __obj.updateDynamic("loadingColor")(loadingColor.asInstanceOf[js.Any])
    if (percentage != null) __obj.updateDynamic("percentage")(percentage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.RefreshIndicatorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.refreshIndicatorMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.RefreshIndicatorProps])(children: _*)
  }
  @JSImport("material-ui/RefreshIndicator", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

