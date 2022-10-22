package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.SUMPRODUCT
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginSumprodPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/SumprodPlugin.SumprodPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/SumprodPlugin.SumprodPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/SumprodPlugin.SumprodPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/SumprodPlugin", "SumprodPlugin")
  @js.native
  open class SumprodPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def sumproduct(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object SumprodPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/SumprodPlugin", "SumprodPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/SumprodPlugin", "SumprodPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: SUMPRODUCT = js.native
    inline def implementedFunctions_=(x: SUMPRODUCT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
