package typingsJapgolly.reactD3Graph

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactD3Graph.anon.AlphaTarget
import typingsJapgolly.reactD3Graph.anon.Height
import typingsJapgolly.reactD3Graph.reactD3GraphStrings.SAME
import typingsJapgolly.reactD3Graph.reactD3GraphStrings.bottom
import typingsJapgolly.reactD3Graph.reactD3GraphStrings.center
import typingsJapgolly.reactD3Graph.reactD3GraphStrings.left
import typingsJapgolly.reactD3Graph.reactD3GraphStrings.right
import typingsJapgolly.reactD3Graph.reactD3GraphStrings.top
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-d3-graph", "Graph")
  @js.native
  open class Graph[N /* <: GraphNode */, L /* <: GraphLink */] protected () extends Component[GraphProps[N, L], Any, Any] {
    def this(props: GraphProps[N, L], args: Any*) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MGraph(nextProps: Any): Any = js.native
    
    /**
      * Sets nodes and links highlighted value.
      *
      * @param id - the id of the node to highlight.
      * @param value - the highlight value to be set (true or false).
      */
    def _setNodeHighlightedValue(id: String, value: Boolean): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MGraph(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MGraph(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGraph(): Unit = js.native
  }
  
  @JSImport("react-d3-graph", "Link")
  @js.native
  open class Link protected () extends Component[Any, Any, Any] {
    def this(args: Any*) = this()
  }
  
  @JSImport("react-d3-graph", "Node")
  @js.native
  open class Node protected () extends Component[Any, Any, Any] {
    def this(args: Any*) = this()
  }
  
  trait GraphConfiguration[N /* <: GraphNode */, L /* <: GraphLink */] extends StObject {
    
    var automaticRearrangeAfterDropNode: Boolean
    
    var collapsible: Boolean
    
    var d3: AlphaTarget
    
    var directed: Boolean
    
    var focusAnimationDuration: Double
    
    var focusZoom: Double
    
    var height: Double
    
    var highlightDegree: Double
    
    var highlightOpacity: Double
    
    var initialZoom: Double
    
    var link: Partial[GraphLevelLinkConfiguration[L]]
    
    var linkHighlightBehavior: Boolean
    
    var maxZoom: Double
    
    var minZoom: Double
    
    var node: Partial[GraphLevelNodeConfiguration[N]]
    
    var nodeHighlightBehavior: Boolean
    
    var panAndZoom: Boolean
    
    var staticGraph: Boolean
    
    var staticGraphWithDragAndDrop: Boolean
    
    var width: Double
  }
  object GraphConfiguration {
    
    inline def apply[N /* <: GraphNode */, L /* <: GraphLink */](
      automaticRearrangeAfterDropNode: Boolean,
      collapsible: Boolean,
      d3: AlphaTarget,
      directed: Boolean,
      focusAnimationDuration: Double,
      focusZoom: Double,
      height: Double,
      highlightDegree: Double,
      highlightOpacity: Double,
      initialZoom: Double,
      link: Partial[GraphLevelLinkConfiguration[L]],
      linkHighlightBehavior: Boolean,
      maxZoom: Double,
      minZoom: Double,
      node: Partial[GraphLevelNodeConfiguration[N]],
      nodeHighlightBehavior: Boolean,
      panAndZoom: Boolean,
      staticGraph: Boolean,
      staticGraphWithDragAndDrop: Boolean,
      width: Double
    ): GraphConfiguration[N, L] = {
      val __obj = js.Dynamic.literal(automaticRearrangeAfterDropNode = automaticRearrangeAfterDropNode.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], d3 = d3.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], focusAnimationDuration = focusAnimationDuration.asInstanceOf[js.Any], focusZoom = focusZoom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], highlightDegree = highlightDegree.asInstanceOf[js.Any], highlightOpacity = highlightOpacity.asInstanceOf[js.Any], initialZoom = initialZoom.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkHighlightBehavior = linkHighlightBehavior.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeHighlightBehavior = nodeHighlightBehavior.asInstanceOf[js.Any], panAndZoom = panAndZoom.asInstanceOf[js.Any], staticGraph = staticGraph.asInstanceOf[js.Any], staticGraphWithDragAndDrop = staticGraphWithDragAndDrop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphConfiguration[N, L]]
    }
    
    extension [Self <: GraphConfiguration[?, ?], N /* <: GraphNode */, L /* <: GraphLink */](x: Self & (GraphConfiguration[N, L])) {
      
      inline def setAutomaticRearrangeAfterDropNode(value: Boolean): Self = StObject.set(x, "automaticRearrangeAfterDropNode", value.asInstanceOf[js.Any])
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setD3(value: AlphaTarget): Self = StObject.set(x, "d3", value.asInstanceOf[js.Any])
      
      inline def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
      
      inline def setFocusAnimationDuration(value: Double): Self = StObject.set(x, "focusAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setFocusZoom(value: Double): Self = StObject.set(x, "focusZoom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHighlightDegree(value: Double): Self = StObject.set(x, "highlightDegree", value.asInstanceOf[js.Any])
      
      inline def setHighlightOpacity(value: Double): Self = StObject.set(x, "highlightOpacity", value.asInstanceOf[js.Any])
      
      inline def setInitialZoom(value: Double): Self = StObject.set(x, "initialZoom", value.asInstanceOf[js.Any])
      
      inline def setLink(value: Partial[GraphLevelLinkConfiguration[L]]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkHighlightBehavior(value: Boolean): Self = StObject.set(x, "linkHighlightBehavior", value.asInstanceOf[js.Any])
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Partial[GraphLevelNodeConfiguration[N]]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeHighlightBehavior(value: Boolean): Self = StObject.set(x, "nodeHighlightBehavior", value.asInstanceOf[js.Any])
      
      inline def setPanAndZoom(value: Boolean): Self = StObject.set(x, "panAndZoom", value.asInstanceOf[js.Any])
      
      inline def setStaticGraph(value: Boolean): Self = StObject.set(x, "staticGraph", value.asInstanceOf[js.Any])
      
      inline def setStaticGraphWithDragAndDrop(value: Boolean): Self = StObject.set(x, "staticGraphWithDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphData[N /* <: GraphNode */, L /* <: GraphLink */] extends StObject {
    
    var focusedNodeId: js.UndefOr[String] = js.undefined
    
    var links: js.Array[L]
    
    var nodes: js.Array[N]
  }
  object GraphData {
    
    inline def apply[N /* <: GraphNode */, L /* <: GraphLink */](links: js.Array[L], nodes: js.Array[N]): GraphData[N, L] = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphData[N, L]]
    }
    
    extension [Self <: GraphData[?, ?], N /* <: GraphNode */, L /* <: GraphLink */](x: Self & (GraphData[N, L])) {
      
      inline def setFocusedNodeId(value: String): Self = StObject.set(x, "focusedNodeId", value.asInstanceOf[js.Any])
      
      inline def setFocusedNodeIdUndefined: Self = StObject.set(x, "focusedNodeId", js.undefined)
      
      inline def setLinks(value: js.Array[L]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: L*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setNodes(value: js.Array[N]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: N*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait GraphEventCallbacks extends StObject {
    
    def onClickGraph(event: ReactMouseEventFrom[Element]): Unit
    
    def onClickLink(source: String, target: String): Unit
    
    def onClickNode(nodeId: String): Unit
    
    def onDoubleClickNode(nodeId: String): Unit
    
    def onMouseOutLink(source: String, target: String): Unit
    
    def onMouseOutNode(nodeId: String): Unit
    
    def onMouseOverLink(source: String, target: String): Unit
    
    def onMouseOverNode(nodeId: String): Unit
    
    def onNodePositionChange(nodeId: String, x: Double, y: Double): Unit
    
    def onRightClickLink(event: ReactMouseEventFrom[Element], source: String, target: String): Unit
    
    def onRightClickNode(event: ReactMouseEventFrom[Element], nodeId: String): Unit
    
    def onZoomChange(previousZoom: Double, newZoom: Double): Unit
  }
  object GraphEventCallbacks {
    
    inline def apply(
      onClickGraph: ReactMouseEventFrom[Element] => Callback,
      onClickLink: (String, String) => Callback,
      onClickNode: String => Callback,
      onDoubleClickNode: String => Callback,
      onMouseOutLink: (String, String) => Callback,
      onMouseOutNode: String => Callback,
      onMouseOverLink: (String, String) => Callback,
      onMouseOverNode: String => Callback,
      onNodePositionChange: (String, Double, Double) => Callback,
      onRightClickLink: (ReactMouseEventFrom[Element], String, String) => Callback,
      onRightClickNode: (ReactMouseEventFrom[Element], String) => Callback,
      onZoomChange: (Double, Double) => Callback
    ): GraphEventCallbacks = {
      val __obj = js.Dynamic.literal(onClickGraph = js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => onClickGraph(t0).runNow()), onClickLink = js.Any.fromFunction2((t0: String, t1: String) => (onClickLink(t0, t1)).runNow()), onClickNode = js.Any.fromFunction1((t0: String) => onClickNode(t0).runNow()), onDoubleClickNode = js.Any.fromFunction1((t0: String) => onDoubleClickNode(t0).runNow()), onMouseOutLink = js.Any.fromFunction2((t0: String, t1: String) => (onMouseOutLink(t0, t1)).runNow()), onMouseOutNode = js.Any.fromFunction1((t0: String) => onMouseOutNode(t0).runNow()), onMouseOverLink = js.Any.fromFunction2((t0: String, t1: String) => (onMouseOverLink(t0, t1)).runNow()), onMouseOverNode = js.Any.fromFunction1((t0: String) => onMouseOverNode(t0).runNow()), onNodePositionChange = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (onNodePositionChange(t0, t1, t2)).runNow()), onRightClickLink = js.Any.fromFunction3((t0: ReactMouseEventFrom[Element], t1: String, t2: String) => (onRightClickLink(t0, t1, t2)).runNow()), onRightClickNode = js.Any.fromFunction2((t0: ReactMouseEventFrom[Element], t1: String) => (onRightClickNode(t0, t1)).runNow()), onZoomChange = js.Any.fromFunction2((t0: Double, t1: Double) => (onZoomChange(t0, t1)).runNow()))
      __obj.asInstanceOf[GraphEventCallbacks]
    }
    
    extension [Self <: GraphEventCallbacks](x: Self) {
      
      inline def setOnClickGraph(value: ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onClickGraph", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnClickLink(value: (String, String) => Callback): Self = StObject.set(x, "onClickLink", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setOnClickNode(value: String => Callback): Self = StObject.set(x, "onClickNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnDoubleClickNode(value: String => Callback): Self = StObject.set(x, "onDoubleClickNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnMouseOutLink(value: (String, String) => Callback): Self = StObject.set(x, "onMouseOutLink", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseOutNode(value: String => Callback): Self = StObject.set(x, "onMouseOutNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnMouseOverLink(value: (String, String) => Callback): Self = StObject.set(x, "onMouseOverLink", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseOverNode(value: String => Callback): Self = StObject.set(x, "onMouseOverNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnNodePositionChange(value: (String, Double, Double) => Callback): Self = StObject.set(x, "onNodePositionChange", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnRightClickLink(value: (ReactMouseEventFrom[Element], String, String) => Callback): Self = StObject.set(x, "onRightClickLink", js.Any.fromFunction3((t0: ReactMouseEventFrom[Element], t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnRightClickNode(value: (ReactMouseEventFrom[Element], String) => Callback): Self = StObject.set(x, "onRightClickNode", js.Any.fromFunction2((t0: ReactMouseEventFrom[Element], t1: String) => (value(t0, t1)).runNow()))
      
      inline def setOnZoomChange(value: (Double, Double) => Callback): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  trait GraphLevelLinkConfiguration[L /* <: GraphLink */]
    extends StObject
       with LinkLevelLinkConfiguration {
    
    var fontSize: Double
    
    var fontWeight: String
    
    var highlightColor: String
    
    var highlightFontSize: Double
    
    var highlightFontWeight: String
    
    var labelProperty: LinkLabelProperty[L]
    
    var markerHeight: Double
    
    var mouseCursor: String
    
    var renderLabel: Boolean
    
    var semanticStrokeWidth: Boolean
    
    var `type`: String
  }
  object GraphLevelLinkConfiguration {
    
    inline def apply[L /* <: GraphLink */](
      color: String,
      fontColor: String,
      fontSize: Double,
      fontWeight: String,
      highlightColor: String,
      highlightFontSize: Double,
      highlightFontWeight: String,
      labelProperty: LinkLabelProperty[L],
      markerHeight: Double,
      markerWidth: Double,
      mouseCursor: String,
      opacity: Double,
      renderLabel: Boolean,
      semanticStrokeWidth: Boolean,
      strokeWidth: Double,
      `type`: String
    ): GraphLevelLinkConfiguration[L] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], markerHeight = markerHeight.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], semanticStrokeWidth = semanticStrokeWidth.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphLevelLinkConfiguration[L]]
    }
    
    extension [Self <: GraphLevelLinkConfiguration[?], L /* <: GraphLink */](x: Self & GraphLevelLinkConfiguration[L]) {
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightFontSize(value: Double): Self = StObject.set(x, "highlightFontSize", value.asInstanceOf[js.Any])
      
      inline def setHighlightFontWeight(value: String): Self = StObject.set(x, "highlightFontWeight", value.asInstanceOf[js.Any])
      
      inline def setLabelProperty(value: LinkLabelProperty[L]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      inline def setLabelPropertyFunction1(value: L => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      inline def setMarkerHeight(value: Double): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      inline def setMouseCursor(value: String): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
      
      inline def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      inline def setSemanticStrokeWidth(value: Boolean): Self = StObject.set(x, "semanticStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphLevelNodeConfiguration[N /* <: GraphNode */] extends StObject {
    
    var color: String
    
    var fontColor: String
    
    var fontSize: Double
    
    var fontWeight: String
    
    var highlightColor: String
    
    var highlightFontSize: Double
    
    var highlightFontWeight: String
    
    var highlightStrokeColor: SAME | String
    
    var highlightStrokeWidth: SAME | Double
    
    var labelPosition: left | right | top | bottom | center
    
    var labelProperty: NodeLabelProperty[N]
    
    var mouseCursor: String
    
    var opacity: Double
    
    var renderLabel: Boolean
    
    var size: NodeSize
    
    var strokeColor: String
    
    var strokeWidth: Double
    
    var svg: String
    
    var symbolType: String
    
    def viewGenerator(node: N): Any
  }
  object GraphLevelNodeConfiguration {
    
    inline def apply[N /* <: GraphNode */](
      color: String,
      fontColor: String,
      fontSize: Double,
      fontWeight: String,
      highlightColor: String,
      highlightFontSize: Double,
      highlightFontWeight: String,
      highlightStrokeColor: SAME | String,
      highlightStrokeWidth: SAME | Double,
      labelPosition: left | right | top | bottom | center,
      labelProperty: NodeLabelProperty[N],
      mouseCursor: String,
      opacity: Double,
      renderLabel: Boolean,
      size: NodeSize,
      strokeColor: String,
      strokeWidth: Double,
      svg: String,
      symbolType: String,
      viewGenerator: N => Any
    ): GraphLevelNodeConfiguration[N] = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], highlightFontSize = highlightFontSize.asInstanceOf[js.Any], highlightFontWeight = highlightFontWeight.asInstanceOf[js.Any], highlightStrokeColor = highlightStrokeColor.asInstanceOf[js.Any], highlightStrokeWidth = highlightStrokeWidth.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], mouseCursor = mouseCursor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
      __obj.asInstanceOf[GraphLevelNodeConfiguration[N]]
    }
    
    extension [Self <: GraphLevelNodeConfiguration[?], N /* <: GraphNode */](x: Self & GraphLevelNodeConfiguration[N]) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setHighlightColor(value: String): Self = StObject.set(x, "highlightColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightFontSize(value: Double): Self = StObject.set(x, "highlightFontSize", value.asInstanceOf[js.Any])
      
      inline def setHighlightFontWeight(value: String): Self = StObject.set(x, "highlightFontWeight", value.asInstanceOf[js.Any])
      
      inline def setHighlightStrokeColor(value: SAME | String): Self = StObject.set(x, "highlightStrokeColor", value.asInstanceOf[js.Any])
      
      inline def setHighlightStrokeWidth(value: SAME | Double): Self = StObject.set(x, "highlightStrokeWidth", value.asInstanceOf[js.Any])
      
      inline def setLabelPosition(value: left | right | top | bottom | center): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelProperty(value: NodeLabelProperty[N]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      inline def setLabelPropertyFunction1(value: N => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      inline def setMouseCursor(value: String): Self = StObject.set(x, "mouseCursor", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      inline def setSize(value: NodeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      inline def setViewGenerator(value: N => Any): Self = StObject.set(x, "viewGenerator", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Partial<react-d3-graph.react-d3-graph.LinkLevelLinkConfiguration> */
  trait GraphLink extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontColor: js.UndefOr[String] = js.undefined
    
    var markerWidth: js.UndefOr[Double] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var source: String
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var target: String
  }
  object GraphLink {
    
    inline def apply(source: String, target: String): GraphLink = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphLink]
    }
    
    extension [Self <: GraphLink](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      inline def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<react-d3-graph.react-d3-graph.NodeLevelNodeConfiguration> */
  trait GraphNode extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var fontColor: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var labelProperty: js.UndefOr[NodeLabelProperty[NodeWithExtraParameters]] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var renderLabel: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[NodeSize] = js.undefined
    
    var strokeColor: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var svg: js.UndefOr[String] = js.undefined
    
    var symbolType: js.UndefOr[String] = js.undefined
    
    var viewGenerator: js.UndefOr[js.Function1[/* node */ NodeWithExtraParameters, Any]] = js.undefined
  }
  object GraphNode {
    
    inline def apply(id: String): GraphNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphNode]
    }
    
    extension [Self <: GraphNode](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabelProperty(value: NodeLabelProperty[NodeWithExtraParameters]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      inline def setLabelPropertyFunction1(value: NodeWithExtraParameters => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      inline def setLabelPropertyUndefined: Self = StObject.set(x, "labelProperty", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setSize(value: NodeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "svg", js.undefined)
      
      inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      inline def setSymbolTypeUndefined: Self = StObject.set(x, "symbolType", js.undefined)
      
      inline def setViewGenerator(value: /* node */ NodeWithExtraParameters => Any): Self = StObject.set(x, "viewGenerator", js.Any.fromFunction1(value))
      
      inline def setViewGeneratorUndefined: Self = StObject.set(x, "viewGenerator", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<react-d3-graph.react-d3-graph.GraphEventCallbacks> */
  trait GraphProps[N /* <: GraphNode */, L /* <: GraphLink */] extends StObject {
    
    var config: js.UndefOr[Partial[GraphConfiguration[N, L]]] = js.undefined
    
    var data: js.UndefOr[GraphData[N, L]] = js.undefined
    
    var id: String
    
    var onClickGraph: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[Element], Unit]] = js.undefined
    
    var onClickLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.undefined
    
    var onClickNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onDoubleClickNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onMouseOutLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.undefined
    
    var onMouseOutNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onMouseOverLink: js.UndefOr[js.Function2[/* source */ String, /* target */ String, Unit]] = js.undefined
    
    var onMouseOverNode: js.UndefOr[js.Function1[/* nodeId */ String, Unit]] = js.undefined
    
    var onNodePositionChange: js.UndefOr[js.Function3[/* nodeId */ String, /* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    var onRightClickLink: js.UndefOr[
        js.Function3[
          /* event */ ReactMouseEventFrom[Element], 
          /* source */ String, 
          /* target */ String, 
          Unit
        ]
      ] = js.undefined
    
    var onRightClickNode: js.UndefOr[
        js.Function2[/* event */ ReactMouseEventFrom[Element], /* nodeId */ String, Unit]
      ] = js.undefined
    
    var onZoomChange: js.UndefOr[js.Function2[/* previousZoom */ Double, /* newZoom */ Double, Unit]] = js.undefined
  }
  object GraphProps {
    
    inline def apply[N /* <: GraphNode */, L /* <: GraphLink */](id: String): GraphProps[N, L] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphProps[N, L]]
    }
    
    extension [Self <: GraphProps[?, ?], N /* <: GraphNode */, L /* <: GraphLink */](x: Self & (GraphProps[N, L])) {
      
      inline def setConfig(value: Partial[GraphConfiguration[N, L]]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setData(value: GraphData[N, L]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClickGraph(value: /* event */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onClickGraph", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnClickGraphUndefined: Self = StObject.set(x, "onClickGraph", js.undefined)
      
      inline def setOnClickLink(value: (/* source */ String, /* target */ String) => Callback): Self = StObject.set(x, "onClickLink", js.Any.fromFunction2((t0: /* source */ String, t1: /* target */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnClickLinkUndefined: Self = StObject.set(x, "onClickLink", js.undefined)
      
      inline def setOnClickNode(value: /* nodeId */ String => Callback): Self = StObject.set(x, "onClickNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
      
      inline def setOnClickNodeUndefined: Self = StObject.set(x, "onClickNode", js.undefined)
      
      inline def setOnDoubleClickNode(value: /* nodeId */ String => Callback): Self = StObject.set(x, "onDoubleClickNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
      
      inline def setOnDoubleClickNodeUndefined: Self = StObject.set(x, "onDoubleClickNode", js.undefined)
      
      inline def setOnMouseOutLink(value: (/* source */ String, /* target */ String) => Callback): Self = StObject.set(x, "onMouseOutLink", js.Any.fromFunction2((t0: /* source */ String, t1: /* target */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseOutLinkUndefined: Self = StObject.set(x, "onMouseOutLink", js.undefined)
      
      inline def setOnMouseOutNode(value: /* nodeId */ String => Callback): Self = StObject.set(x, "onMouseOutNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
      
      inline def setOnMouseOutNodeUndefined: Self = StObject.set(x, "onMouseOutNode", js.undefined)
      
      inline def setOnMouseOverLink(value: (/* source */ String, /* target */ String) => Callback): Self = StObject.set(x, "onMouseOverLink", js.Any.fromFunction2((t0: /* source */ String, t1: /* target */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseOverLinkUndefined: Self = StObject.set(x, "onMouseOverLink", js.undefined)
      
      inline def setOnMouseOverNode(value: /* nodeId */ String => Callback): Self = StObject.set(x, "onMouseOverNode", js.Any.fromFunction1((t0: /* nodeId */ String) => value(t0).runNow()))
      
      inline def setOnMouseOverNodeUndefined: Self = StObject.set(x, "onMouseOverNode", js.undefined)
      
      inline def setOnNodePositionChange(value: (/* nodeId */ String, /* x */ Double, /* y */ Double) => Callback): Self = StObject.set(x, "onNodePositionChange", js.Any.fromFunction3((t0: /* nodeId */ String, t1: /* x */ Double, t2: /* y */ Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnNodePositionChangeUndefined: Self = StObject.set(x, "onNodePositionChange", js.undefined)
      
      inline def setOnRightClickLink(
        value: (/* event */ ReactMouseEventFrom[Element], /* source */ String, /* target */ String) => Callback
      ): Self = StObject.set(x, "onRightClickLink", js.Any.fromFunction3((t0: /* event */ ReactMouseEventFrom[Element], t1: /* source */ String, t2: /* target */ String) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnRightClickLinkUndefined: Self = StObject.set(x, "onRightClickLink", js.undefined)
      
      inline def setOnRightClickNode(value: (/* event */ ReactMouseEventFrom[Element], /* nodeId */ String) => Callback): Self = StObject.set(x, "onRightClickNode", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[Element], t1: /* nodeId */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnRightClickNodeUndefined: Self = StObject.set(x, "onRightClickNode", js.undefined)
      
      inline def setOnZoomChange(value: (/* previousZoom */ Double, /* newZoom */ Double) => Callback): Self = StObject.set(x, "onZoomChange", js.Any.fromFunction2((t0: /* previousZoom */ Double, t1: /* newZoom */ Double) => (value(t0, t1)).runNow()))
      
      inline def setOnZoomChangeUndefined: Self = StObject.set(x, "onZoomChange", js.undefined)
    }
  }
  
  type LinkLabelProperty[L /* <: GraphLink */] = (js.Function1[/* node */ L, String]) | (/* keyof L */ String)
  
  trait LinkLevelLinkConfiguration extends StObject {
    
    var color: String
    
    var fontColor: String
    
    var markerWidth: Double
    
    var opacity: Double
    
    var strokeWidth: Double
  }
  object LinkLevelLinkConfiguration {
    
    inline def apply(color: String, fontColor: String, markerWidth: Double, opacity: Double, strokeWidth: Double): LinkLevelLinkConfiguration = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], markerWidth = markerWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkLevelLinkConfiguration]
    }
    
    extension [Self <: LinkLevelLinkConfiguration](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setMarkerWidth(value: Double): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type NodeLabelProperty[N /* <: GraphNode */] = (js.Function1[/* node */ N, String]) | (/* keyof N */ String)
  
  trait NodeLevelNodeConfiguration extends StObject {
    
    var color: String
    
    var fontColor: String
    
    var labelProperty: NodeLabelProperty[NodeWithExtraParameters]
    
    var opacity: Double
    
    var renderLabel: Boolean
    
    var size: NodeSize
    
    var strokeColor: String
    
    var strokeWidth: Double
    
    var svg: String
    
    var symbolType: String
    
    def viewGenerator(node: NodeWithExtraParameters): Any
  }
  object NodeLevelNodeConfiguration {
    
    inline def apply(
      color: String,
      fontColor: String,
      labelProperty: NodeLabelProperty[NodeWithExtraParameters],
      opacity: Double,
      renderLabel: Boolean,
      size: NodeSize,
      strokeColor: String,
      strokeWidth: Double,
      svg: String,
      symbolType: String,
      viewGenerator: NodeWithExtraParameters => Any
    ): NodeLevelNodeConfiguration = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontColor = fontColor.asInstanceOf[js.Any], labelProperty = labelProperty.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], renderLabel = renderLabel.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeColor = strokeColor.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any], viewGenerator = js.Any.fromFunction1(viewGenerator))
      __obj.asInstanceOf[NodeLevelNodeConfiguration]
    }
    
    extension [Self <: NodeLevelNodeConfiguration](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setLabelProperty(value: NodeLabelProperty[NodeWithExtraParameters]): Self = StObject.set(x, "labelProperty", value.asInstanceOf[js.Any])
      
      inline def setLabelPropertyFunction1(value: NodeWithExtraParameters => String): Self = StObject.set(x, "labelProperty", js.Any.fromFunction1(value))
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setRenderLabel(value: Boolean): Self = StObject.set(x, "renderLabel", value.asInstanceOf[js.Any])
      
      inline def setSize(value: NodeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSymbolType(value: String): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      inline def setViewGenerator(value: NodeWithExtraParameters => Any): Self = StObject.set(x, "viewGenerator", js.Any.fromFunction1(value))
    }
  }
  
  type NodeSize = Double | Height
  
  trait NodeWithExtraParameters
    extends StObject
       with GraphNode
       with /* key */ StringDictionary[String]
  object NodeWithExtraParameters {
    
    inline def apply(id: String): NodeWithExtraParameters = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeWithExtraParameters]
    }
  }
}
