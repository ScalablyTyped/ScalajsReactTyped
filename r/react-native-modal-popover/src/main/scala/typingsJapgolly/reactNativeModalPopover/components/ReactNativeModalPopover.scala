package typingsJapgolly.reactNativeModalPopover.components

import typingsJapgolly.reactNativeModalPopover.libPopoverGeometryMod.Rect
import typingsJapgolly.reactNativeModalPopover.libPopoverMod.PopoverProps
import typingsJapgolly.reactNativeModalPopover.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeModalPopover {
  
  inline def apply(fromRect: Rect): SharedBuilder_PopoverProps1286577087[default] = {
    val __props = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
    new SharedBuilder_PopoverProps1286577087[default](js.Array(this.component, __props.asInstanceOf[PopoverProps]))
  }
  
  @JSImport("react-native-modal-popover", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps1286577087[default] = new SharedBuilder_PopoverProps1286577087[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
