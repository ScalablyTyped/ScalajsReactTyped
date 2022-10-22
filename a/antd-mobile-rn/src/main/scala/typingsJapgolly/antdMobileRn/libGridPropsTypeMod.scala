package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridPropsTypeMod {
  
  trait DataItem
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var icon: js.UndefOr[Any] = js.undefined
    
    var text: js.UndefOr[Any] = js.undefined
  }
  object DataItem {
    
    inline def apply(): DataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataItem]
    }
    
    extension [Self <: DataItem](x: Self) {
      
      inline def setIcon(value: Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait GridPropsType extends StObject {
    
    var carouselMaxRow: js.UndefOr[Double] = js.undefined
    
    var columnNum: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.undefined
    
    var hasLine: js.UndefOr[Boolean] = js.undefined
    
    var isCarousel: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Unit]] = js.undefined
    
    var renderItem: js.UndefOr[
        js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Element]
      ] = js.undefined
  }
  object GridPropsType {
    
    inline def apply(): GridPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridPropsType]
    }
    
    extension [Self <: GridPropsType](x: Self) {
      
      inline def setCarouselMaxRow(value: Double): Self = StObject.set(x, "carouselMaxRow", value.asInstanceOf[js.Any])
      
      inline def setCarouselMaxRowUndefined: Self = StObject.set(x, "carouselMaxRow", js.undefined)
      
      inline def setColumnNum(value: Double): Self = StObject.set(x, "columnNum", value.asInstanceOf[js.Any])
      
      inline def setColumnNumUndefined: Self = StObject.set(x, "columnNum", js.undefined)
      
      inline def setData(value: js.Array[js.UndefOr[DataItem]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: js.UndefOr[DataItem]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHasLine(value: Boolean): Self = StObject.set(x, "hasLine", value.asInstanceOf[js.Any])
      
      inline def setHasLineUndefined: Self = StObject.set(x, "hasLine", js.undefined)
      
      inline def setIsCarousel(value: Boolean): Self = StObject.set(x, "isCarousel", value.asInstanceOf[js.Any])
      
      inline def setIsCarouselUndefined: Self = StObject.set(x, "isCarousel", js.undefined)
      
      inline def setOnClick(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* dataItem */ js.UndefOr[DataItem], t1: /* itemIndex */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRenderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Element): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    }
  }
}
