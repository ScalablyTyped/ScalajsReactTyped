package typingsJapgolly.topojsonServer

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.topojsonSpecification.mod.Objects
import typingsJapgolly.topojsonSpecification.mod.Properties
import typingsJapgolly.topojsonSpecification.mod.Topology
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("topojson-server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def topology(objects: StringDictionary[GeoJsonObject]): Topology[Objects[Properties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("topology")(objects.asInstanceOf[js.Any]).asInstanceOf[Topology[Objects[Properties]]]
  inline def topology(objects: StringDictionary[GeoJsonObject], quantization: Double): Topology[Objects[Properties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("topology")(objects.asInstanceOf[js.Any], quantization.asInstanceOf[js.Any])).asInstanceOf[Topology[Objects[Properties]]]
}
