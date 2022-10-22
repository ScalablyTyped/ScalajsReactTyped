package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.popoverTypesMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Helper {
  
  inline def apply(isOpen: Boolean): SharedBuilder_PopoverProps1849520556 = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new SharedBuilder_PopoverProps1849520556(js.Array(this.component, __props.asInstanceOf[PopoverProps]))
  }
  
  @JSImport("baseui/helper/helper", "Helper")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PopoverProps): SharedBuilder_PopoverProps1849520556 = new SharedBuilder_PopoverProps1849520556(js.Array(this.component, p.asInstanceOf[js.Any]))
}
