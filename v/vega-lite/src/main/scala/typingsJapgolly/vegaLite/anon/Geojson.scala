package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.vegaLiteStrings.geojson
import typingsJapgolly.vegaLite.vegaLiteStrings.nominal
import typingsJapgolly.vegaLite.vegaLiteStrings.ordinal
import typingsJapgolly.vegaLite.vegaLiteStrings.quantitative
import typingsJapgolly.vegaLite.vegaLiteStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geojson extends StObject {
  
  val geojson: typingsJapgolly.vegaLite.vegaLiteStrings.geojson
  
  val nominal: typingsJapgolly.vegaLite.vegaLiteStrings.nominal
  
  val ordinal: typingsJapgolly.vegaLite.vegaLiteStrings.ordinal
  
  val quantitative: typingsJapgolly.vegaLite.vegaLiteStrings.quantitative
  
  val temporal: typingsJapgolly.vegaLite.vegaLiteStrings.temporal
}
object Geojson {
  
  inline def apply(): Geojson = {
    val __obj = js.Dynamic.literal(geojson = "geojson", nominal = "nominal", ordinal = "ordinal", quantitative = "quantitative", temporal = "temporal")
    __obj.asInstanceOf[Geojson]
  }
  
  extension [Self <: Geojson](x: Self) {
    
    inline def setGeojson(value: geojson): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    inline def setNominal(value: nominal): Self = StObject.set(x, "nominal", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: ordinal): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setQuantitative(value: quantitative): Self = StObject.set(x, "quantitative", value.asInstanceOf[js.Any])
    
    inline def setTemporal(value: temporal): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
  }
}
