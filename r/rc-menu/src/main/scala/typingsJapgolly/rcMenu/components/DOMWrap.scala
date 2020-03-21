package typingsJapgolly.rcMenu.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcMenu.domwrapMod.DOMWrapProps
import typingsJapgolly.rcMenu.domwrapMod.default
import typingsJapgolly.rcMenu.interfaceMod.MenuMode
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DOMWrap {
  def apply(
    className: String = null,
    level: Int | Double = null,
    mode: MenuMode = null,
    overflowedIndicator: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    tag: String = null,
    theme: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Element] = null
  ): UnmountedWithRoot[DOMWrapProps, default, Unit, DOMWrapProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (overflowedIndicator != null) __obj.updateDynamic("overflowedIndicator")(overflowedIndicator.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcMenu.domwrapMod.DOMWrapProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.rcMenu.domwrapMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcMenu.domwrapMod.DOMWrapProps])
  }
  @JSImport("rc-menu/lib/DOMWrap", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

