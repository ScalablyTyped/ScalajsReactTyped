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

trait MenuConfiguration
  extends StObject
     with MenuOrientationProps {
  
  /** {@inheritDoc RenderMenuAsSheet} */
  var renderAsSheet: js.UndefOr[RenderMenuAsSheet] = js.undefined
  
  /**
    * Any children to render below the sheet's menu implementation. This would
    * normally be something like a `<DialogFooter>`.
    *
    * @defaultValue `null`
    */
  var sheetFooter: js.UndefOr[Node] = js.undefined
  
  /**
    * Any children to render above the sheet's menu implementation. This would
    * normally be something like a `<DialogHeader>` or `AppBar`.
    *
    * @defaultValue `null`
    */
  var sheetHeader: js.UndefOr[Node] = js.undefined
  
  /**
    * @see {@link SheetPosition}
    * @defaultValue `"bottom"`
    */
  var sheetPosition: js.UndefOr[SheetPosition] = js.undefined
  
  /**
    * @see {@link SheetVerticalSize}
    * @defaultValue `"touch"`
    */
  var sheetVerticalSize: js.UndefOr[SheetVerticalSize] = js.undefined
}
object MenuConfiguration {
  
  inline def apply(): MenuConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuConfiguration]
  }
  
  extension [Self <: MenuConfiguration](x: Self) {
    
    inline def setRenderAsSheet(value: RenderMenuAsSheet): Self = StObject.set(x, "renderAsSheet", value.asInstanceOf[js.Any])
    
    inline def setRenderAsSheetUndefined: Self = StObject.set(x, "renderAsSheet", js.undefined)
    
    inline def setSheetFooter(value: VdomNode): Self = StObject.set(x, "sheetFooter", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSheetFooterNull: Self = StObject.set(x, "sheetFooter", null)
    
    inline def setSheetFooterUndefined: Self = StObject.set(x, "sheetFooter", js.undefined)
    
    inline def setSheetFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sheetFooter", js.Array(value*))
    
    inline def setSheetFooterVdomElement(value: VdomElement): Self = StObject.set(x, "sheetFooter", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSheetHeader(value: VdomNode): Self = StObject.set(x, "sheetHeader", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSheetHeaderNull: Self = StObject.set(x, "sheetHeader", null)
    
    inline def setSheetHeaderUndefined: Self = StObject.set(x, "sheetHeader", js.undefined)
    
    inline def setSheetHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "sheetHeader", js.Array(value*))
    
    inline def setSheetHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "sheetHeader", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSheetPosition(value: SheetPosition): Self = StObject.set(x, "sheetPosition", value.asInstanceOf[js.Any])
    
    inline def setSheetPositionUndefined: Self = StObject.set(x, "sheetPosition", js.undefined)
    
    inline def setSheetVerticalSize(value: SheetVerticalSize): Self = StObject.set(x, "sheetVerticalSize", value.asInstanceOf[js.Any])
    
    inline def setSheetVerticalSizeUndefined: Self = StObject.set(x, "sheetVerticalSize", js.undefined)
  }
}
