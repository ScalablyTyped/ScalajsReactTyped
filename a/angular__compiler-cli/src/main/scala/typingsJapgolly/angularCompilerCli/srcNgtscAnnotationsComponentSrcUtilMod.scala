package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.AnimationTriggerNames
import typingsJapgolly.angularCompilerCli.anon.Imports
import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcInterfaceMod.ForeignFunctionResolver
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsComponentSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/util", "animationTriggerResolver")
  @js.native
  val animationTriggerResolver: ForeignFunctionResolver = js.native
  
  inline def collectAnimationNames(value: ResolvedValue, animationTriggerNames: AnimationTriggerNames): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAnimationNames")(value.asInstanceOf[js.Any], animationTriggerNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isAngularAnimationsReference(reference: Reference[Node], symbolName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAngularAnimationsReference")(reference.asInstanceOf[js.Any], symbolName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateAndFlattenComponentImports(imports: ResolvedValue, expr: Expression): Imports = (^.asInstanceOf[js.Dynamic].applyDynamic("validateAndFlattenComponentImports")(imports.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[Imports]
}
