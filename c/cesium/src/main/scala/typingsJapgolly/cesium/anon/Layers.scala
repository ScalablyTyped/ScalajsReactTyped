package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.createElevationBandMaterialBand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Layers extends StObject {
  
  var layers: js.Array[createElevationBandMaterialBand]
  
  var scene: typingsJapgolly.cesium.mod.Scene
}
object Layers {
  
  inline def apply(layers: js.Array[createElevationBandMaterialBand], scene: typingsJapgolly.cesium.mod.Scene): Layers = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layers]
  }
  
  extension [Self <: Layers](x: Self) {
    
    inline def setLayers(value: js.Array[createElevationBandMaterialBand]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersVarargs(value: createElevationBandMaterialBand*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setScene(value: typingsJapgolly.cesium.mod.Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
