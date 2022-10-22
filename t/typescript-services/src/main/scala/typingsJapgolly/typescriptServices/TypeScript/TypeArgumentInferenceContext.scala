package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeArgumentInferenceContext extends StObject {
  
  def _finalizeInferredTypeArguments(): js.Array[PullTypeSymbol]
  
  def addCandidateForInference(param: PullTypeParameterSymbol, candidate: PullTypeSymbol): Unit
  
  def addInferenceRoot(param: PullTypeParameterSymbol): Unit
  
  def alreadyRelatingTypes(objectType: PullTypeSymbol, parameterType: PullTypeSymbol): Boolean
  
  var candidateCache: js.Array[CandidateInferenceInfo]
  
  var context: PullTypeResolutionContext
  
  def fixTypeParameter(typeParameter: PullTypeParameterSymbol): Unit
  
  def getInferenceInfo(param: PullTypeParameterSymbol): CandidateInferenceInfo
  
  def inferTypeArguments(): js.Array[PullTypeSymbol]
  
  var inferenceCache: IBitMatrix
  
  def isInvocationInferenceContext(): Boolean
  
  def resetRelationshipCache(): Unit
  
  var resolver: PullTypeResolver
  
  var signatureBeingInferred: PullSignatureSymbol
}
object TypeArgumentInferenceContext {
  
  inline def apply(
    _finalizeInferredTypeArguments: CallbackTo[js.Array[PullTypeSymbol]],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Callback,
    addInferenceRoot: PullTypeParameterSymbol => Callback,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
    candidateCache: js.Array[CandidateInferenceInfo],
    context: PullTypeResolutionContext,
    fixTypeParameter: PullTypeParameterSymbol => Callback,
    getInferenceInfo: PullTypeParameterSymbol => CandidateInferenceInfo,
    inferTypeArguments: CallbackTo[js.Array[PullTypeSymbol]],
    inferenceCache: IBitMatrix,
    isInvocationInferenceContext: CallbackTo[Boolean],
    resetRelationshipCache: Callback,
    resolver: PullTypeResolver,
    signatureBeingInferred: PullSignatureSymbol
  ): TypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = _finalizeInferredTypeArguments.toJsFn, addCandidateForInference = js.Any.fromFunction2((t0: PullTypeParameterSymbol, t1: PullTypeSymbol) => (addCandidateForInference(t0, t1)).runNow()), addInferenceRoot = js.Any.fromFunction1((t0: PullTypeParameterSymbol) => addInferenceRoot(t0).runNow()), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1((t0: PullTypeParameterSymbol) => fixTypeParameter(t0).runNow()), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = inferTypeArguments.toJsFn, inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = isInvocationInferenceContext.toJsFn, resetRelationshipCache = resetRelationshipCache.toJsFn, resolver = resolver.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArgumentInferenceContext]
  }
  
  extension [Self <: TypeArgumentInferenceContext](x: Self) {
    
    inline def setAddCandidateForInference(value: (PullTypeParameterSymbol, PullTypeSymbol) => Callback): Self = StObject.set(x, "addCandidateForInference", js.Any.fromFunction2((t0: PullTypeParameterSymbol, t1: PullTypeSymbol) => (value(t0, t1)).runNow()))
    
    inline def setAddInferenceRoot(value: PullTypeParameterSymbol => Callback): Self = StObject.set(x, "addInferenceRoot", js.Any.fromFunction1((t0: PullTypeParameterSymbol) => value(t0).runNow()))
    
    inline def setAlreadyRelatingTypes(value: (PullTypeSymbol, PullTypeSymbol) => Boolean): Self = StObject.set(x, "alreadyRelatingTypes", js.Any.fromFunction2(value))
    
    inline def setCandidateCache(value: js.Array[CandidateInferenceInfo]): Self = StObject.set(x, "candidateCache", value.asInstanceOf[js.Any])
    
    inline def setCandidateCacheVarargs(value: CandidateInferenceInfo*): Self = StObject.set(x, "candidateCache", js.Array(value*))
    
    inline def setContext(value: PullTypeResolutionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setFixTypeParameter(value: PullTypeParameterSymbol => Callback): Self = StObject.set(x, "fixTypeParameter", js.Any.fromFunction1((t0: PullTypeParameterSymbol) => value(t0).runNow()))
    
    inline def setGetInferenceInfo(value: PullTypeParameterSymbol => CandidateInferenceInfo): Self = StObject.set(x, "getInferenceInfo", js.Any.fromFunction1(value))
    
    inline def setInferTypeArguments(value: CallbackTo[js.Array[PullTypeSymbol]]): Self = StObject.set(x, "inferTypeArguments", value.toJsFn)
    
    inline def setInferenceCache(value: IBitMatrix): Self = StObject.set(x, "inferenceCache", value.asInstanceOf[js.Any])
    
    inline def setIsInvocationInferenceContext(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInvocationInferenceContext", value.toJsFn)
    
    inline def setResetRelationshipCache(value: Callback): Self = StObject.set(x, "resetRelationshipCache", value.toJsFn)
    
    inline def setResolver(value: PullTypeResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setSignatureBeingInferred(value: PullSignatureSymbol): Self = StObject.set(x, "signatureBeingInferred", value.asInstanceOf[js.Any])
    
    inline def set_finalizeInferredTypeArguments(value: CallbackTo[js.Array[PullTypeSymbol]]): Self = StObject.set(x, "_finalizeInferredTypeArguments", value.toJsFn)
  }
}
