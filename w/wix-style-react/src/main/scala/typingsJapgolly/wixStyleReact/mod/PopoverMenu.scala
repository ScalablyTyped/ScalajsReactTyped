package typingsJapgolly.wixStyleReact.mod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.wixStyleReact.distTypesPopoverMenuMod.PopoverMenuDividerProps
import typingsJapgolly.wixStyleReact.distTypesPopoverMenuMod.PopoverMenuItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "PopoverMenu")
@js.native
open class PopoverMenu ()
  extends typingsJapgolly.wixStyleReact.distTypesPopoverMenuMod.default
/* static members */
object PopoverMenu {
  
  @JSImport("wix-style-react", "PopoverMenu")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Divider(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")().asInstanceOf[Element]
  inline def Divider(props: PopoverMenuDividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def MenuItem(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")().asInstanceOf[Element]
  inline def MenuItem(props: PopoverMenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
