package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.CandidateInferenceInfo")
@js.native
open class CandidateInferenceInfo ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.CandidateInferenceInfo {
  
  /* CompleteClass */
  var _inferredTypeAfterFixing: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  /* CompleteClass */
  override def addCandidate(candidate: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol): Unit = js.native
  
  /* CompleteClass */
  override def fixTypeParameter(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    context: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolutionContext
  ): Unit = js.native
  
  /* CompleteClass */
  var inferenceCandidates: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol] = js.native
  
  /* CompleteClass */
  override def isFixed(): Boolean = js.native
  
  /* CompleteClass */
  var typeParameter: typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol = js.native
}
