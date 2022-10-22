package typingsJapgolly.vegaTypings.typesSpecTransformMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionNormal
  extends StObject
     with Distribution {
  
  var function: normal
  
  var mean: js.UndefOr[Double | SignalRef] = js.undefined
  
  var stdev: js.UndefOr[Double | SignalRef] = js.undefined
}
object DistributionNormal {
  
  inline def apply(): DistributionNormal = {
    val __obj = js.Dynamic.literal(function = "normal")
    __obj.asInstanceOf[DistributionNormal]
  }
  
  extension [Self <: DistributionNormal](x: Self) {
    
    inline def setFunction(value: normal): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setMean(value: Double | SignalRef): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
    
    inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    
    inline def setStdev(value: Double | SignalRef): Self = StObject.set(x, "stdev", value.asInstanceOf[js.Any])
    
    inline def setStdevUndefined: Self = StObject.set(x, "stdev", js.undefined)
  }
}
