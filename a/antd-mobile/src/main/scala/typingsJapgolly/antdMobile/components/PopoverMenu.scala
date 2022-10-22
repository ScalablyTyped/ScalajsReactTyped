package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.anon.OmitPopoverPropscontentac
import typingsJapgolly.antdMobile.esComponentsPopoverPopoverMenuMod.Action
import typingsJapgolly.antdMobile.esComponentsPopoverPopoverMod.PopoverRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PopoverMenu {
  
  inline def apply(actions: js.Array[Action]): SharedBuilder_OmitPopoverPropscontentac362473843[PopoverRef] = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new SharedBuilder_OmitPopoverPropscontentac362473843[PopoverRef](js.Array(this.component, __props.asInstanceOf[OmitPopoverPropscontentac]))
  }
  
  @JSImport("antd-mobile/es/components/popover/popover-menu", "PopoverMenu")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OmitPopoverPropscontentac): SharedBuilder_OmitPopoverPropscontentac362473843[PopoverRef] = new SharedBuilder_OmitPopoverPropscontentac362473843[PopoverRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
