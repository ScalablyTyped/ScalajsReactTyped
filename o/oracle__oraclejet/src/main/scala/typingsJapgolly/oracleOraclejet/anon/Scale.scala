package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojtimeaxisMod.ojTimeAxis.Converters
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.days
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.hours
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.minutes
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.months
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quarters
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.seconds
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.weeks
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var converter: js.UndefOr[
    Converters | typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter[String]
  ] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var scale: seconds | minutes | hours | days | weeks | months | quarters | years
  
  var zoomOrder: js.UndefOr[js.Array[String]] = js.undefined
}
object Scale {
  
  inline def apply(scale: seconds | minutes | hours | days | weeks | months | quarters | years): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  extension [Self <: Scale](x: Self) {
    
    inline def setConverter(value: Converters | typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.Converter[String]): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScale(value: seconds | minutes | hours | days | weeks | months | quarters | years): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setZoomOrder(value: js.Array[String]): Self = StObject.set(x, "zoomOrder", value.asInstanceOf[js.Any])
    
    inline def setZoomOrderUndefined: Self = StObject.set(x, "zoomOrder", js.undefined)
    
    inline def setZoomOrderVarargs(value: String*): Self = StObject.set(x, "zoomOrder", js.Array(value*))
  }
}
