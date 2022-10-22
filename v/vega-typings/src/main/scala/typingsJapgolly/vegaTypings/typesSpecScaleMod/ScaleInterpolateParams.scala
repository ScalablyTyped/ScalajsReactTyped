package typingsJapgolly.vegaTypings.typesSpecScaleMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.`cubehelix-long`
import typingsJapgolly.vegaTypings.vegaTypingsStrings.cubehelix
import typingsJapgolly.vegaTypings.vegaTypingsStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleInterpolateParams
  extends StObject
     with ScaleInterpolate {
  
  var gamma: js.UndefOr[Double | SignalRef] = js.undefined
  
  var `type`: rgb | cubehelix | `cubehelix-long` | SignalRef
}
object ScaleInterpolateParams {
  
  inline def apply(`type`: rgb | cubehelix | `cubehelix-long` | SignalRef): ScaleInterpolateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleInterpolateParams]
  }
  
  extension [Self <: ScaleInterpolateParams](x: Self) {
    
    inline def setGamma(value: Double | SignalRef): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setType(value: rgb | cubehelix | `cubehelix-long` | SignalRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
