package typingsJapgolly.datadogSketchesJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchMappingTypesMod {
  
  trait Mapping extends StObject {
    
    var gamma: Double
    
    def key(value: Double): Double
    
    var maxPossible: Double
    
    var minPossible: Double
    
    var relativeAccuracy: Double
    
    def toProto(): Any
    
    def value(key: Double): Double
  }
  object Mapping {
    
    inline def apply(
      gamma: Double,
      key: Double => Double,
      maxPossible: Double,
      minPossible: Double,
      relativeAccuracy: Double,
      toProto: CallbackTo[Any],
      value: Double => Double
    ): Mapping = {
      val __obj = js.Dynamic.literal(gamma = gamma.asInstanceOf[js.Any], key = js.Any.fromFunction1(key), maxPossible = maxPossible.asInstanceOf[js.Any], minPossible = minPossible.asInstanceOf[js.Any], relativeAccuracy = relativeAccuracy.asInstanceOf[js.Any], toProto = toProto.toJsFn, value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[Mapping]
    }
    
    extension [Self <: Mapping](x: Self) {
      
      inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double => Double): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setMaxPossible(value: Double): Self = StObject.set(x, "maxPossible", value.asInstanceOf[js.Any])
      
      inline def setMinPossible(value: Double): Self = StObject.set(x, "minPossible", value.asInstanceOf[js.Any])
      
      inline def setRelativeAccuracy(value: Double): Self = StObject.set(x, "relativeAccuracy", value.asInstanceOf[js.Any])
      
      inline def setToProto(value: CallbackTo[Any]): Self = StObject.set(x, "toProto", value.toJsFn)
      
      inline def setValue(value: Double => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
}
