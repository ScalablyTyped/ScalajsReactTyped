package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextualSignatureInstantiationTypeArgumentInferenceContext
  extends StObject
     with TypeArgumentInferenceContext {
  
  /* private */ var contextualSignature: Any
  
  /* private */ var shouldFixContextualSignatureParameterTypes: Any
}
object ContextualSignatureInstantiationTypeArgumentInferenceContext {
  
  inline def apply(
    _finalizeInferredTypeArguments: CallbackTo[js.Array[PullTypeSymbol]],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Callback,
    addInferenceRoot: PullTypeParameterSymbol => Callback,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
    candidateCache: js.Array[CandidateInferenceInfo],
    context: PullTypeResolutionContext,
    contextualSignature: Any,
    fixTypeParameter: PullTypeParameterSymbol => Callback,
    getInferenceInfo: PullTypeParameterSymbol => CandidateInferenceInfo,
    inferTypeArguments: CallbackTo[js.Array[PullTypeSymbol]],
    inferenceCache: IBitMatrix,
    isInvocationInferenceContext: CallbackTo[Boolean],
    resetRelationshipCache: Callback,
    resolver: PullTypeResolver,
    shouldFixContextualSignatureParameterTypes: Any,
    signatureBeingInferred: PullSignatureSymbol
  ): ContextualSignatureInstantiationTypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = _finalizeInferredTypeArguments.toJsFn, addCandidateForInference = js.Any.fromFunction2((t0: PullTypeParameterSymbol, t1: PullTypeSymbol) => (addCandidateForInference(t0, t1)).runNow()), addInferenceRoot = js.Any.fromFunction1((t0: PullTypeParameterSymbol) => addInferenceRoot(t0).runNow()), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], contextualSignature = contextualSignature.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1((t0: PullTypeParameterSymbol) => fixTypeParameter(t0).runNow()), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = inferTypeArguments.toJsFn, inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = isInvocationInferenceContext.toJsFn, resetRelationshipCache = resetRelationshipCache.toJsFn, resolver = resolver.asInstanceOf[js.Any], shouldFixContextualSignatureParameterTypes = shouldFixContextualSignatureParameterTypes.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextualSignatureInstantiationTypeArgumentInferenceContext]
  }
  
  extension [Self <: ContextualSignatureInstantiationTypeArgumentInferenceContext](x: Self) {
    
    inline def setContextualSignature(value: Any): Self = StObject.set(x, "contextualSignature", value.asInstanceOf[js.Any])
    
    inline def setShouldFixContextualSignatureParameterTypes(value: Any): Self = StObject.set(x, "shouldFixContextualSignatureParameterTypes", value.asInstanceOf[js.Any])
  }
}
