package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojchartMod.ojChart.PieCenterContext
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.billion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.million
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trillion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Converter extends StObject {
  
  var converter: js.Object
  
  var label: String
  
  var labelStyle: js.Object
  
  def renderer(context: PieCenterContext): Insert | PreventDefault
  
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
}
object Converter {
  
  inline def apply(
    converter: js.Object,
    label: String,
    labelStyle: js.Object,
    renderer: PieCenterContext => Insert | PreventDefault,
    scaling: none | thousand | million | billion | trillion | quadrillion | auto
  ): Converter = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), scaling = scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converter]
  }
  
  extension [Self <: Converter](x: Self) {
    
    inline def setConverter(value: js.Object): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: PieCenterContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
  }
}
