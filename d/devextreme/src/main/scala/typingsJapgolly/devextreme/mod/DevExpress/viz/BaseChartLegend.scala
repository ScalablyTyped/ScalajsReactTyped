package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGGElement
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChartLegend
  extends StObject
     with BaseLegend {
  
  /**
    * Allows you to change the order, text, and visibility of legend items.
    */
  var customizeItems: js.UndefOr[
    js.Function1[/* items */ js.Array[BaseChartLegendItem], js.Array[BaseChartLegendItem]]
  ] = js.undefined
  
  /**
    * Specifies an SVG element that serves as a custom legend item marker.
    */
  var markerTemplate: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ BaseChartLegendItem, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
}
object BaseChartLegend {
  
  inline def apply(): BaseChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartLegend]
  }
  
  extension [Self <: BaseChartLegend](x: Self) {
    
    inline def setCustomizeItems(value: /* items */ js.Array[BaseChartLegendItem] => js.Array[BaseChartLegendItem]): Self = StObject.set(x, "customizeItems", js.Any.fromFunction1(value))
    
    inline def setCustomizeItemsUndefined: Self = StObject.set(x, "customizeItems", js.undefined)
    
    inline def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ BaseChartLegendItem, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
    
    inline def setMarkerTemplateFunction2(
      value: (/* legendItem */ BaseChartLegendItem, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "markerTemplate", js.Any.fromFunction2(value))
    
    inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
  }
}
