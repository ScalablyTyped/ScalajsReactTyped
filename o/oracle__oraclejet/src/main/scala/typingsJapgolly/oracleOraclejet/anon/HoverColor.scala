package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.horizontal
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.inner
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outer
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.rotated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverColor extends StObject {
  
  var borderColor: String
  
  var borderWidth: Double
  
  var hoverColor: String
  
  var labelDisplay: horizontal | rotated | off | auto
  
  var labelHalign: inner | outer | center
  
  var labelMinLength: Double
  
  var labelStyle: js.Object
  
  var selectedInnerColor: String
  
  var selectedOuterColor: String
  
  var showDisclosure: on | off
}
object HoverColor {
  
  inline def apply(
    borderColor: String,
    borderWidth: Double,
    hoverColor: String,
    labelDisplay: horizontal | rotated | off | auto,
    labelHalign: inner | outer | center,
    labelMinLength: Double,
    labelStyle: js.Object,
    selectedInnerColor: String,
    selectedOuterColor: String,
    showDisclosure: on | off
  ): HoverColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], hoverColor = hoverColor.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelHalign = labelHalign.asInstanceOf[js.Any], labelMinLength = labelMinLength.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], selectedInnerColor = selectedInnerColor.asInstanceOf[js.Any], selectedOuterColor = selectedOuterColor.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverColor]
  }
  
  extension [Self <: HoverColor](x: Self) {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: horizontal | rotated | off | auto): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelHalign(value: inner | outer | center): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    inline def setLabelMinLength(value: Double): Self = StObject.set(x, "labelMinLength", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedInnerColor(value: String): Self = StObject.set(x, "selectedInnerColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedOuterColor(value: String): Self = StObject.set(x, "selectedOuterColor", value.asInstanceOf[js.Any])
    
    inline def setShowDisclosure(value: on | off): Self = StObject.set(x, "showDisclosure", value.asInstanceOf[js.Any])
  }
}
