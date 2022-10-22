package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.BASE
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginRadixConversionPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/RadixConversionPlugin.RadixConversionPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/RadixConversionPlugin.RadixConversionPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/RadixConversionPlugin.RadixConversionPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/RadixConversionPlugin", "RadixConversionPlugin")
  @js.native
  open class RadixConversionPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def base(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def bin2dec(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def bin2hex(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def bin2oct(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def dec2bin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def dec2hex(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def dec2oct(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def decimal(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def hex2bin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def hex2dec(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def hex2oct(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def oct2bin(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def oct2dec(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def oct2hex(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object RadixConversionPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/RadixConversionPlugin", "RadixConversionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/RadixConversionPlugin", "RadixConversionPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: BASE = js.native
    inline def implementedFunctions_=(x: BASE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
