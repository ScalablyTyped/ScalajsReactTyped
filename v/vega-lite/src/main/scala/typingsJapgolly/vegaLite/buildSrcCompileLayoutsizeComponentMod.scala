package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcCompileSplitMod.Split
import typingsJapgolly.vegaLite.vegaLiteStrings.height
import typingsJapgolly.vegaLite.vegaLiteStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLayoutsizeComponentMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSizeTypeFromLayoutSizeType(layoutSizeType: LayoutSizeType): width | height = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeTypeFromLayoutSizeType")(layoutSizeType.asInstanceOf[js.Any]).asInstanceOf[width | height]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.vegaLite.vegaLiteStrings.container
    - typingsJapgolly.vegaLite.vegaLiteStrings.step
    - typingsJapgolly.vegaLite.vegaLiteStrings.merged
  */
  type LayoutSize = _LayoutSize | Double
  
  type LayoutSizeComponent = Split[LayoutSizeIndex]
  
  trait LayoutSizeIndex extends StObject {
    
    var childHeight: js.UndefOr[LayoutSize] = js.undefined
    
    var childWidth: js.UndefOr[LayoutSize] = js.undefined
    
    var height: js.UndefOr[LayoutSize] = js.undefined
    
    var width: js.UndefOr[LayoutSize] = js.undefined
  }
  object LayoutSizeIndex {
    
    inline def apply(): LayoutSizeIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutSizeIndex]
    }
    
    extension [Self <: LayoutSizeIndex](x: Self) {
      
      inline def setChildHeight(value: LayoutSize): Self = StObject.set(x, "childHeight", value.asInstanceOf[js.Any])
      
      inline def setChildHeightUndefined: Self = StObject.set(x, "childHeight", js.undefined)
      
      inline def setChildWidth(value: LayoutSize): Self = StObject.set(x, "childWidth", value.asInstanceOf[js.Any])
      
      inline def setChildWidthUndefined: Self = StObject.set(x, "childWidth", js.undefined)
      
      inline def setHeight(value: LayoutSize): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: LayoutSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.width
    - typingsJapgolly.vegaLite.vegaLiteStrings.childWidth
    - typingsJapgolly.vegaLite.vegaLiteStrings.height
    - typingsJapgolly.vegaLite.vegaLiteStrings.childHeight
  */
  trait LayoutSizeType extends StObject
  
  trait _LayoutSize extends StObject
}
