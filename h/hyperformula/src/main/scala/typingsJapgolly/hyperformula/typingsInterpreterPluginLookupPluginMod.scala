package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.anon.HLOOKUP
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.RawNoErrorScalarValue
import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.FunctionPlugin
import typingsJapgolly.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import typingsJapgolly.hyperformula.typingsLookupSearchStrategyMod.SearchStrategy
import typingsJapgolly.hyperformula.typingsParserAstMod.ProcedureAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterPluginLookupPluginMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ K in keyof hyperformula.hyperformula/typings/interpreter/plugin/LookupPlugin.LookupPlugin ]: hyperformula.hyperformula/typings/interpreter/plugin/LookupPlugin.LookupPlugin[K] extends hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginFunctionType | hyperformula.hyperformula/typings/interpreter/plugin/FunctionPlugin.PluginArraySizeFunctionType? hyperformula.hyperformula/typings/interpreter/plugin/LookupPlugin.LookupPlugin[K] : never} */ @JSImport("hyperformula/typings/interpreter/plugin/LookupPlugin", "LookupPlugin")
  @js.native
  open class LookupPlugin protected () extends FunctionPlugin {
    def this(interpreter: Interpreter) = this()
    
    /* private */ var doHlookup: Any = js.native
    
    /* private */ var doMatch: Any = js.native
    
    /* private */ var doVlookup: Any = js.native
    
    /**
      * Corresponds to HLOOKUP(key, range, index, [sorted])
      *
      * @param ast
      * @param formulaAddress
      */
    def hlookup(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    def `match`(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
    
    /* private */ var rowSearch: Any = js.native
    
    /* protected */ def searchInRange(
      key: RawNoErrorScalarValue,
      range: SimpleRangeValue,
      sorted: Boolean,
      searchStrategy: SearchStrategy
    ): Double = js.native
    
    /**
      * Corresponds to VLOOKUP(key, range, index, [sorted])
      *
      * @param ast
      * @param state
      */
    def vlookup(ast: ProcedureAst, state: InterpreterState): InterpreterValue = js.native
  }
  /* static members */
  object LookupPlugin {
    
    @JSImport("hyperformula/typings/interpreter/plugin/LookupPlugin", "LookupPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hyperformula/typings/interpreter/plugin/LookupPlugin", "LookupPlugin.implementedFunctions")
    @js.native
    def implementedFunctions: HLOOKUP = js.native
    inline def implementedFunctions_=(x: HLOOKUP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementedFunctions")(x.asInstanceOf[js.Any])
  }
}
