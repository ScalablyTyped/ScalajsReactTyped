package typingsJapgolly.angularCompilerCli

import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcBuiltinMod.ObjectAssignBuiltinFn
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.KnownFn
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typingsJapgolly.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValueArray
import typingsJapgolly.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscPartialEvaluatorSrcTsHelpersMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "AssignHelperFn")
  @js.native
  open class AssignHelperFn () extends ObjectAssignBuiltinFn
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "ReadHelperFn")
  @js.native
  open class ReadHelperFn () extends KnownFn {
    
    def evaluate(node: Node, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "SpreadArrayHelperFn")
  @js.native
  open class SpreadArrayHelperFn () extends KnownFn {
    
    def evaluate(node: Node, args: ResolvedValueArray): ResolvedValue = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/partial_evaluator/src/ts_helpers", "SpreadHelperFn")
  @js.native
  open class SpreadHelperFn () extends KnownFn {
    
    def evaluate(node: Node, args: ResolvedValueArray): ResolvedValueArray = js.native
  }
}
