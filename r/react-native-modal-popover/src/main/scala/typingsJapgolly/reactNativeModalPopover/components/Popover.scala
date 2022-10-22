package typingsJapgolly.reactNativeModalPopover.components

import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Rect
import typingsJapgolly.reactNativeModalPopover.libPopoverMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  inline def apply(fromRect: Rect): SharedBuilder_PopoverProps1286577087[typingsJapgolly.reactNativeModalPopover.mod.Popover] = {
    val __props = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    new SharedBuilder_PopoverProps1286577087[typingsJapgolly.reactNativeModalPopover.mod.Popover](js.Array(this.component, __props.asInstanceOf[PopoverProps]))
  }
  
  @JSImport("react-native-modal-popover", "Popover")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps1286577087[typingsJapgolly.reactNativeModalPopover.mod.Popover] = new SharedBuilder_PopoverProps1286577087[typingsJapgolly.reactNativeModalPopover.mod.Popover](js.Array(this.component, p.asInstanceOf[js.Any]))
}
