package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsArraySizeMod.ArraySizePredictor
import typingsJapgolly.hyperformula.typingsCellContentParserMod.CellContentParser
import typingsJapgolly.hyperformula.typingsCellDependencyMod.CellDependency
import typingsJapgolly.hyperformula.typingsDependencyGraphMod.DependencyGraph
import typingsJapgolly.hyperformula.typingsDependencyGraphVertexMod.Vertex
import typingsJapgolly.hyperformula.typingsLookupSearchStrategyMod.ColumnSearchStrategy
import typingsJapgolly.hyperformula.typingsParserMod.ParserWithCaching
import typingsJapgolly.hyperformula.typingsSheetMod.Sheets
import typingsJapgolly.hyperformula.typingsStatisticsMod.Statistics
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsGraphBuilderMod {
  
  @JSImport("hyperformula/typings/GraphBuilder", "GraphBuilder")
  @js.native
  open class GraphBuilder protected () extends StObject {
    /**
      * Configures the building service.
      */
    def this(
      dependencyGraph: DependencyGraph,
      columnSearch: ColumnSearchStrategy,
      parser: ParserWithCaching,
      cellContentParser: CellContentParser,
      stats: Statistics,
      arraySizePredictor: ArraySizePredictor
    ) = this()
    
    /* private */ val arraySizePredictor: Any = js.native
    
    /**
      * Builds graph.
      */
    def buildGraph(sheets: Sheets, stats: Statistics): Unit = js.native
    
    /* private */ var buildStrategy: Any = js.native
    
    /* private */ val cellContentParser: Any = js.native
    
    /* private */ val columnSearch: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ val parser: Any = js.native
    
    /* private */ var processDependencies: Any = js.native
    
    /* private */ val stats: Any = js.native
  }
  
  @JSImport("hyperformula/typings/GraphBuilder", "SimpleStrategy")
  @js.native
  open class SimpleStrategy protected ()
    extends StObject
       with GraphBuilderStrategy {
    def this(
      dependencyGraph: DependencyGraph,
      columnIndex: ColumnSearchStrategy,
      parser: ParserWithCaching,
      stats: Statistics,
      cellContentParser: CellContentParser,
      arraySizePredictor: ArraySizePredictor
    ) = this()
    
    /* private */ val arraySizePredictor: Any = js.native
    
    /* private */ val cellContentParser: Any = js.native
    
    /* private */ val columnIndex: Any = js.native
    
    /* private */ val dependencyGraph: Any = js.native
    
    /* private */ val parser: Any = js.native
    
    /* CompleteClass */
    override def run(sheets: Sheets): Dependencies = js.native
    
    /* private */ var shrinkArrayIfNeeded: Any = js.native
    
    /* private */ val stats: Any = js.native
  }
  
  type Dependencies = Map[Vertex, js.Array[CellDependency]]
  
  trait GraphBuilderStrategy extends StObject {
    
    def run(sheets: Sheets): Dependencies
  }
  object GraphBuilderStrategy {
    
    inline def apply(run: Sheets => Dependencies): GraphBuilderStrategy = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[GraphBuilderStrategy]
    }
    
    extension [Self <: GraphBuilderStrategy](x: Self) {
      
      inline def setRun(value: Sheets => Dependencies): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
}
