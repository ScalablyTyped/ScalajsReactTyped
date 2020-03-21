package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import typingsJapgolly.gestalt.mod.Icons
import typingsJapgolly.gestalt.mod.PogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pog {
  def apply(
    icon: Icons,
    active: js.UndefOr[Boolean] = js.undefined,
    bgColor: transparent | lightGray | white = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    hovered: js.UndefOr[Boolean] = js.undefined,
    iconColor: blue | darkGray | gray | red | white = null,
    size: xs | sm | md | lg | xl = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PogProps, typingsJapgolly.gestalt.mod.Pog, Unit, PogProps] = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.PogProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Pog](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.PogProps])(children: _*)
  }
  @JSImport("gestalt", "Pog")
  @js.native
  object componentImport extends js.Object
  
}

