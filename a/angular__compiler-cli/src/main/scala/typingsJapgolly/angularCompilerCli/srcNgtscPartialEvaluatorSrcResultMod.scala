package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue
import typingsJapgolly.std.Array
import typingsJapgolly.std.Map
import typingsJapgolly.typescript.mod.CallExpression
import typingsJapgolly.typescript.mod.Declaration
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcResultMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "EnumValue")
  @js.native
  open class EnumValue protected ()
    extends StObject
       with _ResolvedValue {
    def this(enumRef: Reference[Declaration], name: String, resolved: ResolvedValue) = this()
    
    val enumRef: Reference[Declaration] = js.native
    
    val name: String = js.native
    
    val resolved: ResolvedValue = js.native
  }
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "KnownFn")
  @js.native
  open class KnownFn ()
    extends StObject
       with _ResolvedValue {
    
    def evaluate(node: CallExpression, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/result", "ResolvedModule")
  @js.native
  open class ResolvedModule protected ()
    extends StObject
       with _ResolvedValue {
    def this(
      exports: Map[
            String, 
            typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
          ],
      evaluate: js.Function1[
            /* decl */ typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration], 
            ResolvedValue
          ]
    ) = this()
    
    /* private */ var evaluate: Any = js.native
    
    /* private */ var exports: Any = js.native
    
    def getExport(name: String): ResolvedValue = js.native
    
    def getExports(): ResolvedValueMap = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - scala.Boolean
    - java.lang.String
    - scala.Null
    - scala.Unit
    - typingsJapgolly.angularCompilerCli.srcNgtscImportsMod.Reference[typingsJapgolly.typescript.mod.Node]
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.EnumValue
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValueArray
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValueMap
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedModule
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.KnownFn
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcSyntheticMod.SyntheticValue[scala.Any]
    - typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue[scala.Any]
  */
  type ResolvedValue = js.UndefOr[
    _ResolvedValue | Reference[Node] | SyntheticValue[Any] | DynamicValue[Any] | Double | Boolean | String | Null
  ]
  
  @js.native
  trait ResolvedValueArray
    extends StObject
       with Array[ResolvedValue]
       with _ResolvedValue
  
  @js.native
  trait ResolvedValueMap
    extends StObject
       with Map[String, ResolvedValue]
       with _ResolvedValue
  
  trait _ResolvedValue extends StObject
}
