package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateInferenceInfo extends StObject {
  
  var _inferredTypeAfterFixing: PullTypeSymbol
  
  def addCandidate(candidate: PullTypeSymbol): Unit
  
  def fixTypeParameter(resolver: PullTypeResolver, context: PullTypeResolutionContext): Unit
  
  var inferenceCandidates: js.Array[PullTypeSymbol]
  
  def isFixed(): Boolean
  
  var typeParameter: PullTypeParameterSymbol
}
object CandidateInferenceInfo {
  
  inline def apply(
    _inferredTypeAfterFixing: PullTypeSymbol,
    addCandidate: PullTypeSymbol => Callback,
    fixTypeParameter: (PullTypeResolver, PullTypeResolutionContext) => Callback,
    inferenceCandidates: js.Array[PullTypeSymbol],
    isFixed: CallbackTo[Boolean],
    typeParameter: PullTypeParameterSymbol
  ): CandidateInferenceInfo = {
    val __obj = js.Dynamic.literal(_inferredTypeAfterFixing = _inferredTypeAfterFixing.asInstanceOf[js.Any], addCandidate = js.Any.fromFunction1((t0: PullTypeSymbol) => addCandidate(t0).runNow()), fixTypeParameter = js.Any.fromFunction2((t0: PullTypeResolver, t1: PullTypeResolutionContext) => (fixTypeParameter(t0, t1)).runNow()), inferenceCandidates = inferenceCandidates.asInstanceOf[js.Any], isFixed = isFixed.toJsFn, typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateInferenceInfo]
  }
  
  extension [Self <: CandidateInferenceInfo](x: Self) {
    
    inline def setAddCandidate(value: PullTypeSymbol => Callback): Self = StObject.set(x, "addCandidate", js.Any.fromFunction1((t0: PullTypeSymbol) => value(t0).runNow()))
    
    inline def setFixTypeParameter(value: (PullTypeResolver, PullTypeResolutionContext) => Callback): Self = StObject.set(x, "fixTypeParameter", js.Any.fromFunction2((t0: PullTypeResolver, t1: PullTypeResolutionContext) => (value(t0, t1)).runNow()))
    
    inline def setInferenceCandidates(value: js.Array[PullTypeSymbol]): Self = StObject.set(x, "inferenceCandidates", value.asInstanceOf[js.Any])
    
    inline def setInferenceCandidatesVarargs(value: PullTypeSymbol*): Self = StObject.set(x, "inferenceCandidates", js.Array(value*))
    
    inline def setIsFixed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFixed", value.toJsFn)
    
    inline def setTypeParameter(value: PullTypeParameterSymbol): Self = StObject.set(x, "typeParameter", value.asInstanceOf[js.Any])
    
    inline def set_inferredTypeAfterFixing(value: PullTypeSymbol): Self = StObject.set(x, "_inferredTypeAfterFixing", value.asInstanceOf[js.Any])
  }
}
