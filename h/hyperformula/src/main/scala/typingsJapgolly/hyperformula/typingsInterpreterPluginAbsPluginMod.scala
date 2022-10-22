package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.ABS
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginAbsPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/AbsPlugin.AbsPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/AbsPlugin.AbsPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/AbsPlugin.AbsPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/AbsPlugin", "AbsPlugin")
  @js.native
  open class AbsPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def abs(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object AbsPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/AbsPlugin", "AbsPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/AbsPlugin", "AbsPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ABS = js.native
    inline def implementedFunctions_=(x: ABS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
