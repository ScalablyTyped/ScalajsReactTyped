package typingsJapgolly.reactMdMenu

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdMenu.anon.ReadonlyMenuConfiguration
import typingsJapgolly.reactMdMenu.typesTypesMod.MenuConfiguration
import typingsJapgolly.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetPosition
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMenuConfigurationProviderMod {
  
  @JSImport("@react-md/menu/types/MenuConfigurationProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/types.MenuConfigurationContext> */
  object DEFAULT_MENU_CONFIGURATION {
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.horizontal")
    @js.native
    val horizontal: Boolean = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.renderAsSheet")
    @js.native
    val renderAsSheet: RenderMenuAsSheet = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetFooter")
    @js.native
    val sheetFooter: Node = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetHeader")
    @js.native
    val sheetHeader: Node = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetPosition")
    @js.native
    val sheetPosition: SheetPosition = js.native
    
    @JSImport("@react-md/menu/types/MenuConfigurationProvider", "DEFAULT_MENU_CONFIGURATION.sheetVerticalSize")
    @js.native
    val sheetVerticalSize: SheetVerticalSize = js.native
  }
  
  inline def MenuConfigurationProvider(hasChildrenConfiguration: MenuConfigurationProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuConfigurationProvider")(hasChildrenConfiguration.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useMenuConfiguration(): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")().asInstanceOf[ReadonlyMenuConfiguration]
  inline def useMenuConfiguration(hasHorizontalRenderAsSheetSheetHeaderSheetFooterSheetPositionSheetVerticalSize: MenuConfiguration): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")(hasHorizontalRenderAsSheetSheetHeaderSheetFooterSheetPositionSheetVerticalSize.asInstanceOf[js.Any]).asInstanceOf[ReadonlyMenuConfiguration]
  
  trait MenuConfigurationProviderProps
    extends StObject
       with MenuConfiguration {
    
    var children: Node
  }
  object MenuConfigurationProviderProps {
    
    inline def apply(): MenuConfigurationProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MenuConfigurationProviderProps]
    }
    
    extension [Self <: MenuConfigurationProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
