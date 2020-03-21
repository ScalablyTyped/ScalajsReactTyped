package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.gestaltStrings.down
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.up
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import typingsJapgolly.gestalt.mod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  def apply(
    anchor: js.Any,
    onDismiss: Callback,
    idealDirection: up | right | down | left = null,
    positionRelativeToAnchor: js.UndefOr[Boolean] = js.undefined,
    size: xs | sm | md | lg | xl = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TooltipProps, typingsJapgolly.gestalt.mod.Tooltip, Unit, TooltipProps] = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(positionRelativeToAnchor)) __obj.updateDynamic("positionRelativeToAnchor")(positionRelativeToAnchor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.TooltipProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Tooltip](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.TooltipProps])(children: _*)
  }
  @JSImport("gestalt", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
}

