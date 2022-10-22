package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionUniform
  extends StObject
     with Distribution {
  
  var function: uniform
  
  var max: js.UndefOr[Double | SignalRef] = js.undefined
  
  var min: js.UndefOr[Double | SignalRef] = js.undefined
}
object DistributionUniform {
  
  inline def apply(): DistributionUniform = {
    val __obj = js.Dynamic.literal(function = "uniform")
    __obj.asInstanceOf[DistributionUniform]
  }
  
  extension [Self <: DistributionUniform](x: Self) {
    
    inline def setFunction(value: uniform): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double | SignalRef): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double | SignalRef): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
