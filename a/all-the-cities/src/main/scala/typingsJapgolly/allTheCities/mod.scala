package typingsJapgolly.allTheCities

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPL
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLA
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLA2
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLA3
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLA4
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLA5
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLC
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLCH
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLF
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLG
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLH
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLL
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLQ
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLR
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLS
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLW
import typingsJapgolly.allTheCities.allTheCitiesStrings.PPLX
import typingsJapgolly.allTheCities.allTheCitiesStrings.STLMT
import typingsJapgolly.allTheCities.anon.Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("all-the-cities", JSImport.Namespace)
  @js.native
  val ^ : js.Array[AllTheCitiesCity] = js.native
  
  trait AllTheCitiesCity extends StObject {
    
    var adminCode: String
    
    var altName: String
    
    var cityId: Double
    
    var country: String
    
    var featureCode: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT
    
    var loc: Coordinates
    
    var name: String
    
    var population: Double
  }
  object AllTheCitiesCity {
    
    inline def apply(
      adminCode: String,
      altName: String,
      cityId: Double,
      country: String,
      featureCode: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT,
      loc: Coordinates,
      name: String,
      population: Double
    ): AllTheCitiesCity = {
      val __obj = js.Dynamic.literal(adminCode = adminCode.asInstanceOf[js.Any], altName = altName.asInstanceOf[js.Any], cityId = cityId.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], featureCode = featureCode.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllTheCitiesCity]
    }
    
    extension [Self <: AllTheCitiesCity](x: Self) {
      
      inline def setAdminCode(value: String): Self = StObject.set(x, "adminCode", value.asInstanceOf[js.Any])
      
      inline def setAltName(value: String): Self = StObject.set(x, "altName", value.asInstanceOf[js.Any])
      
      inline def setCityId(value: Double): Self = StObject.set(x, "cityId", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setFeatureCode(
        value: PPL | PPLA | PPLC | PPLA2 | PPLW | PPLA3 | PPLX | PPLA4 | PPLL | PPLS | PPLQ | PPLF | PPLG | PPLH | PPLCH | PPLA5 | PPLR | STLMT
      ): Self = StObject.set(x, "featureCode", value.asInstanceOf[js.Any])
      
      inline def setLoc(value: Coordinates): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
    }
  }
  
  type City = AllTheCitiesCity
  
  type _To = js.Array[AllTheCitiesCity]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Array[AllTheCitiesCity] = ^
}
