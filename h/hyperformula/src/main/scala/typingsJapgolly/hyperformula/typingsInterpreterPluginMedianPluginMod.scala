package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.LARGE
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginMedianPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/MedianPlugin.MedianPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/MedianPlugin.MedianPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/MedianPlugin.MedianPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/MedianPlugin", "MedianPlugin")
  @js.native
  open class MedianPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    def large(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Corresponds to MEDIAN(Number1, Number2, ...).
      *
      * Returns a median of given numbers.
      *
      * @param ast
      * @param state
      */
    def median(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def small(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object MedianPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/MedianPlugin", "MedianPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/MedianPlugin", "MedianPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: LARGE = js.native
    inline def implementedFunctions_=(x: LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
