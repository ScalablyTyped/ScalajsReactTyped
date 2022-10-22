package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompiler.mod.SchemaMetadata
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorMod.PartialEvaluator
import typingsJapgolly.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscAnnotationsCommonSrcSchemaMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/common/src/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractSchemas(rawExpr: Expression, evaluator: PartialEvaluator, context: String): js.Array[SchemaMetadata] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractSchemas")(rawExpr.asInstanceOf[js.Any], evaluator.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[SchemaMetadata]]
}
