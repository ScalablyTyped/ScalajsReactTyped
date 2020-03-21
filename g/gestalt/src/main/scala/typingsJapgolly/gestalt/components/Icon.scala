package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonPath
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.eggplant
import typingsJapgolly.gestalt.gestaltStrings.gray
import typingsJapgolly.gestalt.gestaltStrings.green
import typingsJapgolly.gestalt.gestaltStrings.lightGray
import typingsJapgolly.gestalt.gestaltStrings.maroon
import typingsJapgolly.gestalt.gestaltStrings.midnight
import typingsJapgolly.gestalt.gestaltStrings.navy
import typingsJapgolly.gestalt.gestaltStrings.olive
import typingsJapgolly.gestalt.gestaltStrings.orange
import typingsJapgolly.gestalt.gestaltStrings.orchid
import typingsJapgolly.gestalt.gestaltStrings.pine
import typingsJapgolly.gestalt.gestaltStrings.purple
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.watermelon
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.mod.IconProps
import typingsJapgolly.gestalt.mod.Icons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon {
  def apply(
    accessibilityLabel: String,
    icon: Icons,
    color: blue | darkGray | eggplant | gray | green | lightGray | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | watermelon | white = null,
    dangerouslySetSvgPath: AnonPath = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    size: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IconProps, typingsJapgolly.gestalt.mod.Icon, Unit, IconProps] = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dangerouslySetSvgPath != null) __obj.updateDynamic("dangerouslySetSvgPath")(dangerouslySetSvgPath.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.IconProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Icon](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.IconProps])(children: _*)
  }
  @JSImport("gestalt", "Icon")
  @js.native
  object componentImport extends js.Object
  
}

