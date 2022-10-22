package typingsJapgolly.antd.components

import typingsJapgolly.antd.libMenuMenuDividerMod.MenuDividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MenuDivider {
  
  @JSImport("antd/lib/menu/MenuDivider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuDivider.type): SharedBuilder_MenuDividerProps622254111 = new SharedBuilder_MenuDividerProps622254111(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuDividerProps): SharedBuilder_MenuDividerProps622254111 = new SharedBuilder_MenuDividerProps622254111(js.Array(this.component, p.asInstanceOf[js.Any]))
}
