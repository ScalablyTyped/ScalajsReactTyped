package typingsJapgolly.rcMenu

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLUListElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSubMenuSubMenuListMod extends Shortcut {
  
  @JSImport("rc-menu/es/SubMenu/SubMenuList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SubMenuListProps & RefAttributes[HTMLUListElement]] = js.native
  
  trait SubMenuListProps
    extends StObject
       with HTMLAttributes[HTMLUListElement]
  object SubMenuListProps {
    
    inline def apply(): SubMenuListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubMenuListProps]
    }
  }
  
  type _To = ForwardRefExoticComponent[SubMenuListProps & RefAttributes[HTMLUListElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esSubMenuSubMenuListMod.foo` */
  override def _to: ForwardRefExoticComponent[SubMenuListProps & RefAttributes[HTMLUListElement]] = default
}
