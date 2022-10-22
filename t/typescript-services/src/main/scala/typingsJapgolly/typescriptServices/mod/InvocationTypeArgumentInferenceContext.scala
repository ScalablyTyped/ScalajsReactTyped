package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IBitMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "InvocationTypeArgumentInferenceContext")
@js.native
open class InvocationTypeArgumentInferenceContext protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.InvocationTypeArgumentInferenceContext {
  def this(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    context: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolutionContext,
    signatureBeingInferred: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol,
    argumentASTs: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList2
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
  var argumentASTs: typingsJapgolly.typescriptServices.TypeScript.ISeparatedSyntaxList2 = js.native
  
  /* CompleteClass */
  var candidateCache: js.Array[typingsJapgolly.typescriptServices.TypeScript.CandidateInferenceInfo] = js.native
  
  /* CompleteClass */
  var context: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolutionContext = js.native
  
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
  
  /* CompleteClass */
  var signatureBeingInferred: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol = js.native
}
