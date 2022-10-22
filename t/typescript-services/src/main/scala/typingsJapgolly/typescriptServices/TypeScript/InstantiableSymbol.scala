package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantiableSymbol extends StObject {
  
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol]
  
  def getIsSpecialized(): Boolean
  
  def getTypeParameterArgumentMap(): TypeArgumentMap
}
object InstantiableSymbol {
  
  inline def apply(
    getAllowedToReferenceTypeParameters: CallbackTo[js.Array[PullTypeParameterSymbol]],
    getIsSpecialized: CallbackTo[Boolean],
    getTypeParameterArgumentMap: CallbackTo[TypeArgumentMap]
  ): InstantiableSymbol = {
    val __obj = js.Dynamic.literal(getAllowedToReferenceTypeParameters = getAllowedToReferenceTypeParameters.toJsFn, getIsSpecialized = getIsSpecialized.toJsFn, getTypeParameterArgumentMap = getTypeParameterArgumentMap.toJsFn)
    __obj.asInstanceOf[InstantiableSymbol]
  }
  
  extension [Self <: InstantiableSymbol](x: Self) {
    
    inline def setGetAllowedToReferenceTypeParameters(value: CallbackTo[js.Array[PullTypeParameterSymbol]]): Self = StObject.set(x, "getAllowedToReferenceTypeParameters", value.toJsFn)
    
    inline def setGetIsSpecialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsSpecialized", value.toJsFn)
    
    inline def setGetTypeParameterArgumentMap(value: CallbackTo[TypeArgumentMap]): Self = StObject.set(x, "getTypeParameterArgumentMap", value.toJsFn)
  }
}
