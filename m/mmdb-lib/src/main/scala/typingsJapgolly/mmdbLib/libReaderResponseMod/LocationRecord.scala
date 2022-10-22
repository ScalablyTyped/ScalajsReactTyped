package typingsJapgolly.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationRecord extends StObject {
  
  val accuracy_radius: Double
  
  val average_income: js.UndefOr[Double] = js.undefined
  
  val latitude: Double
  
  val longitude: Double
  
  val metro_code: js.UndefOr[Double] = js.undefined
  
  val population_density: js.UndefOr[Double] = js.undefined
  
  val time_zone: js.UndefOr[String] = js.undefined
}
object LocationRecord {
  
  inline def apply(accuracy_radius: Double, latitude: Double, longitude: Double): LocationRecord = {
    val __obj = js.Dynamic.literal(accuracy_radius = accuracy_radius.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRecord]
  }
  
  extension [Self <: LocationRecord](x: Self) {
    
    inline def setAccuracy_radius(value: Double): Self = StObject.set(x, "accuracy_radius", value.asInstanceOf[js.Any])
    
    inline def setAverage_income(value: Double): Self = StObject.set(x, "average_income", value.asInstanceOf[js.Any])
    
    inline def setAverage_incomeUndefined: Self = StObject.set(x, "average_income", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setMetro_code(value: Double): Self = StObject.set(x, "metro_code", value.asInstanceOf[js.Any])
    
    inline def setMetro_codeUndefined: Self = StObject.set(x, "metro_code", js.undefined)
    
    inline def setPopulation_density(value: Double): Self = StObject.set(x, "population_density", value.asInstanceOf[js.Any])
    
    inline def setPopulation_densityUndefined: Self = StObject.set(x, "population_density", js.undefined)
    
    inline def setTime_zone(value: String): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
  }
}
