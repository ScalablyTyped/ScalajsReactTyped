package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Toolbar.ToolbarGroupProps
import typingsJapgolly.materialUi.materialUiStrings.left
import typingsJapgolly.materialUi.materialUiStrings.right
import typingsJapgolly.materialUi.toolbarGroupMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToolbarGroup {
  def apply(
    className: String = null,
    firstChild: js.UndefOr[Boolean] = js.undefined,
    float: left | right = null,
    lastChild: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ToolbarGroupProps, default, Unit, ToolbarGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(firstChild)) __obj.updateDynamic("firstChild")(firstChild.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(lastChild)) __obj.updateDynamic("lastChild")(lastChild.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Toolbar.ToolbarGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.toolbarGroupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Toolbar.ToolbarGroupProps])(children: _*)
  }
  @JSImport("material-ui/Toolbar/ToolbarGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

