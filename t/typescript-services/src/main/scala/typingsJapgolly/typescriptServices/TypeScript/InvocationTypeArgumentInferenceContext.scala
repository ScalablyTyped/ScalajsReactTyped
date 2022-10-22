package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvocationTypeArgumentInferenceContext
  extends StObject
     with TypeArgumentInferenceContext {
  
  var argumentASTs: ISeparatedSyntaxList2
}
object InvocationTypeArgumentInferenceContext {
  
  inline def apply(
    _finalizeInferredTypeArguments: CallbackTo[js.Array[PullTypeSymbol]],
    addCandidateForInference: (PullTypeParameterSymbol, PullTypeSymbol) => Callback,
    addInferenceRoot: PullTypeParameterSymbol => Callback,
    alreadyRelatingTypes: (PullTypeSymbol, PullTypeSymbol) => Boolean,
    argumentASTs: ISeparatedSyntaxList2,
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
  ): InvocationTypeArgumentInferenceContext = {
    val __obj = js.Dynamic.literal(_finalizeInferredTypeArguments = _finalizeInferredTypeArguments.toJsFn, addCandidateForInference = js.Any.fromFunction2((t0: PullTypeParameterSymbol, t1: PullTypeSymbol) => (addCandidateForInference(t0, t1)).runNow()), addInferenceRoot = js.Any.fromFunction1((t0: PullTypeParameterSymbol) => addInferenceRoot(t0).runNow()), alreadyRelatingTypes = js.Any.fromFunction2(alreadyRelatingTypes), argumentASTs = argumentASTs.asInstanceOf[js.Any], candidateCache = candidateCache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], fixTypeParameter = js.Any.fromFunction1((t0: PullTypeParameterSymbol) => fixTypeParameter(t0).runNow()), getInferenceInfo = js.Any.fromFunction1(getInferenceInfo), inferTypeArguments = inferTypeArguments.toJsFn, inferenceCache = inferenceCache.asInstanceOf[js.Any], isInvocationInferenceContext = isInvocationInferenceContext.toJsFn, resetRelationshipCache = resetRelationshipCache.toJsFn, resolver = resolver.asInstanceOf[js.Any], signatureBeingInferred = signatureBeingInferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationTypeArgumentInferenceContext]
  }
  
  extension [Self <: InvocationTypeArgumentInferenceContext](x: Self) {
    
    inline def setArgumentASTs(value: ISeparatedSyntaxList2): Self = StObject.set(x, "argumentASTs", value.asInstanceOf[js.Any])
  }
}
