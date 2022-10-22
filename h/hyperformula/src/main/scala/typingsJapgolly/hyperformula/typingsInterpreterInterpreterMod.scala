package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsArraySizeMod.ArraySizePredictor
import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsDateTimeHelperMod.DateTimeHelper
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsInterpreterArithmeticHelperMod.ArithmeticHelper
import typingsJapgolly.hyperformula.typingsInterpreterCriterionMod.CriterionBuilder
import typingsJapgolly.hyperformula.typingsInterpreterFunctionRegistryMod.FunctionRegistry
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterStateMod.InterpreterState
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typingsJapgolly.hyperformula.typingsNamedExpressionsMod.NamedExpressions
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsSerializationMod.Serialization
import typingsJapgolly.hyperformula.typingsStatisticsStatisticsMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsInterpreterInterpreterMod {
  
  @JSImport("hyperformula/typings/interpreter/Interpreter", "Interpreter")
  @js.native
  open class Interpreter protected () extends StObject {
    def this(
      config: Config,
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy,
      stats: Statistics,
      arithmeticHelper: ArithmeticHelper,
      functionRegistry: FunctionRegistry,
      namedExpressions: NamedExpressions,
      serialization: Serialization,
      arraySizePredictor: ArraySizePredictor,
      dateTimeHelper: DateTimeHelper
    ) = this()
    
    val arithmeticHelper: ArithmeticHelper = js.native
    
    val arraySizePredictor: ArraySizePredictor = js.native
    
    /* private */ var binaryRangeWrapper: Any = js.native
    
    val columnSearch: ColumnSearchStrategy = js.native
    
    /* private */ var concatOp: Any = js.native
    
    val config: Config = js.native
    
    val criterionBuilder: CriterionBuilder = js.native
    
    val dateTimeHelper: DateTimeHelper = js.native
    
    val dependencyGraph: DependencyGraph = js.native
    
    /* private */ var divOp: Any = js.native
    
    /* private */ var equalOp: Any = js.native
    
    def evaluateAst(ast: Ast, state: InterpreterState): InterpreterValue = js.native
    
    /**
      * Calculates cell value from formula abstract syntax tree
      *
      * @param formula - abstract syntax tree of formula
      * @param formulaAddress - address of the cell in which formula is located
      */
    /* private */ var evaluateAstWithoutPostprocessing: Any = js.native
    
    /* private */ val functionRegistry: Any = js.native
    
    /* private */ var greaterThanOp: Any = js.native
    
    /* private */ var greaterThanOrEqualOp: Any = js.native
    
    /* private */ var lessThanOp: Any = js.native
    
    /* private */ var lessThanOrEqualOp: Any = js.native
    
    /* private */ var minusOp: Any = js.native
    
    /* private */ val namedExpressions: Any = js.native
    
    /* private */ var notEqualOp: Any = js.native
    
    /* private */ var percentOp: Any = js.native
    
    /* private */ var plusOp: Any = js.native
    
    /* private */ var powerOp: Any = js.native
    
    /* private */ var rangeSpansOneSheet: Any = js.native
    
    val serialization: Serialization = js.native
    
    val stats: Statistics = js.native
    
    /* private */ var timesOp: Any = js.native
    
    /* private */ var unaryMinusOp: Any = js.native
    
    /* private */ var unaryPlusOp: Any = js.native
    
    /* private */ var unaryRangeWrapper: Any = js.native
  }
}
