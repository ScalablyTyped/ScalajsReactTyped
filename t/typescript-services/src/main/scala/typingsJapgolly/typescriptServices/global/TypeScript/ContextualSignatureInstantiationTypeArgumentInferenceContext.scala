package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.IBitMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ContextualSignatureInstantiationTypeArgumentInferenceContext")
@js.native
open class ContextualSignatureInstantiationTypeArgumentInferenceContext protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.ContextualSignatureInstantiationTypeArgumentInferenceContext {
  def this(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    context: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolutionContext,
    signatureBeingInferred: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol,
    contextualSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol,
    shouldFixContextualSignatureParameterTypes: Boolean
  ) = this()
  
  /* CompleteClass */
  override def _finalizeInferredTypeArguments(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  
  /* CompleteClass */
  override def addCandidateForInference(
    param: typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol,
    candidate: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
  ): Unit = js.native
  
  /* CompleteClass */
  override def addInferenceRoot(param: typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol): Unit = js.native
  
  /* CompleteClass */
  override def alreadyRelatingTypes(
    objectType: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    parameterType: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  
  /* CompleteClass */
  var candidateCache: js.Array[typingsJapgolly.typescriptServices.TypeScript.CandidateInferenceInfo] = js.native
  
  /* CompleteClass */
  var context: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolutionContext = js.native
  
  /* private */ /* CompleteClass */
  var contextualSignature: Any = js.native
  
  /* CompleteClass */
  override def fixTypeParameter(typeParameter: typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol): Unit = js.native
  
  /* CompleteClass */
  override def getInferenceInfo(param: typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol): typingsJapgolly.typescriptServices.TypeScript.CandidateInferenceInfo = js.native
  
  /* CompleteClass */
  override def inferTypeArguments(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  
  /* CompleteClass */
  var inferenceCache: IBitMatrix = js.native
  
  /* CompleteClass */
  override def isInvocationInferenceContext(): Boolean = js.native
  
  /* CompleteClass */
  override def resetRelationshipCache(): Unit = js.native
  
  /* CompleteClass */
  var resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver = js.native
  
  /* private */ /* CompleteClass */
  var shouldFixContextualSignatureParameterTypes: Any = js.native
  
  /* CompleteClass */
  var signatureBeingInferred: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol = js.native
}
