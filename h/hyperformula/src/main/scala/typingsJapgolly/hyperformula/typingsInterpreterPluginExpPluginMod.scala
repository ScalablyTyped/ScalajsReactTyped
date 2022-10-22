package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.EXP
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginExpPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/ExpPlugin.ExpPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/ExpPlugin.ExpPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/ExpPlugin.ExpPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/ExpPlugin", "ExpPlugin")
  @js.native
  open class ExpPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /**
      * Corresponds to EXP(value)
      *
      * Calculates the exponent for basis e
      *
      * @param ast
      * @param state
      */
    def exp(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object ExpPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/ExpPlugin", "ExpPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/ExpPlugin", "ExpPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: EXP = js.native
    inline def implementedFunctions_=(x: EXP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
