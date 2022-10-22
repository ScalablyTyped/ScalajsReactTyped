package typingsJapgolly.mapboxGl.anon

import typingsJapgolly.mapboxGl.mapboxGlStrings.albers
import typingsJapgolly.mapboxGl.mapboxGlStrings.equalEarth
import typingsJapgolly.mapboxGl.mapboxGlStrings.equirectangular
import typingsJapgolly.mapboxGl.mapboxGlStrings.globe
import typingsJapgolly.mapboxGl.mapboxGlStrings.lambertConformalConic
import typingsJapgolly.mapboxGl.mapboxGlStrings.mercator
import typingsJapgolly.mapboxGl.mapboxGlStrings.naturalEarth
import typingsJapgolly.mapboxGl.mapboxGlStrings.winkelTripel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var center: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var name: albers | equalEarth | equirectangular | lambertConformalConic | mercator | naturalEarth | winkelTripel | globe
  
  var parallels: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object Center {
  
  inline def apply(
    name: albers | equalEarth | equirectangular | lambertConformalConic | mercator | naturalEarth | winkelTripel | globe
  ): Center = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setName(
      value: albers | equalEarth | equirectangular | lambertConformalConic | mercator | naturalEarth | winkelTripel | globe
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParallels(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
    
    inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
  }
}
