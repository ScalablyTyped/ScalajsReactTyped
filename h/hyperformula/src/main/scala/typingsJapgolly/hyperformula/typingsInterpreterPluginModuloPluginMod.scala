package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.MOD
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginModuloPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/ModuloPlugin.ModuloPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/ModuloPlugin.ModuloPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/ModuloPlugin.ModuloPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/ModuloPlugin", "ModuloPlugin")
  @js.native
  open class ModuloPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def mod(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object ModuloPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/ModuloPlugin", "ModuloPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/ModuloPlugin", "ModuloPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: MOD = js.native
    inline def implementedFunctions_=(x: MOD): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
