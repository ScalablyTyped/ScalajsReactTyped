package typingsJapgolly.javascriptAstar

import typingsJapgolly.javascriptAstar.anon.Closest
import typingsJapgolly.javascriptAstar.anon.Diagonal
import typingsJapgolly.javascriptAstar.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Graph")
  @js.native
  open class Graph protected ()
    extends StObject
       with typingsJapgolly.javascriptAstar.Graph {
    def this(grid: js.Array[js.Array[Double]]) = this()
    def this(grid: js.Array[js.Array[Double]], options: Diagonal) = this()
    
    /* CompleteClass */
    var grid: js.Array[js.Array[typingsJapgolly.javascriptAstar.GridNode]] = js.native
  }
  
  @JSGlobal("GridNode")
  @js.native
  open class GridNode ()
    extends StObject
       with typingsJapgolly.javascriptAstar.GridNode {
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  object astar {
    
    @JSGlobal("astar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("astar.heuristics")
    @js.native
    def heuristics: Heuristics = js.native
    inline def heuristics_=(x: Heuristics): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heuristics")(x.asInstanceOf[js.Any])
    
    inline def search(graph: typingsJapgolly.javascriptAstar.Graph, start: X, end: X): js.Array[typingsJapgolly.javascriptAstar.GridNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(graph.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.javascriptAstar.GridNode]]
    inline def search(graph: typingsJapgolly.javascriptAstar.Graph, start: X, end: X, options: Closest): js.Array[typingsJapgolly.javascriptAstar.GridNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(graph.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.javascriptAstar.GridNode]]
  }
}
