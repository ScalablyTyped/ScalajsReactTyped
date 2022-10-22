package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.ISEVEN
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginIsEvenPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/IsEvenPlugin.IsEvenPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/IsEvenPlugin.IsEvenPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/IsEvenPlugin.IsEvenPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/IsEvenPlugin", "IsEvenPlugin")
  @js.native
  open class IsEvenPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def iseven(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object IsEvenPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/IsEvenPlugin", "IsEvenPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/IsEvenPlugin", "IsEvenPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: ISEVEN = js.native
    inline def implementedFunctions_=(x: ISEVEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
