package typingsJapgolly.placemarkioCheckGeojson

import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.Ctx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distForbidConfusingPropertiesMod {
  
  @JSImport("@placemarkio/check-geojson/dist/forbid_confusing_properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forbidConfusingProperties(
    ctx: Ctx,
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ObjectNode */ Any,
    propertiesFrom: PropertiesFrom
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forbidConfusingProperties")(ctx.asInstanceOf[js.Any], node.asInstanceOf[js.Any], propertiesFrom.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature
    - typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection
    - typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Geometry
  */
  trait PropertiesFrom extends StObject
  object PropertiesFrom {
    
    inline def Feature: typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature = "Feature".asInstanceOf[typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Feature]
    
    inline def FeatureCollection: typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.FeatureCollection]
    
    inline def Geometry: typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Geometry = "Geometry".asInstanceOf[typingsJapgolly.placemarkioCheckGeojson.placemarkioCheckGeojsonStrings.Geometry]
  }
}
