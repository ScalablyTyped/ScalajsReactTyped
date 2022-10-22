package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.ARABIC
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginRomanPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/RomanPlugin.RomanPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/RomanPlugin.RomanPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/RomanPlugin.RomanPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/RomanPlugin", "RomanPlugin")
  @js.native
  open class RomanPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def arabic(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def roman(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object RomanPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/RomanPlugin", "RomanPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/RomanPlugin", "RomanPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ARABIC = js.native
    inline def implementedFunctions_=(x: ARABIC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
