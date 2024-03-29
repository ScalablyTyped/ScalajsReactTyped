package typingsJapgolly.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envelope3DBounds
  extends StObject
     with EnvelopeBounds {
  
  var maxZ: Double
  
  var minZ: Double
}
object Envelope3DBounds {
  
  inline def apply(maxX: Double, maxY: Double, maxZ: Double, minX: Double, minY: Double, minZ: Double): Envelope3DBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], maxZ = maxZ.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], minZ = minZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope3DBounds]
  }
  
  extension [Self <: Envelope3DBounds](x: Self) {
    
    inline def setMaxZ(value: Double): Self = StObject.set(x, "maxZ", value.asInstanceOf[js.Any])
    
    inline def setMinZ(value: Double): Self = StObject.set(x, "minZ", value.asInstanceOf[js.Any])
  }
}
