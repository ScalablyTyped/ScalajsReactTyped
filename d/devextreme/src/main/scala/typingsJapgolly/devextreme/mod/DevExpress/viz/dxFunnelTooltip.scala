package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.anon.Percent
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFunnelTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Specifies a custom template for a tooltip.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* info */ Percent, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Customizes a specific tooltip&apos;s appearance.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* info */ Percent, Any]] = js.undefined
}
object dxFunnelTooltip {
  
  inline def apply(): dxFunnelTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFunnelTooltip]
  }
  
  extension [Self <: dxFunnelTooltip](x: Self) {
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* info */ Percent, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* info */ Percent, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* info */ Percent => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
  }
}
