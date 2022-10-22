package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapsTypeParameterCache extends StObject {
  
  /* private */ var _wrapsTypeParameterCache: Any
  
  def getWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Double
  
  def setWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap, wrappingTypeParameterID: Double): Unit
}
object WrapsTypeParameterCache {
  
  inline def apply(
    _wrapsTypeParameterCache: Any,
    getWrapsTypeParameter: TypeArgumentMap => Double,
    setWrapsTypeParameter: (TypeArgumentMap, Double) => Callback
  ): WrapsTypeParameterCache = {
    val __obj = js.Dynamic.literal(_wrapsTypeParameterCache = _wrapsTypeParameterCache.asInstanceOf[js.Any], getWrapsTypeParameter = js.Any.fromFunction1(getWrapsTypeParameter), setWrapsTypeParameter = js.Any.fromFunction2((t0: TypeArgumentMap, t1: Double) => (setWrapsTypeParameter(t0, t1)).runNow()))
    __obj.asInstanceOf[WrapsTypeParameterCache]
  }
  
  extension [Self <: WrapsTypeParameterCache](x: Self) {
    
    inline def setGetWrapsTypeParameter(value: TypeArgumentMap => Double): Self = StObject.set(x, "getWrapsTypeParameter", js.Any.fromFunction1(value))
    
    inline def setSetWrapsTypeParameter(value: (TypeArgumentMap, Double) => Callback): Self = StObject.set(x, "setWrapsTypeParameter", js.Any.fromFunction2((t0: TypeArgumentMap, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def set_wrapsTypeParameterCache(value: Any): Self = StObject.set(x, "_wrapsTypeParameterCache", value.asInstanceOf[js.Any])
  }
}
