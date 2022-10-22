package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.POWER
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginPowerPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/PowerPlugin.PowerPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/PowerPlugin.PowerPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/PowerPlugin.PowerPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/PowerPlugin", "PowerPlugin")
  @js.native
  open class PowerPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def power(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object PowerPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/PowerPlugin", "PowerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/PowerPlugin", "PowerPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: POWER = js.native
    inline def implementedFunctions_=(x: POWER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
