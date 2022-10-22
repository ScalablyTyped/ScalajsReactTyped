package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.baseui.blockTypesMod.BlockProps
import typingsJapgolly.baseui.blockTypesMod.Responsive
import typingsJapgolly.baseui.blockTypesMod.Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexGridTypesMod {
  
  trait FlexGridItemProps[T /* <: ElementType */]
    extends StObject
       with FlexGridProps[T] {
    
    /** Total count of items in FlexGrid, used to determine gaps **/
    var flexGridItemCount: js.UndefOr[Double] = js.undefined
    
    /** Index of item in FlexGrid, used to determine gaps **/
    var flexGridItemIndex: js.UndefOr[Double] = js.undefined
  }
  object FlexGridItemProps {
    
    inline def apply[T /* <: ElementType */](): FlexGridItemProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridItemProps[T]]
    }
    
    extension [Self <: FlexGridItemProps[?], T /* <: ElementType */](x: Self & FlexGridItemProps[T]) {
      
      inline def setFlexGridItemCount(value: Double): Self = StObject.set(x, "flexGridItemCount", value.asInstanceOf[js.Any])
      
      inline def setFlexGridItemCountUndefined: Self = StObject.set(x, "flexGridItemCount", js.undefined)
      
      inline def setFlexGridItemIndex(value: Double): Self = StObject.set(x, "flexGridItemIndex", value.asInstanceOf[js.Any])
      
      inline def setFlexGridItemIndexUndefined: Self = StObject.set(x, "flexGridItemIndex", js.undefined)
    }
  }
  
  trait FlexGridProps[T /* <: ElementType */]
    extends StObject
       with BlockProps[T] {
    
    /** Number of equal-width columns to allow for */
    var flexGridColumnCount: js.UndefOr[Responsive[Double]] = js.undefined
    
    /** Grid gap between columns */
    var flexGridColumnGap: js.UndefOr[Responsive[Scale]] = js.undefined
    
    /** Grid gap between rows */
    var flexGridRowGap: js.UndefOr[Responsive[Scale]] = js.undefined
  }
  object FlexGridProps {
    
    inline def apply[T /* <: ElementType */](): FlexGridProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexGridProps[T]]
    }
    
    extension [Self <: FlexGridProps[?], T /* <: ElementType */](x: Self & FlexGridProps[T]) {
      
      inline def setFlexGridColumnCount(value: Responsive[Double]): Self = StObject.set(x, "flexGridColumnCount", value.asInstanceOf[js.Any])
      
      inline def setFlexGridColumnCountUndefined: Self = StObject.set(x, "flexGridColumnCount", js.undefined)
      
      inline def setFlexGridColumnCountVarargs(value: Double*): Self = StObject.set(x, "flexGridColumnCount", js.Array(value*))
      
      inline def setFlexGridColumnGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridColumnGap", value.asInstanceOf[js.Any])
      
      inline def setFlexGridColumnGapUndefined: Self = StObject.set(x, "flexGridColumnGap", js.undefined)
      
      inline def setFlexGridColumnGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridColumnGap", js.Array(value*))
      
      inline def setFlexGridRowGap(value: Responsive[Scale]): Self = StObject.set(x, "flexGridRowGap", value.asInstanceOf[js.Any])
      
      inline def setFlexGridRowGapUndefined: Self = StObject.set(x, "flexGridRowGap", js.undefined)
      
      inline def setFlexGridRowGapVarargs(value: Scale*): Self = StObject.set(x, "flexGridRowGap", js.Array(value*))
    }
  }
}
