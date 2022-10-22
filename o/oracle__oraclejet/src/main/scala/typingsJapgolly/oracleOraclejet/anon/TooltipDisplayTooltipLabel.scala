package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipDisplayTooltipLabel extends StObject {
  
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  
  var tooltipLabel: js.UndefOr[String] = js.undefined
}
object TooltipDisplayTooltipLabel {
  
  inline def apply(): TooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipDisplayTooltipLabel]
  }
  
  extension [Self <: TooltipDisplayTooltipLabel](x: Self) {
    
    inline def setTooltipDisplay(value: off | auto): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
    inline def setTooltipLabel(value: String): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
  }
}
