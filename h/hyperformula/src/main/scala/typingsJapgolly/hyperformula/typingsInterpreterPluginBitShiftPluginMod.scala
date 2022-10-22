package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.BITLSHIFT
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginBitShiftPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/BitShiftPlugin.BitShiftPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/BitShiftPlugin.BitShiftPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/BitShiftPlugin.BitShiftPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/BitShiftPlugin", "BitShiftPlugin")
  @js.native
  open class BitShiftPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def bitlshift(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def bitrshift(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object BitShiftPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/BitShiftPlugin", "BitShiftPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/BitShiftPlugin", "BitShiftPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: BITLSHIFT = js.native
    inline def implementedFunctions_=(x: BITLSHIFT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
