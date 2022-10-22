package typingsJapgolly.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeclarationCreator {
  
  @JSGlobal("TypeScript.DeclarationCreator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(
    document: typingsJapgolly.typescriptServices.TypeScript.Document,
    semanticInfoChain: typingsJapgolly.typescriptServices.TypeScript.SemanticInfoChain,
    compilationSettings: typingsJapgolly.typescriptServices.TypeScript.ImmutableCompilationSettings
  ): typingsJapgolly.typescriptServices.TypeScript.PullDecl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(document.asInstanceOf[js.Any], semanticInfoChain.asInstanceOf[js.Any], compilationSettings.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PullDecl]
}
