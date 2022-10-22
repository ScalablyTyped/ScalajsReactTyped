package typingsJapgolly.dagre

import typingsJapgolly.dagre.anon.Compound
import typingsJapgolly.dagre.mod.EdgeConfig
import typingsJapgolly.dagre.mod.EdgeFn
import typingsJapgolly.dagre.mod.GraphLabel
import typingsJapgolly.dagre.mod.NodeConfig
import typingsJapgolly.dagre.mod.WeightFn
import typingsJapgolly.dagre.mod.graphlib.Graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dagre {
    
    @JSGlobal("dagre")
    @js.native
    val ^ : js.Any = js.native
    
    object graphlib {
      
      @JSGlobal("dagre.graphlib.Graph")
      @js.native
      open class Graph[T] ()
        extends typingsJapgolly.dagre.mod.graphlib.Graph[T] {
        def this(opt: Compound) = this()
      }
      
      object alg {
        
        @JSGlobal("dagre.graphlib.alg")
        @js.native
        val ^ : js.Any = js.native
        
        inline def components(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("components")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
        
        inline def dijkstra(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], source: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstra(
          graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object],
          source: String,
          weightFn: Unit,
          edgeFn: EdgeFn
        ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstra(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], source: String, weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstra(
          graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object],
          source: String,
          weightFn: WeightFn,
          edgeFn: EdgeFn
        ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstra")(graph.asInstanceOf[js.Any], source.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        
        inline def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
        inline def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def dijkstraAll(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("dijkstraAll")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        
        inline def findCycles(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findCycles")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
        
        inline def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
        inline def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], weightFn: Unit, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        inline def floydWarchall(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], weightFn: WeightFn, edgeFn: EdgeFn): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("floydWarchall")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any], edgeFn.asInstanceOf[js.Any])).asInstanceOf[Any]
        
        inline def isAcyclic(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAcyclic")(graph.asInstanceOf[js.Any]).asInstanceOf[Boolean]
        
        inline def postorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        inline def postorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("postorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        
        inline def preorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], nodeNames: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        inline def preorder(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object], nodeNames: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("preorder")(graph.asInstanceOf[js.Any], nodeNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
        
        inline def prim[T](graph: typingsJapgolly.dagre.mod.graphlib.Graph[T]): typingsJapgolly.dagre.mod.graphlib.Graph[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dagre.mod.graphlib.Graph[T]]
        inline def prim[T](graph: typingsJapgolly.dagre.mod.graphlib.Graph[T], weightFn: WeightFn): typingsJapgolly.dagre.mod.graphlib.Graph[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("prim")(graph.asInstanceOf[js.Any], weightFn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.dagre.mod.graphlib.Graph[T]]
        
        inline def tarjam(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tarjam")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
        
        inline def topsort(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("topsort")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
      }
      
      object json {
        
        @JSGlobal("dagre.graphlib.json")
        @js.native
        val ^ : js.Any = js.native
        
        inline def read(graph: Any): typingsJapgolly.dagre.mod.graphlib.Graph[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(graph.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]]
        
        inline def write(graph: typingsJapgolly.dagre.mod.graphlib.Graph[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(graph.asInstanceOf[js.Any]).asInstanceOf[Any]
      }
    }
    
    inline def layout(graph: Graph[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def layout(graph: Graph[js.Object], layout: GraphLabel & NodeConfig & EdgeConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("layout")(graph.asInstanceOf[js.Any], layout.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
