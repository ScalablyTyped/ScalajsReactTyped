package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.VERSION
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginVersionPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/VersionPlugin.VersionPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/VersionPlugin.VersionPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/VersionPlugin.VersionPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/VersionPlugin", "VersionPlugin")
  @js.native
  open class VersionPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def version(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object VersionPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/VersionPlugin", "VersionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/VersionPlugin", "VersionPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: VERSION = js.native
    inline def implementedFunctions_=(x: VERSION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
