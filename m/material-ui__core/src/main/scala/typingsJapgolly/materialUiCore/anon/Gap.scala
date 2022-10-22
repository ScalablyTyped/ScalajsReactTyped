package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gap extends StObject {
  
  /**
    * Cell height in `px`.
    * Set to `'auto'` to let the children determine the height.
    * @deprecated Use rowHeight instead.
    */
  var cellHeight: js.UndefOr[Double | auto] = js.undefined
  
  /**
    * Items that will be in the image list.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * Number of columns.
    */
  var cols: js.UndefOr[Double] = js.undefined
  
  /**
    * The gap between items in `px`.
    */
  var gap: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of one row in `px`.
    */
  var rowHeight: js.UndefOr[Double | auto] = js.undefined
  
  /**
    * The spacing between items in `px`.
    * @deprecated Use gap instead.
    */
  var spacing: js.UndefOr[Double] = js.undefined
}
object Gap {
  
  inline def apply(): Gap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gap]
  }
  
  extension [Self <: Gap](x: Self) {
    
    inline def setCellHeight(value: Double | auto): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setRowHeight(value: Double | auto): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
