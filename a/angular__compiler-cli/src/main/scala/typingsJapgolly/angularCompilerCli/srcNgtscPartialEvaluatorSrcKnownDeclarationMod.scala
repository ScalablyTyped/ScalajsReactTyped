package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcBuiltinMod.ObjectAssignBuiltinFn
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.KnownDeclaration
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcKnownDeclarationMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/known_declaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/known_declaration", "jsGlobalObjectValue")
  @js.native
  val jsGlobalObjectValue: Map[String, ObjectAssignBuiltinFn] = js.native
  
  inline def resolveKnownDeclaration(decl: KnownDeclaration): ResolvedValue = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveKnownDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[ResolvedValue]
}
