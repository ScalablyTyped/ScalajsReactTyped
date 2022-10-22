package typingsJapgolly.rcMenu.components

import typingsJapgolly.rcMenu.esInterfaceMod.MenuRef
import typingsJapgolly.rcMenu.esMenuMod.MenuProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Menu {
  
  @JSImport("rc-menu/es/Menu", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Menu.type): SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef] = new SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MenuProps & RefAttributes[MenuRef]): SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef] = new SharedBuilder_MenuPropsRefAttributes1076915477[MenuRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
