package typingsJapgolly.tensorflowTfjsLayers.distLayersCoreMod

import typingsJapgolly.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typingsJapgolly.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenLayerArgs
  extends StObject
     with LayerArgs {
  
  /** Image data format: channelsLast (default) or channelsFirst. */
  var dataFormat: js.UndefOr[DataFormat] = js.undefined
}
object FlattenLayerArgs {
  
  inline def apply(): FlattenLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenLayerArgs]
  }
  
  extension [Self <: FlattenLayerArgs](x: Self) {
    
    inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
  }
}
