package typingsJapgolly.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Center extends StObject {
  
  var arcGenerator: typingsJapgolly.nivoChord.distTypesTypesMod.ArcGenerator
  
  var center: js.Tuple2[Double, Double]
  
  var innerRadius: Double
  
  var radius: Double
  
  var ribbonGenerator: typingsJapgolly.nivoChord.distTypesTypesMod.RibbonGenerator
}
object Center {
  
  inline def apply(
    arcGenerator: typingsJapgolly.nivoChord.distTypesTypesMod.ArcGenerator,
    center: js.Tuple2[Double, Double],
    innerRadius: Double,
    radius: Double,
    ribbonGenerator: typingsJapgolly.nivoChord.distTypesTypesMod.RibbonGenerator
  ): Center = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
  
  extension [Self <: Center](x: Self) {
    
    inline def setArcGenerator(value: typingsJapgolly.nivoChord.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRibbonGenerator(value: typingsJapgolly.nivoChord.distTypesTypesMod.RibbonGenerator): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
  }
}
