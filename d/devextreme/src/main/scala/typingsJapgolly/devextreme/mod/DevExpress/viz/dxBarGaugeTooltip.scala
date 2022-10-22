package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.anon.IndexValue
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxBarGaugeTooltip
  extends StObject
     with BaseWidgetTooltip {
  
  /**
    * Specifies a custom template for a tooltip.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function2[
      /* scaleValue */ IndexValue, 
      /* element */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Allows you to change tooltip appearance.
    */
  var customizeTooltip: js.UndefOr[js.Function1[/* scaleValue */ IndexValue, Any]] = js.undefined
  
  /**
    * Allows users to interact with the tooltip content.
    */
  var interactive: js.UndefOr[Boolean] = js.undefined
}
object dxBarGaugeTooltip {
  
  inline def apply(): dxBarGaugeTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBarGaugeTooltip]
  }
  
  extension [Self <: dxBarGaugeTooltip](x: Self) {
    
    inline def setContentTemplate(
      value: template | (js.Function2[
          /* scaleValue */ IndexValue, 
          /* element */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction2(
      value: (/* scaleValue */ IndexValue, /* element */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction2(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCustomizeTooltip(value: /* scaleValue */ IndexValue => Any): Self = StObject.set(x, "customizeTooltip", js.Any.fromFunction1(value))
    
    inline def setCustomizeTooltipUndefined: Self = StObject.set(x, "customizeTooltip", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
  }
}
