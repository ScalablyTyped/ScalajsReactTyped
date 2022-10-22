package typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByRadius
  - typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByBox
*/
trait GeoSearchBy extends StObject
object GeoSearchBy {
  
  inline def GeoSearchByBox(height: Double, unit: GeoUnits, width: Double): typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByBox]
  }
  
  inline def GeoSearchByRadius(radius: Double, unit: GeoUnits): typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByRadius = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoSearchByRadius]
  }
}
