package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.PartialClassNameMapGridLiActionIcon
import typingsJapgolly.materialUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps
import typingsJapgolly.materialUiCore.gridListTileBarMod.default
import typingsJapgolly.materialUiCore.materialUiCoreStrings.bottom
import typingsJapgolly.materialUiCore.materialUiCoreStrings.left
import typingsJapgolly.materialUiCore.materialUiCoreStrings.right
import typingsJapgolly.materialUiCore.materialUiCoreStrings.top
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridListTileBar {
  def apply(
    actionIcon: VdomNode = null,
    actionPosition: left | right = null,
    className: String = null,
    classes: PartialClassNameMapGridLiActionIcon = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null,
    subtitle: VdomNode = null,
    title: VdomNode = null,
    titlePosition: top | bottom = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridListTileBarProps, default, Unit, GridListTileBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (actionIcon != null) __obj.updateDynamic("actionIcon")(actionIcon.rawNode.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.gridListTileBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.gridListTileBarGridListTileBarMod.GridListTileBarProps])(children: _*)
  }
  @JSImport("@material-ui/core/GridListTileBar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

