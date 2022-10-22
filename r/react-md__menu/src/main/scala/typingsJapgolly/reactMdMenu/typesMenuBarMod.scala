package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactMdMenu.typesMenuBarProviderMod.HoverableMenuBar
import typingsJapgolly.reactMdMenu.typesMenuBarWidgetMod.MenuBarWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuBarMod {
  
  @JSImport("@react-md/menu/types/MenuBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuBar(hasHoverTimeoutProps: MenuBarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBar")(hasHoverTimeoutProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type MenuBarProps = MenuBarWidgetProps & HoverableMenuBar
}
