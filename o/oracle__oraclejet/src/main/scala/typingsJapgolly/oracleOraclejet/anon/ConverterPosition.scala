package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.billion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.insideIndicatorEdge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.million
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.number
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outsideIndicatorEdge
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.outsidePlotArea
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.percent
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.withLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConverterPosition extends StObject {
  
  var converter: js.UndefOr[typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter[String]] = js.undefined
  
  var position: js.UndefOr[
    center | insideIndicatorEdge | outsideIndicatorEdge | outsidePlotArea | withLabel | auto
  ] = js.undefined
  
  var rendered: js.UndefOr[on | off | auto] = js.undefined
  
  var scaling: js.UndefOr[none | thousand | million | billion | trillion | quadrillion | auto] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var textType: js.UndefOr[percent | number] = js.undefined
}
object ConverterPosition {
  
  inline def apply(): ConverterPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConverterPosition]
  }
  
  extension [Self <: ConverterPosition](x: Self) {
    
    inline def setConverter(value: typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setPosition(value: center | insideIndicatorEdge | outsideIndicatorEdge | outsidePlotArea | withLabel | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRendered(value: on | off | auto): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setScaling(value: none | thousand | million | billion | trillion | quadrillion | auto): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
    
    inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextType(value: percent | number): Self = StObject.set(x, "textType", value.asInstanceOf[js.Any])
    
    inline def setTextTypeUndefined: Self = StObject.set(x, "textType", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
