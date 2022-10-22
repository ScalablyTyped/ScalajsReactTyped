package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsConfigMod.Config
import typingsJapgolly.hyperformula.typingsContentChangesMod.ContentChanges
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterMod.Interpreter
import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typingsJapgolly.hyperformula.typingsLazilyTransformingAstServiceMod.LazilyTransformingAstService
import typingsJapgolly.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typingsJapgolly.hyperformula.typingsParserAstMod.Ast
import typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RelativeDependency
import typingsJapgolly.hyperformula.typingsStatisticsMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsEvaluatorMod {
  
  @JSImport("hyperformula/typings/Evaluator", "Evaluator")
  @js.native
  open class Evaluator protected () extends StObject {
    def this(
      config: Config,
      stats: Statistics,
      interpreter: Interpreter,
      lazilyTransformingAstService: LazilyTransformingAstService,
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy
    ) = this()
    
    /* private */ val columnSearch: Any = js.native
    
    /* private */ val config: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ var evaluateAstToCellValue: Any = js.native
    
    val interpreter: Interpreter = js.native
    
    /* private */ val lazilyTransformingAstService: Any = js.native
    
    def partialRun(vertices: js.Array[Vertex]): ContentChanges = js.native
    
    /* private */ var recomputeFormulaVertexValue: Any = js.native
    
    /**
      * Recalculates formulas in the topological sort order
      */
    /* private */ var recomputeFormulas: Any = js.native
    
    def run(): Unit = js.native
    
    def runAndForget(ast: Ast, address: SimpleCellAddress_, dependencies: js.Array[RelativeDependency]): InterpreterValue = js.native
    
    /* private */ val stats: Any = js.native
  }
}
