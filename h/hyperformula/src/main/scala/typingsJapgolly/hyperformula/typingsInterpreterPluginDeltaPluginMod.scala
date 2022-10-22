package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.DELTA
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginDeltaPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/DeltaPlugin.DeltaPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/DeltaPlugin.DeltaPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/DeltaPlugin.DeltaPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/DeltaPlugin", "DeltaPlugin")
  @js.native
  open class DeltaPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def delta(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object DeltaPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/DeltaPlugin", "DeltaPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/DeltaPlugin", "DeltaPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: DELTA = js.native
    inline def implementedFunctions_=(x: DELTA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
