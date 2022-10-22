package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.ARRAYCONSTRAIN
import typingsJapgolly.hyperformula.typingsArraySizeMod.ArraySize
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginArrayPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/ArrayPlugin.ArrayPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/ArrayPlugin.ArrayPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/ArrayPlugin.ArrayPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/ArrayPlugin", "ArrayPlugin")
  @js.native
  open class ArrayPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def arrayconstrain(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def arrayconstrainArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
    
    def arrayformula(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def arrayformulaArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
    
    def filter(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def filterArraySize(ast: ProcedureAst, state: InterpreterState): ArraySize = js.native
  }
  /* static members */
  object ArrayPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/ArrayPlugin", "ArrayPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/ArrayPlugin", "ArrayPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ARRAYCONSTRAIN = js.native
    inline def implementedFunctions_=(x: ARRAYCONSTRAIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
