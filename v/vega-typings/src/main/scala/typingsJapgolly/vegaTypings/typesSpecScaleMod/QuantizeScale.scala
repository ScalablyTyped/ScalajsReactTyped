package typingsJapgolly.vegaTypings.typesSpecScaleMod

import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.vegaTypingsStrings.quantize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantizeScale
  extends StObject
     with BaseScale
     with Scale {
  
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var range: js.UndefOr[RangeScheme] = js.undefined
  
  @JSName("type")
  var type_QuantizeScale: js.UndefOr[quantize] = js.undefined
  
  var zero: js.UndefOr[Boolean | SignalRef] = js.undefined
}
object QuantizeScale {
  
  inline def apply(name: String): QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantizeScale]
  }
  
  extension [Self <: QuantizeScale](x: Self) {
    
    inline def setNice(value: Boolean | Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRange(value: RangeScheme): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setType(value: quantize): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setZero(value: Boolean | SignalRef): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
