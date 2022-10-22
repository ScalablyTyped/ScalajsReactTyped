package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGGElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxPieChart.PieChartAnnotationLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPieChartCommonAnnotationConfig
  extends StObject
     with BaseWidgetAnnotationConfig {
  
  /**
    * Positions the annotation relative to a specific argument.
    */
  var argument: js.UndefOr[Double | js.Date | String] = js.undefined
  
  /**
    * Customizes the text and appearance of the annotation&apos;s tooltip.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* annotation */ dxPieChartAnnotationConfig | Any, Any]] = js.undefined
  
  /**
    * Specifies an annotation&apos;s position on the surface of a specific argument.
    */
  var location: js.UndefOr[PieChartAnnotationLocation] = js.undefined
  
  /**
    * Anchors the annotation to a series point. Accepts the name of the point&apos;s series.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a custom template for the annotation. Applies only if the type is &apos;custom&apos;.
    */
  var template: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* annotation */ dxPieChartAnnotationConfig | Any, 
      /* element */ SVGGElement, 
      String | UserDefinedElement[SVGElement]
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for an annotation&apos;s tooltip.
    */
  var tooltipTemplate: js.UndefOr[
    template | (js.Function2[
      /* annotation */ dxPieChartAnnotationConfig | Any, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
}
object dxPieChartCommonAnnotationConfig {
  
  inline def apply(): dxPieChartCommonAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPieChartCommonAnnotationConfig]
  }
  
  extension [Self <: dxPieChartCommonAnnotationConfig](x: Self) {
    
    inline def setArgument(value: Double | js.Date | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setCustomizeTooltip(value: /* annotation */ dxPieChartAnnotationConfig | Any => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setLocation(value: PieChartAnnotationLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPieChartAnnotationConfig | Any, 
          /* element */ SVGGElement, 
          String | UserDefinedElement[SVGElement]
        ])
    ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateFunction2(
      value: (/* annotation */ dxPieChartAnnotationConfig | Any, /* element */ SVGGElement) => String | UserDefinedElement[SVGElement]
    ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTooltipTemplate(
      value: template | (js.Function2[
          /* annotation */ dxPieChartAnnotationConfig | Any, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateFunction2(
      value: (/* annotation */ dxPieChartAnnotationConfig | Any, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "tooltipTemplate", js.Any.fromFunction2(value))
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
  }
}
