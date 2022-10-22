package typingsJapgolly.jsgraph

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.jsgraph.anon.Dirgaph
import typingsJapgolly.jsgraph.anon.E
import typingsJapgolly.jsgraph.anon.Error
import typingsJapgolly.jsgraph.anon.G
import typingsJapgolly.jsgraph.anon.Result
import typingsJapgolly.jsgraph.jsgraphInts.`0`
import typingsJapgolly.jsgraph.jsgraphInts.`1`
import typingsJapgolly.jsgraph.jsgraphInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsgraph", JSImport.Namespace)
  @js.native
  val ^ : jsGraphStatic = js.native
  
  trait Directed extends StObject {
    
    def breadthFirstTraverse(params: TraversalParams): TraversalResult
    
    var colors: typingsJapgolly.jsgraph.mod.colors
    
    def create(): Result
    
    def createTraversalContext(req: Dirgaph): TraversalContext
    
    def depthFirstTraverse(params: TraversalParams): TraversalResult
    
    var directedGraph: DirectedGraph
    
    def transpose(graph: DirectedGraph): Error
  }
  object Directed {
    
    inline def apply(
      breadthFirstTraverse: TraversalParams => TraversalResult,
      colors: colors,
      create: CallbackTo[Result],
      createTraversalContext: Dirgaph => TraversalContext,
      depthFirstTraverse: TraversalParams => TraversalResult,
      directedGraph: DirectedGraph,
      transpose: DirectedGraph => Error
    ): Directed = {
      val __obj = js.Dynamic.literal(breadthFirstTraverse = js.Any.fromFunction1(breadthFirstTraverse), colors = colors.asInstanceOf[js.Any], create = create.toJsFn, createTraversalContext = js.Any.fromFunction1(createTraversalContext), depthFirstTraverse = js.Any.fromFunction1(depthFirstTraverse), directedGraph = directedGraph.asInstanceOf[js.Any], transpose = js.Any.fromFunction1(transpose))
      __obj.asInstanceOf[Directed]
    }
    
    extension [Self <: Directed](x: Self) {
      
      inline def setBreadthFirstTraverse(value: TraversalParams => TraversalResult): Self = StObject.set(x, "breadthFirstTraverse", js.Any.fromFunction1(value))
      
      inline def setColors(value: colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: CallbackTo[Result]): Self = StObject.set(x, "create", value.toJsFn)
      
      inline def setCreateTraversalContext(value: Dirgaph => TraversalContext): Self = StObject.set(x, "createTraversalContext", js.Any.fromFunction1(value))
      
      inline def setDepthFirstTraverse(value: TraversalParams => TraversalResult): Self = StObject.set(x, "depthFirstTraverse", js.Any.fromFunction1(value))
      
      inline def setDirectedGraph(value: DirectedGraph): Self = StObject.set(x, "directedGraph", value.asInstanceOf[js.Any])
      
      inline def setTranspose(value: DirectedGraph => Error): Self = StObject.set(x, "transpose", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DirectedGraph
    extends StObject
       with Instantiable0[DirectedGraph] {
    
    //Edge functions
    def addEdge(request: EdgeRequest): JsGraphResponse = js.native
    
    //Vertex functions
    def addVertex(vertex: VertexRequest): JsGraphResponse = js.native
    
    def clearEdgeProperty(edge: Edge): Boolean = js.native
    
    def clearVertexProperty(vertex: String): Boolean = js.native
    
    def fromObject(graph: Any): JsGraphResponse = js.native
    
    def getEdeges(): js.Array[Edge] = js.native
    
    def getEdgeCount(): Double = js.native
    
    def getEdgeProperty(edge: Edge): Any = js.native
    
    def getGraphDescription(): String = js.native
    
    def getGraphName(): String = js.native
    
    def getLeafVertices(): js.Array[String] = js.native
    
    def getRootVertices(): js.Array[String] = js.native
    
    def getVertexProperty(vertex: String): Any = js.native
    
    def getVertices(): js.Array[String] = js.native
    
    def hasEdgeProperty(edge: Edge): Boolean = js.native
    
    def hasVertexProperty(vertex: String): Boolean = js.native
    
    def inDegree(vertex: String): Double = js.native
    
    def inEdges(vertex: String): js.Array[Edge] = js.native
    
    def isEdge(edge: Edge): Boolean = js.native
    
    def leafVerticesCount(): Double = js.native
    
    def outDegree(vertex: String): Double = js.native
    
    def outEdges(vertex: String): js.Array[Edge] = js.native
    
    def removeEdge(edge: Edge): JsGraphResponse = js.native
    
    def removeVertex(vertex: String): Boolean = js.native
    
    def rootVerticesCount(): Double = js.native
    
    def setEdgeProperty(request: EdgeRequest): JsGraphResponse = js.native
    
    def setGraphDescription(description: String): JsGraphResponse = js.native
    
    def setGraphName(name: String): JsGraphResponse = js.native
    
    def setVertexProperty(vertex: VertexRequest): JsGraphResponse = js.native
    
    def stringify(replacer: js.Function): String = js.native
    def stringify(replacer: js.Function, space: Double): String = js.native
    
    def toJSON(): String = js.native
    
    def toObject(): String = js.native
    
    def verticesCount(): Double = js.native
  }
  
  trait Edge extends StObject {
    
    var u: String
    
    var v: String
  }
  object Edge {
    
    inline def apply(u: String, v: String): Edge = {
      val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edge]
    }
    
    extension [Self <: Edge](x: Self) {
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait EdgeRequest extends StObject {
    
    var e: Edge
    
    var p: Any
  }
  object EdgeRequest {
    
    inline def apply(e: Edge, p: Any): EdgeRequest = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdgeRequest]
    }
    
    extension [Self <: EdgeRequest](x: Self) {
      
      inline def setE(value: Edge): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setP(value: Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsGraphResponse extends StObject {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[Any] = js.undefined
  }
  object JsGraphResponse {
    
    inline def apply(): JsGraphResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsGraphResponse]
    }
    
    extension [Self <: JsGraphResponse](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait TraversalContext extends StObject {
    
    var colorMap: Any
    
    var searchStatus: String
    
    var undiscoveredMap: Any
  }
  object TraversalContext {
    
    inline def apply(colorMap: Any, searchStatus: String, undiscoveredMap: Any): TraversalContext = {
      val __obj = js.Dynamic.literal(colorMap = colorMap.asInstanceOf[js.Any], searchStatus = searchStatus.asInstanceOf[js.Any], undiscoveredMap = undiscoveredMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraversalContext]
    }
    
    extension [Self <: TraversalContext](x: Self) {
      
      inline def setColorMap(value: Any): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setSearchStatus(value: String): Self = StObject.set(x, "searchStatus", value.asInstanceOf[js.Any])
      
      inline def setUndiscoveredMap(value: Any): Self = StObject.set(x, "undiscoveredMap", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraversalOptions extends StObject {
    
    var allowEmptyStartVector: Boolean
    
    var signalStart: Boolean
    
    var startVector: String | js.Array[String]
    
    var traverseContext: TraversalContext
  }
  object TraversalOptions {
    
    inline def apply(
      allowEmptyStartVector: Boolean,
      signalStart: Boolean,
      startVector: String | js.Array[String],
      traverseContext: TraversalContext
    ): TraversalOptions = {
      val __obj = js.Dynamic.literal(allowEmptyStartVector = allowEmptyStartVector.asInstanceOf[js.Any], signalStart = signalStart.asInstanceOf[js.Any], startVector = startVector.asInstanceOf[js.Any], traverseContext = traverseContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraversalOptions]
    }
    
    extension [Self <: TraversalOptions](x: Self) {
      
      inline def setAllowEmptyStartVector(value: Boolean): Self = StObject.set(x, "allowEmptyStartVector", value.asInstanceOf[js.Any])
      
      inline def setSignalStart(value: Boolean): Self = StObject.set(x, "signalStart", value.asInstanceOf[js.Any])
      
      inline def setStartVector(value: String | js.Array[String]): Self = StObject.set(x, "startVector", value.asInstanceOf[js.Any])
      
      inline def setStartVectorVarargs(value: String*): Self = StObject.set(x, "startVector", js.Array(value*))
      
      inline def setTraverseContext(value: TraversalContext): Self = StObject.set(x, "traverseContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraversalParams extends StObject {
    
    var digraph: DirectedGraph
    
    var options: js.UndefOr[TraversalOptions] = js.undefined
    
    var visitor: Visitor
  }
  object TraversalParams {
    
    inline def apply(digraph: DirectedGraph, visitor: Visitor): TraversalParams = {
      val __obj = js.Dynamic.literal(digraph = digraph.asInstanceOf[js.Any], visitor = visitor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TraversalParams]
    }
    
    extension [Self <: TraversalParams](x: Self) {
      
      inline def setDigraph(value: DirectedGraph): Self = StObject.set(x, "digraph", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: TraversalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setVisitor(value: Visitor): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TraversalResult extends StObject {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var result: js.UndefOr[TraversalContext] = js.undefined
  }
  object TraversalResult {
    
    inline def apply(): TraversalResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalResult]
    }
    
    extension [Self <: TraversalResult](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setResult(value: TraversalContext): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait VertexRequest extends StObject {
    
    var p: Any
    
    var u: String
  }
  object VertexRequest {
    
    inline def apply(p: Any, u: String): VertexRequest = {
      val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[VertexRequest]
    }
    
    extension [Self <: VertexRequest](x: Self) {
      
      inline def setP(value: Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
  
  trait Visitor extends StObject {
    
    def blackTarget(req: E): Unit
    
    def discoverVertex(req: G): Unit
    
    def examineEdge(req: E): Unit
    
    def examineVertex(req: G): Unit
    
    def finishVertex(req: G): Unit
    
    def grayTarget(req: E): Unit
    
    def initializeVertex(req: G): Unit
    
    def nonTreeEdge(req: E): Unit
    
    def startVertex(req: G): Unit
  }
  object Visitor {
    
    inline def apply(
      blackTarget: E => Callback,
      discoverVertex: G => Callback,
      examineEdge: E => Callback,
      examineVertex: G => Callback,
      finishVertex: G => Callback,
      grayTarget: E => Callback,
      initializeVertex: G => Callback,
      nonTreeEdge: E => Callback,
      startVertex: G => Callback
    ): Visitor = {
      val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1((t0: E) => blackTarget(t0).runNow()), discoverVertex = js.Any.fromFunction1((t0: G) => discoverVertex(t0).runNow()), examineEdge = js.Any.fromFunction1((t0: E) => examineEdge(t0).runNow()), examineVertex = js.Any.fromFunction1((t0: G) => examineVertex(t0).runNow()), finishVertex = js.Any.fromFunction1((t0: G) => finishVertex(t0).runNow()), grayTarget = js.Any.fromFunction1((t0: E) => grayTarget(t0).runNow()), initializeVertex = js.Any.fromFunction1((t0: G) => initializeVertex(t0).runNow()), nonTreeEdge = js.Any.fromFunction1((t0: E) => nonTreeEdge(t0).runNow()), startVertex = js.Any.fromFunction1((t0: G) => startVertex(t0).runNow()))
      __obj.asInstanceOf[Visitor]
    }
    
    extension [Self <: Visitor](x: Self) {
      
      inline def setBlackTarget(value: E => Callback): Self = StObject.set(x, "blackTarget", js.Any.fromFunction1((t0: E) => value(t0).runNow()))
      
      inline def setDiscoverVertex(value: G => Callback): Self = StObject.set(x, "discoverVertex", js.Any.fromFunction1((t0: G) => value(t0).runNow()))
      
      inline def setExamineEdge(value: E => Callback): Self = StObject.set(x, "examineEdge", js.Any.fromFunction1((t0: E) => value(t0).runNow()))
      
      inline def setExamineVertex(value: G => Callback): Self = StObject.set(x, "examineVertex", js.Any.fromFunction1((t0: G) => value(t0).runNow()))
      
      inline def setFinishVertex(value: G => Callback): Self = StObject.set(x, "finishVertex", js.Any.fromFunction1((t0: G) => value(t0).runNow()))
      
      inline def setGrayTarget(value: E => Callback): Self = StObject.set(x, "grayTarget", js.Any.fromFunction1((t0: E) => value(t0).runNow()))
      
      inline def setInitializeVertex(value: G => Callback): Self = StObject.set(x, "initializeVertex", js.Any.fromFunction1((t0: G) => value(t0).runNow()))
      
      inline def setNonTreeEdge(value: E => Callback): Self = StObject.set(x, "nonTreeEdge", js.Any.fromFunction1((t0: E) => value(t0).runNow()))
      
      inline def setStartVertex(value: G => Callback): Self = StObject.set(x, "startVertex", js.Any.fromFunction1((t0: G) => value(t0).runNow()))
    }
  }
  
  type _To = jsGraphStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: jsGraphStatic = ^
  
  trait colors extends StObject {
    
    var black: `2`
    
    var gray: `1`
    
    var white: `0`
  }
  object colors {
    
    inline def apply(): colors = {
      val __obj = js.Dynamic.literal(black = 2, gray = 1, white = 0)
      __obj.asInstanceOf[colors]
    }
    
    extension [Self <: colors](x: Self) {
      
      inline def setBlack(value: `2`): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setGray(value: `1`): Self = StObject.set(x, "gray", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: `0`): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  trait jsGraphStatic extends StObject {
    
    var directed: Directed
  }
  object jsGraphStatic {
    
    inline def apply(directed: Directed): jsGraphStatic = {
      val __obj = js.Dynamic.literal(directed = directed.asInstanceOf[js.Any])
      __obj.asInstanceOf[jsGraphStatic]
    }
    
    extension [Self <: jsGraphStatic](x: Self) {
      
      inline def setDirected(value: Directed): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    }
  }
}
