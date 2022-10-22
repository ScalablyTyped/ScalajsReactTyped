package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.CHAR
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginCharPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/CharPlugin.CharPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/CharPlugin.CharPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/CharPlugin.CharPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/CharPlugin", "CharPlugin")
  @js.native
  open class CharPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def char(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def unichar(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object CharPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/CharPlugin", "CharPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/CharPlugin", "CharPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: CHAR = js.native
    inline def implementedFunctions_=(x: CHAR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
