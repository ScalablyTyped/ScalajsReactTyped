package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginMathConstantsPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/MathConstantsPlugin.MathConstantsPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/MathConstantsPlugin.MathConstantsPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/MathConstantsPlugin.MathConstantsPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "MathConstantsPlugin")
  @js.native
  open class MathConstantsPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def pi(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def sqrtpi(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object MathConstantsPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "MathConstantsPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "MathConstantsPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: typingsJapgolly.hyperformula.anon.PI = js.native
    inline def implementedFunctions_=(x: typingsJapgolly.hyperformula.anon.PI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hyperformula/typings/interpreter/plugin/MathConstantsPlugin", "PI")
  @js.native
  val PI: Double = js.native
}
