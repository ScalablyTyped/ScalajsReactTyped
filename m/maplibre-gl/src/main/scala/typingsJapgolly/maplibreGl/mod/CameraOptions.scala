package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraOptions
  extends StObject
     with CenterZoomBearing {
  
  var around: js.UndefOr[LngLatLike] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
}
object CameraOptions {
  
  inline def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  
  extension [Self <: CameraOptions](x: Self) {
    
    inline def setAround(value: LngLatLike): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
  }
}
