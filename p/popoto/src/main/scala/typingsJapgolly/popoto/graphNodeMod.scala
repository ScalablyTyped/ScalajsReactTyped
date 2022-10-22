package typingsJapgolly.popoto

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.SVGGElement
import typingsJapgolly.d3Shape.mod.PieArcDatum
import typingsJapgolly.d3Shape.mod.Pie_
import typingsJapgolly.popoto.anon.H
import typingsJapgolly.popoto.anon.ReadonlyROOT0CHOOSE0VALUE
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphNodeMod {
  
  trait Node extends StObject {
    
    // Count box default size
    var CountBox: H
    
    var DONUTS_MARGIN: Double
    
    var DONUT_WIDTH: Double
    
    var NODE_MAX_CHARS: Double
    
    var NODE_TITLE_MAX_CHARS: Double
    
    // Number of nodes displayed per page during value selection.
    var PAGE_RESIZE: Double
    
    /**
      * Create the background for a new node element.
      * The background of a node is defined by a circle not visible by default (fill-opacity set to 0) but can be used to highlight a node with animation on this attribute.
      * This circle also define the node zone that can receive events like mouse clicks.
      *
      * @param gNewNodeElements
      */
    def addBackgroundElements(gNewNodeElements: SVGGElement): Unit
    
    /**
      * Add in all expanded choose nodes the value containing the specified value for the given attribute.
      * And remove it from the nodes data.
      *
      * @param attribute
      * @param value
      */
    def addExpandedValue(attribute: String, value: Any): Unit
    
    /**
      * Create the node foreground elements.
      * It contains node additional elements, count or tools like navigation arrows.
      *
      * @param gNewNodeElements
      */
    def addForegroundElements(gNewNodeElements: SVGGElement): Unit
    
    /**
      * Create the node main elements.
      *
      * @param gNewNodeElements
      */
    def addMiddlegroundElements(gNewNodeElements: SVGGElement): Unit
    
    /**
      * Add all new elements.
      * Only the skeleton of new nodes are added custom data will be added during the element update phase.
      * Should be called after updateData and before updateElements.
      */
    def addNewElements(enteringData: SVGGElement): Unit
    
    /**
      * Add a list of related value prefixed by a path of nodes.
      * A value is defined with the following structure
      * {
      *   id,
      *   rel,
      *   label
      * }
      *
      * @param n
      * @param relPath
      * @param values
      * @param isNegative
      */
    def addRelatedBranch(n: Node, relPath: js.Array[Node], values: js.Array[Node], isNegative: Boolean): Unit
    
    /**
      * Add a list of related value if not already found in node.
      * A value is defined with the following structure
      * {
      *   id,
      *   rel,
      *   label
      * }
      *
      * @param n
      * @param values
      * @param isNegative
      */
    def addRelatedValues(n: Node, values: js.Array[Node], isNegative: Boolean): Unit
    
    /**
      * Add a value in a node with the given id and the value of the first attribute if found in its data.
      *
      * @param nodeIds a list of node ids where to add the value.
      * @param displayAttributeValue the value to find in data and to add if found
      */
    def addValue(nodeIds: js.Array[String], displayAttributeValue: Any): Boolean
    
    /**
      * Add value in all CHOOSE nodes with specified label.
      *
      * @param label nodes where to insert
      * @param value
      */
    def addValueForLabel(label: String, value: Any): Boolean
    
    /**
      * Function called on choose node click.
      * In this case a query is executed to get all the possible value
      * @param clickedNode
      * TODO optimize with cached data?
      */
    def chooseNodeClick(clickedNode: Node): Unit
    
    // Store choose node state to avoid multiple node expand at the same time
    var chooseWaiting: Boolean
    
    /**
      * Function to add on node event to clear the selection.
      * Call to this function on a node will remove the selected value and trigger a graph update.
      */
    def clearSelection(): Unit
    
    /**
      * Collapse all nodes with value expanded.
      *
      */
    def collapseAllNode(): Unit
    
    /**
      * Remove all the value node directly linked to clicked node.
      *
      * @param clickedNode
      */
    def collapseNode(clickedNode: Node): Unit
    
    /**
      * Function called to expand a node containing values.
      * This function will create the value nodes with the clicked node internal data.
      * Only nodes corresponding to the current page index will be generated.
      *
      * @param clickedNode
      */
    def expandNode(clickedNode: Node): Unit
    
    /**
      * Expands all the relationships available in node.
      *
      * @param n
      * @param callback
      */
    def expandRelationships(n: Node, callback: js.Function0[Unit]): Unit
    
    /**
      * A value is defined with the following structure
      * {
      *   id,
      *   rel,
      *   label
      * }
      *
      * @param n
      * @param values
      */
    def filterExistingValues(n: Node, values: js.Array[Node]): js.Array[Node]
    
    // ID of the g element in SVG graph containing all the link elements.
    var gID: String
    
    /**
      * Create a normalized identifier from a node label.
      * Multiple calls with the same node label will generate different unique identifier.
      *
      * @param nodeLabel
      * @returns normalized identifier from a node label
      */
    def generateInternalLabel(nodeLabel: String): String
    
    /**
      * Return all nodes with isAutoLoadValue property set to true.
      */
    def getAutoLoadValueNodes(): js.Array[Node]
    
    /**
      * Get all nodes that contains a value.
      *
      * @param label If set return only node of this label.
      * @return Array of nodes containing at least one value.
      */
    def getContainingValue(label: String): js.Array[Node]
    
    def getDonutInnerRadius(): Double
    
    def getDonutOuterRadius(): Double
    
    /**
      * Get in the parent nodes the closest one to the root.
      *
      * @param n the node to start from.
      * @return the trunk node or the node in parameters if not found.
      */
    def getTrunkNode(n: Node): Any
    
    /**
      * Get the value in the provided nodeId for a specific value id.
      *
      * @param nodeId
      * @param constraintAttributeValue
      */
    def getValue(nodeId: String, constraintAttributeValue: Any): Any
    
    // Used to generate unique internal labels used for example as identifier in Cypher query.
    var internalLabels: StringDictionary[Double]
    
    /**
      * Fetches the list of relationships of a node and store them in the relationships property.
      *
      * @param n the node to fetch the relationships.
      * @param callback
      * @param directionAngle
      */
    def loadRelationshipData(n: Node, callback: js.Function0[Unit], directionAngle: Double): Unit
    
    /**
      * Handle mouse out event on nodes.
      */
    def mouseOutNode(): Unit
    
    /**
      * Handle the mouse over event on nodes.
      */
    def mouseOverNode(): Unit
    
    /**
      * Handle the click event on nodes.
      */
    def nodeClick(): Unit
    
    /**
      * Defines the list of possible nodes.
      * ROOT: Node used as graph root. It is the target of the query. Only one node of this type should be available in graph.
      * CHOOSE: Nodes defining a generic node label. From these node is is possible to select a value or explore relations.
      * VALUE: Unique node containing a value constraint. Usually replace CHOOSE nodes once a value as been selected.
      * GROUP: Empty node used to group relations. No value can be selected but relations can be explored. These nodes doesn't have count.
      */
    var nodeTypes: ReadonlyROOT0CHOOSE0VALUE
    
    /**
      * Generates a pie for the given array of data, returning an array of objects representing each datum’s arc angles.
      * Any additional arguments are arbitrary; they are simply propagated to the pie generator’s accessor functions along with the this object.
      * The length of the returned array is the same as data, and each element i in the returned array corresponds to the element i in the input data.
      *
      * This representation is designed to work with the arc generator’s default startAngle, endAngle and padAngle accessors.
      * The angular units are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify angles in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * @param data Array of data elements.
      */
    def pie(data: js.Array[Double], args: Any*): js.Array[PieArcDatum[Double]]
    @JSName("pie")
    var pie_Original: Pie_[ThisType[Any], Double]
    
    /**
      * Remove old elements.
      * Should be called after updateData.
      */
    def removeElements(exitingData: js.Array[Node]): Unit
    
    /**
      * Remove empty branches containing a node.
      *
      * @param n the node to remove.
      * @return true if node have been removed
      */
    def removeEmptyBranches(n: Node): Boolean
    
    /**
      * Remove in all expanded nodes the value containing the specified value for the given attribute.
      * And move it back to nodes data.
      *
      * @param attribute
      * @param value
      */
    def removeExpandedValue(attribute: String, value: Any): Unit
    
    /**
      * Remove a node and its relationships (recursively) from the graph.
      *
      * @param n the node to remove.
      */
    def removeNode(n: Node): Boolean
    
    /**
      * Remove a value from a node.
      * If the value is not found nothing is done.
      *
      * @param n
      * @param value
      */
    def removeValue(n: Node, value: Any): Boolean
    
    def removeValues(n: Node): Boolean
    
    def segmentClick(d: Any): Unit
    
    /**
      * Update values for nodes having preloadData property
      */
    def updateAutoLoadValues(): Unit
    
    def updateBackgroundElements(): Unit
    
    /**
      * Update nodes and result counts by executing a query for every nodes with the new graph structure.
      */
    def updateCount(): Unit
    
    /**
      * Update node data with changes done in dataModel.nodes model.
      */
    def updateData(): Unit
    
    /**
      * Updates all elements.
      */
    def updateElements(): Unit
    
    /**
      * Updates the foreground elements
      */
    def updateForegroundElements(): Unit
    
    /**
      * Update the middle layer of nodes.
      * TODO refactor node generation to allow future extensions (for example add plugin with new node types...)
      */
    def updateMiddlegroundElements(): Unit
    
    def updateMiddlegroundElementsDisplayedText(middleG: js.Array[Node]): Unit
    
    def updateMiddlegroundElementsImage(gMiddlegroundImageNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsSVG(gMiddlegroundSVGNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsSymbol(gMiddlegroundSymbolNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsText(gMiddlegroundTextNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsTooltip(middleG: SVGGElement): Unit
    
    /**
      * Update Nodes SVG elements using D3.js update mechanisms.
      */
    def updateNodes(): Unit
    
    /**
      * Function called on a value node click.
      * In this case the value is added in the parent node and all the value nodes are collapsed.
      *
      * @param clickedNode
      */
    def valueNodeClick(clickedNode: Node): Unit
  }
  object Node {
    
    inline def apply(
      CountBox: H,
      DONUTS_MARGIN: Double,
      DONUT_WIDTH: Double,
      NODE_MAX_CHARS: Double,
      NODE_TITLE_MAX_CHARS: Double,
      PAGE_RESIZE: Double,
      addBackgroundElements: SVGGElement => Callback,
      addExpandedValue: (String, Any) => Callback,
      addForegroundElements: SVGGElement => Callback,
      addMiddlegroundElements: SVGGElement => Callback,
      addNewElements: SVGGElement => Callback,
      addRelatedBranch: (Node, js.Array[Node], js.Array[Node], Boolean) => Callback,
      addRelatedValues: (Node, js.Array[Node], Boolean) => Callback,
      addValue: (js.Array[String], Any) => Boolean,
      addValueForLabel: (String, Any) => Boolean,
      chooseNodeClick: Node => Callback,
      chooseWaiting: Boolean,
      clearSelection: Callback,
      collapseAllNode: Callback,
      collapseNode: Node => Callback,
      expandNode: Node => Callback,
      expandRelationships: (Node, js.Function0[Unit]) => Callback,
      filterExistingValues: (Node, js.Array[Node]) => js.Array[Node],
      gID: String,
      generateInternalLabel: String => String,
      getAutoLoadValueNodes: CallbackTo[js.Array[Node]],
      getContainingValue: String => js.Array[Node],
      getDonutInnerRadius: CallbackTo[Double],
      getDonutOuterRadius: CallbackTo[Double],
      getTrunkNode: Node => Any,
      getValue: (String, Any) => Any,
      internalLabels: StringDictionary[Double],
      loadRelationshipData: (Node, js.Function0[Unit], Double) => Callback,
      mouseOutNode: Callback,
      mouseOverNode: Callback,
      nodeClick: Callback,
      nodeTypes: ReadonlyROOT0CHOOSE0VALUE,
      pie: Pie_[ThisType[Any], Double],
      removeElements: js.Array[Node] => Callback,
      removeEmptyBranches: Node => Boolean,
      removeExpandedValue: (String, Any) => Callback,
      removeNode: Node => Boolean,
      removeValue: (Node, Any) => Boolean,
      removeValues: Node => Boolean,
      segmentClick: Any => Callback,
      updateAutoLoadValues: Callback,
      updateBackgroundElements: Callback,
      updateCount: Callback,
      updateData: Callback,
      updateElements: Callback,
      updateForegroundElements: Callback,
      updateMiddlegroundElements: Callback,
      updateMiddlegroundElementsDisplayedText: js.Array[Node] => Callback,
      updateMiddlegroundElementsImage: SVGGElement => Callback,
      updateMiddlegroundElementsSVG: SVGGElement => Callback,
      updateMiddlegroundElementsSymbol: SVGGElement => Callback,
      updateMiddlegroundElementsText: SVGGElement => Callback,
      updateMiddlegroundElementsTooltip: SVGGElement => Callback,
      updateNodes: Callback,
      valueNodeClick: Node => Callback
    ): Node = {
      val __obj = js.Dynamic.literal(CountBox = CountBox.asInstanceOf[js.Any], DONUTS_MARGIN = DONUTS_MARGIN.asInstanceOf[js.Any], DONUT_WIDTH = DONUT_WIDTH.asInstanceOf[js.Any], NODE_MAX_CHARS = NODE_MAX_CHARS.asInstanceOf[js.Any], NODE_TITLE_MAX_CHARS = NODE_TITLE_MAX_CHARS.asInstanceOf[js.Any], PAGE_RESIZE = PAGE_RESIZE.asInstanceOf[js.Any], addBackgroundElements = js.Any.fromFunction1((t0: SVGGElement) => addBackgroundElements(t0).runNow()), addExpandedValue = js.Any.fromFunction2((t0: String, t1: Any) => (addExpandedValue(t0, t1)).runNow()), addForegroundElements = js.Any.fromFunction1((t0: SVGGElement) => addForegroundElements(t0).runNow()), addMiddlegroundElements = js.Any.fromFunction1((t0: SVGGElement) => addMiddlegroundElements(t0).runNow()), addNewElements = js.Any.fromFunction1((t0: SVGGElement) => addNewElements(t0).runNow()), addRelatedBranch = js.Any.fromFunction4((t0: Node, t1: js.Array[Node], t2: js.Array[Node], t3: Boolean) => (addRelatedBranch(t0, t1, t2, t3)).runNow()), addRelatedValues = js.Any.fromFunction3((t0: Node, t1: js.Array[Node], t2: Boolean) => (addRelatedValues(t0, t1, t2)).runNow()), addValue = js.Any.fromFunction2(addValue), addValueForLabel = js.Any.fromFunction2(addValueForLabel), chooseNodeClick = js.Any.fromFunction1((t0: Node) => chooseNodeClick(t0).runNow()), chooseWaiting = chooseWaiting.asInstanceOf[js.Any], clearSelection = clearSelection.toJsFn, collapseAllNode = collapseAllNode.toJsFn, collapseNode = js.Any.fromFunction1((t0: Node) => collapseNode(t0).runNow()), expandNode = js.Any.fromFunction1((t0: Node) => expandNode(t0).runNow()), expandRelationships = js.Any.fromFunction2((t0: Node, t1: js.Function0[Unit]) => (expandRelationships(t0, t1)).runNow()), filterExistingValues = js.Any.fromFunction2(filterExistingValues), gID = gID.asInstanceOf[js.Any], generateInternalLabel = js.Any.fromFunction1(generateInternalLabel), getAutoLoadValueNodes = getAutoLoadValueNodes.toJsFn, getContainingValue = js.Any.fromFunction1(getContainingValue), getDonutInnerRadius = getDonutInnerRadius.toJsFn, getDonutOuterRadius = getDonutOuterRadius.toJsFn, getTrunkNode = js.Any.fromFunction1(getTrunkNode), getValue = js.Any.fromFunction2(getValue), internalLabels = internalLabels.asInstanceOf[js.Any], loadRelationshipData = js.Any.fromFunction3((t0: Node, t1: js.Function0[Unit], t2: Double) => (loadRelationshipData(t0, t1, t2)).runNow()), mouseOutNode = mouseOutNode.toJsFn, mouseOverNode = mouseOverNode.toJsFn, nodeClick = nodeClick.toJsFn, nodeTypes = nodeTypes.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], removeElements = js.Any.fromFunction1((t0: js.Array[Node]) => removeElements(t0).runNow()), removeEmptyBranches = js.Any.fromFunction1(removeEmptyBranches), removeExpandedValue = js.Any.fromFunction2((t0: String, t1: Any) => (removeExpandedValue(t0, t1)).runNow()), removeNode = js.Any.fromFunction1(removeNode), removeValue = js.Any.fromFunction2(removeValue), removeValues = js.Any.fromFunction1(removeValues), segmentClick = js.Any.fromFunction1((t0: Any) => segmentClick(t0).runNow()), updateAutoLoadValues = updateAutoLoadValues.toJsFn, updateBackgroundElements = updateBackgroundElements.toJsFn, updateCount = updateCount.toJsFn, updateData = updateData.toJsFn, updateElements = updateElements.toJsFn, updateForegroundElements = updateForegroundElements.toJsFn, updateMiddlegroundElements = updateMiddlegroundElements.toJsFn, updateMiddlegroundElementsDisplayedText = js.Any.fromFunction1((t0: js.Array[Node]) => updateMiddlegroundElementsDisplayedText(t0).runNow()), updateMiddlegroundElementsImage = js.Any.fromFunction1((t0: SVGGElement) => updateMiddlegroundElementsImage(t0).runNow()), updateMiddlegroundElementsSVG = js.Any.fromFunction1((t0: SVGGElement) => updateMiddlegroundElementsSVG(t0).runNow()), updateMiddlegroundElementsSymbol = js.Any.fromFunction1((t0: SVGGElement) => updateMiddlegroundElementsSymbol(t0).runNow()), updateMiddlegroundElementsText = js.Any.fromFunction1((t0: SVGGElement) => updateMiddlegroundElementsText(t0).runNow()), updateMiddlegroundElementsTooltip = js.Any.fromFunction1((t0: SVGGElement) => updateMiddlegroundElementsTooltip(t0).runNow()), updateNodes = updateNodes.toJsFn, valueNodeClick = js.Any.fromFunction1((t0: Node) => valueNodeClick(t0).runNow()))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAddBackgroundElements(value: SVGGElement => Callback): Self = StObject.set(x, "addBackgroundElements", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setAddExpandedValue(value: (String, Any) => Callback): Self = StObject.set(x, "addExpandedValue", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAddForegroundElements(value: SVGGElement => Callback): Self = StObject.set(x, "addForegroundElements", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setAddMiddlegroundElements(value: SVGGElement => Callback): Self = StObject.set(x, "addMiddlegroundElements", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setAddNewElements(value: SVGGElement => Callback): Self = StObject.set(x, "addNewElements", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setAddRelatedBranch(value: (Node, js.Array[Node], js.Array[Node], Boolean) => Callback): Self = StObject.set(x, "addRelatedBranch", js.Any.fromFunction4((t0: Node, t1: js.Array[Node], t2: js.Array[Node], t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAddRelatedValues(value: (Node, js.Array[Node], Boolean) => Callback): Self = StObject.set(x, "addRelatedValues", js.Any.fromFunction3((t0: Node, t1: js.Array[Node], t2: Boolean) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddValue(value: (js.Array[String], Any) => Boolean): Self = StObject.set(x, "addValue", js.Any.fromFunction2(value))
      
      inline def setAddValueForLabel(value: (String, Any) => Boolean): Self = StObject.set(x, "addValueForLabel", js.Any.fromFunction2(value))
      
      inline def setChooseNodeClick(value: Node => Callback): Self = StObject.set(x, "chooseNodeClick", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setChooseWaiting(value: Boolean): Self = StObject.set(x, "chooseWaiting", value.asInstanceOf[js.Any])
      
      inline def setClearSelection(value: Callback): Self = StObject.set(x, "clearSelection", value.toJsFn)
      
      inline def setCollapseAllNode(value: Callback): Self = StObject.set(x, "collapseAllNode", value.toJsFn)
      
      inline def setCollapseNode(value: Node => Callback): Self = StObject.set(x, "collapseNode", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setCountBox(value: H): Self = StObject.set(x, "CountBox", value.asInstanceOf[js.Any])
      
      inline def setDONUTS_MARGIN(value: Double): Self = StObject.set(x, "DONUTS_MARGIN", value.asInstanceOf[js.Any])
      
      inline def setDONUT_WIDTH(value: Double): Self = StObject.set(x, "DONUT_WIDTH", value.asInstanceOf[js.Any])
      
      inline def setExpandNode(value: Node => Callback): Self = StObject.set(x, "expandNode", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
      
      inline def setExpandRelationships(value: (Node, js.Function0[Unit]) => Callback): Self = StObject.set(x, "expandRelationships", js.Any.fromFunction2((t0: Node, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setFilterExistingValues(value: (Node, js.Array[Node]) => js.Array[Node]): Self = StObject.set(x, "filterExistingValues", js.Any.fromFunction2(value))
      
      inline def setGID(value: String): Self = StObject.set(x, "gID", value.asInstanceOf[js.Any])
      
      inline def setGenerateInternalLabel(value: String => String): Self = StObject.set(x, "generateInternalLabel", js.Any.fromFunction1(value))
      
      inline def setGetAutoLoadValueNodes(value: CallbackTo[js.Array[Node]]): Self = StObject.set(x, "getAutoLoadValueNodes", value.toJsFn)
      
      inline def setGetContainingValue(value: String => js.Array[Node]): Self = StObject.set(x, "getContainingValue", js.Any.fromFunction1(value))
      
      inline def setGetDonutInnerRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getDonutInnerRadius", value.toJsFn)
      
      inline def setGetDonutOuterRadius(value: CallbackTo[Double]): Self = StObject.set(x, "getDonutOuterRadius", value.toJsFn)
      
      inline def setGetTrunkNode(value: Node => Any): Self = StObject.set(x, "getTrunkNode", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: (String, Any) => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
      
      inline def setInternalLabels(value: StringDictionary[Double]): Self = StObject.set(x, "internalLabels", value.asInstanceOf[js.Any])
      
      inline def setLoadRelationshipData(value: (Node, js.Function0[Unit], Double) => Callback): Self = StObject.set(x, "loadRelationshipData", js.Any.fromFunction3((t0: Node, t1: js.Function0[Unit], t2: Double) => (value(t0, t1, t2)).runNow()))
      
      inline def setMouseOutNode(value: Callback): Self = StObject.set(x, "mouseOutNode", value.toJsFn)
      
      inline def setMouseOverNode(value: Callback): Self = StObject.set(x, "mouseOverNode", value.toJsFn)
      
      inline def setNODE_MAX_CHARS(value: Double): Self = StObject.set(x, "NODE_MAX_CHARS", value.asInstanceOf[js.Any])
      
      inline def setNODE_TITLE_MAX_CHARS(value: Double): Self = StObject.set(x, "NODE_TITLE_MAX_CHARS", value.asInstanceOf[js.Any])
      
      inline def setNodeClick(value: Callback): Self = StObject.set(x, "nodeClick", value.toJsFn)
      
      inline def setNodeTypes(value: ReadonlyROOT0CHOOSE0VALUE): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setPAGE_RESIZE(value: Double): Self = StObject.set(x, "PAGE_RESIZE", value.asInstanceOf[js.Any])
      
      inline def setPie(value: Pie_[ThisType[Any], Double]): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
      
      inline def setRemoveElements(value: js.Array[Node] => Callback): Self = StObject.set(x, "removeElements", js.Any.fromFunction1((t0: js.Array[Node]) => value(t0).runNow()))
      
      inline def setRemoveEmptyBranches(value: Node => Boolean): Self = StObject.set(x, "removeEmptyBranches", js.Any.fromFunction1(value))
      
      inline def setRemoveExpandedValue(value: (String, Any) => Callback): Self = StObject.set(x, "removeExpandedValue", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setRemoveNode(value: Node => Boolean): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
      
      inline def setRemoveValue(value: (Node, Any) => Boolean): Self = StObject.set(x, "removeValue", js.Any.fromFunction2(value))
      
      inline def setRemoveValues(value: Node => Boolean): Self = StObject.set(x, "removeValues", js.Any.fromFunction1(value))
      
      inline def setSegmentClick(value: Any => Callback): Self = StObject.set(x, "segmentClick", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setUpdateAutoLoadValues(value: Callback): Self = StObject.set(x, "updateAutoLoadValues", value.toJsFn)
      
      inline def setUpdateBackgroundElements(value: Callback): Self = StObject.set(x, "updateBackgroundElements", value.toJsFn)
      
      inline def setUpdateCount(value: Callback): Self = StObject.set(x, "updateCount", value.toJsFn)
      
      inline def setUpdateData(value: Callback): Self = StObject.set(x, "updateData", value.toJsFn)
      
      inline def setUpdateElements(value: Callback): Self = StObject.set(x, "updateElements", value.toJsFn)
      
      inline def setUpdateForegroundElements(value: Callback): Self = StObject.set(x, "updateForegroundElements", value.toJsFn)
      
      inline def setUpdateMiddlegroundElements(value: Callback): Self = StObject.set(x, "updateMiddlegroundElements", value.toJsFn)
      
      inline def setUpdateMiddlegroundElementsDisplayedText(value: js.Array[Node] => Callback): Self = StObject.set(x, "updateMiddlegroundElementsDisplayedText", js.Any.fromFunction1((t0: js.Array[Node]) => value(t0).runNow()))
      
      inline def setUpdateMiddlegroundElementsImage(value: SVGGElement => Callback): Self = StObject.set(x, "updateMiddlegroundElementsImage", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setUpdateMiddlegroundElementsSVG(value: SVGGElement => Callback): Self = StObject.set(x, "updateMiddlegroundElementsSVG", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setUpdateMiddlegroundElementsSymbol(value: SVGGElement => Callback): Self = StObject.set(x, "updateMiddlegroundElementsSymbol", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setUpdateMiddlegroundElementsText(value: SVGGElement => Callback): Self = StObject.set(x, "updateMiddlegroundElementsText", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setUpdateMiddlegroundElementsTooltip(value: SVGGElement => Callback): Self = StObject.set(x, "updateMiddlegroundElementsTooltip", js.Any.fromFunction1((t0: SVGGElement) => value(t0).runNow()))
      
      inline def setUpdateNodes(value: Callback): Self = StObject.set(x, "updateNodes", value.toJsFn)
      
      inline def setValueNodeClick(value: Node => Callback): Self = StObject.set(x, "valueNodeClick", js.Any.fromFunction1((t0: Node) => value(t0).runNow()))
    }
  }
}
