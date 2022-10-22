package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcLegendMod.LegendConfig
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Orientation
import typingsJapgolly.vegaTypings.typesSpecLegendMod.LegendOrient
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: Orientation
  
  var legendConfig: LegendConfig[SignalRef]
  
  var model: typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
  
  var orient: LegendOrient
  
  var scaleType: typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType
}
object Direction {
  
  inline def apply(
    direction: Orientation,
    legendConfig: LegendConfig[SignalRef],
    model: typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model,
    orient: LegendOrient,
    scaleType: typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType
  ): Direction = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], legendConfig = legendConfig.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: Orientation): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setLegendConfig(value: LegendConfig[SignalRef]): Self = StObject.set(x, "legendConfig", value.asInstanceOf[js.Any])
    
    inline def setModel(value: typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setOrient(value: LegendOrient): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typingsJapgolly.vegaLite.buildSrcScaleMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
  }
}
