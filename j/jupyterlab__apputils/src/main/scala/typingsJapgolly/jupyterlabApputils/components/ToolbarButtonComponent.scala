package typingsJapgolly.jupyterlabApputils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToolbarButtonComponent {
  def apply(
    className: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    iconClassName: String = null,
    iconLabel: String = null,
    label: String = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    tooltip: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[IProps, MountedWithRawType[IProps, js.Object, RawMounted[IProps, js.Object]]] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps])(children: _*)
  }
  @JSImport("@jupyterlab/apputils", "ToolbarButtonComponent")
  @js.native
  object componentImport extends js.Object
  
}

