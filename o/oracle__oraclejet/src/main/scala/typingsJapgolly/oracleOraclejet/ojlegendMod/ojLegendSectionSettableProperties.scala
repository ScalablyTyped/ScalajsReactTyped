package typingsJapgolly.oracleOraclejet.ojlegendMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojLegendSectionSettableProperties
  extends StObject
     with JetSettableProperties {
  
  var collapsible: js.UndefOr[on | off] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textHalign: js.UndefOr[center | end | start] = js.undefined
  
  var textStyle: js.UndefOr[js.Object] = js.undefined
}
object ojLegendSectionSettableProperties {
  
  inline def apply(): ojLegendSectionSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLegendSectionSettableProperties]
  }
  
  extension [Self <: ojLegendSectionSettableProperties](x: Self) {
    
    inline def setCollapsible(value: on | off): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextHalign(value: center | end | start): Self = StObject.set(x, "textHalign", value.asInstanceOf[js.Any])
    
    inline def setTextHalignUndefined: Self = StObject.set(x, "textHalign", js.undefined)
    
    inline def setTextStyle(value: js.Object): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
