package typingsJapgolly.reactMdMenu.typesTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetPosition
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetVerticalSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@react-md/menu.@react-md/menu/types/types.MenuConfiguration> */
trait MenuConfigurationContext extends StObject {
  
  var horizontal: Boolean
  
  var renderAsSheet: RenderMenuAsSheet
  
  var sheetFooter: Node
  
  var sheetHeader: Node
  
  var sheetPosition: SheetPosition
  
  var sheetVerticalSize: SheetVerticalSize
}
object MenuConfigurationContext {
  
  inline def apply(
    horizontal: Boolean,
    renderAsSheet: RenderMenuAsSheet,
    sheetPosition: SheetPosition,
    sheetVerticalSize: SheetVerticalSize
  ): MenuConfigurationContext = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], renderAsSheet = renderAsSheet.asInstanceOf[js.Any], sheetPosition = sheetPosition.asInstanceOf[js.Any], sheetVerticalSize = sheetVerticalSize.asInstanceOf[js.Any], sheetFooter = null, sheetHeader = null)
    __obj.asInstanceOf[MenuConfigurationContext]
  }
  
  extension [Self <: MenuConfigurationContext](x: Self) {
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setRenderAsSheet(value: RenderMenuAsSheet): Self = StObject.set(x, "renderAsSheet", value.asInstanceOf[js.Any])
    
    inline def setSheetFooter(value: VdomNode): Self = StObject.set(x, "sheetFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSheetFooterNull: Self = StObject.set(x, "sheetFooter", null)
    
    inline def setSheetFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sheetFooter", js.Array(value*))
    
    inline def setSheetFooterVdomElement(value: VdomElement): Self = StObject.set(x, "sheetFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSheetHeader(value: VdomNode): Self = StObject.set(x, "sheetHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSheetHeaderNull: Self = StObject.set(x, "sheetHeader", null)
    
    inline def setSheetHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sheetHeader", js.Array(value*))
    
    inline def setSheetHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "sheetHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSheetPosition(value: SheetPosition): Self = StObject.set(x, "sheetPosition", value.asInstanceOf[js.Any])
    
    inline def setSheetVerticalSize(value: SheetVerticalSize): Self = StObject.set(x, "sheetVerticalSize", value.asInstanceOf[js.Any])
  }
}
