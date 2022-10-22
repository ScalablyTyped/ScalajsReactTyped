package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsIndexBarPanelMod.IndexBarPanelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Panel {
  
  inline def apply(index: String): SharedBuilder_IndexBarPanelProps_1567138904 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    new SharedBuilder_IndexBarPanelProps_1567138904(js.Array(this.component, __props.asInstanceOf[IndexBarPanelProps]))
  }
  
  @JSImport("antd-mobile/es/components/index-bar/panel", "Panel")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IndexBarPanelProps): SharedBuilder_IndexBarPanelProps_1567138904 = new SharedBuilder_IndexBarPanelProps_1567138904(js.Array(this.component, p.asInstanceOf[js.Any]))
}
