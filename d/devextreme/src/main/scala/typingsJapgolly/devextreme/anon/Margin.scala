package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.common.VerticalEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Margin extends StObject {
  
  /**
    * Specifies a color for the outline of the control bar elements.
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a color for the inner area of the control bar elements.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not to display the control bar.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the position of the control bar.
    */
  var horizontalAlignment: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.common.HorizontalAlignment] = js.undefined
  
  /**
    * Specifies the margin of the control bar in pixels.
    */
  var margin: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the opacity of the control bar.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the position of the control bar.
    */
  var verticalAlignment: js.UndefOr[VerticalEdge] = js.undefined
}
object Margin {
  
  inline def apply(): Margin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Margin]
  }
  
  extension [Self <: Margin](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHorizontalAlignment(value: typingsJapgolly.devextreme.mod.DevExpress.common.HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalEdge): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
