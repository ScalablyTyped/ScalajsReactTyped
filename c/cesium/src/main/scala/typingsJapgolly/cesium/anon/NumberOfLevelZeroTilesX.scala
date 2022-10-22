package typingsJapgolly.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOfLevelZeroTilesX extends StObject {
  
  var ellipsoid: js.UndefOr[typingsJapgolly.cesium.mod.Ellipsoid] = js.undefined
  
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.undefined
  
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.undefined
  
  var rectangle: js.UndefOr[typingsJapgolly.cesium.mod.Rectangle] = js.undefined
}
object NumberOfLevelZeroTilesX {
  
  inline def apply(): NumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfLevelZeroTilesX]
  }
  
  extension [Self <: NumberOfLevelZeroTilesX](x: Self) {
    
    inline def setEllipsoid(value: typingsJapgolly.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setNumberOfLevelZeroTilesX(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesX", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLevelZeroTilesXUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesX", js.undefined)
    
    inline def setNumberOfLevelZeroTilesY(value: Double): Self = StObject.set(x, "numberOfLevelZeroTilesY", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLevelZeroTilesYUndefined: Self = StObject.set(x, "numberOfLevelZeroTilesY", js.undefined)
    
    inline def setRectangle(value: typingsJapgolly.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
