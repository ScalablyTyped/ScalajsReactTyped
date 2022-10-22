package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGGElement
import typingsJapgolly.devextreme.anon.PointColor
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxPieChart.LegendItem
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxPieChart.PieChartLegendHoverMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPieChartLegend
  extends StObject
     with BaseChartLegend {
  
  /**
    * Specifies the text for a hint that appears when a user hovers the mouse pointer over a legend item.
    */
  var customizeHint: js.UndefOr[js.Function1[/* pointInfo */ PointColor, String]] = js.undefined
  
  /**
    * Allows you to change the order, text, and visibility of legend items.
    */
  @JSName("customizeItems")
  var customizeItems_dxPieChartLegend: js.UndefOr[js.Function1[/* items */ js.Array[LegendItem], js.Array[LegendItem]]] = js.undefined
  
  /**
    * Specifies a callback function that returns the text to be displayed by a legend item.
    */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ PointColor, String]] = js.undefined
  
  /**
    * Specifies what chart elements to highlight when a corresponding item in the legend is hovered over.
    */
  var hoverMode: js.UndefOr[PieChartLegendHoverMode] = js.undefined
  
  /**
    * Specifies an SVG element that serves as a custom legend item marker.
    */
  @JSName("markerTemplate")
  var markerTemplate_dxPieChartLegend: js.UndefOr[
    template | (js.Function2[
      /* legendItem */ LegendItem, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
}
object dxPieChartLegend {
  
  inline def apply(): dxPieChartLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartLegend]
  }
  
  extension [Self <: dxPieChartLegend](x: Self) {
    
    inline def setCustomizeHint(value: /* pointInfo */ PointColor => String): Self = StObject.set(x, "customizeHint", js.Any.fromFunction1(value))
    
    inline def setCustomizeHintUndefined: Self = StObject.set(x, "customizeHint", js.undefined)
    
    inline def setCustomizeItems(value: /* items */ js.Array[LegendItem] => js.Array[LegendItem]): Self = StObject.set(x, "customizeItems", js.Any.fromFunction1(value))
    
    inline def setCustomizeItemsUndefined: Self = StObject.set(x, "customizeItems", js.undefined)
    
    inline def setCustomizeText(value: /* pointInfo */ PointColor => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setHoverMode(value: PieChartLegendHoverMode): Self = StObject.set(x, "hoverMode", value.asInstanceOf[js.Any])
    
    inline def setHoverModeUndefined: Self = StObject.set(x, "hoverMode", js.undefined)
    
    inline def setMarkerTemplate(
      value: template | (js.Function2[
          /* legendItem */ LegendItem, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "markerTemplate", value.asInstanceOf[js.Any])
    
    inline def setMarkerTemplateFunction2(
      value: (/* legendItem */ LegendItem, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "markerTemplate", js.Any.fromFunction2(value))
    
    inline def setMarkerTemplateUndefined: Self = StObject.set(x, "markerTemplate", js.undefined)
  }
}
