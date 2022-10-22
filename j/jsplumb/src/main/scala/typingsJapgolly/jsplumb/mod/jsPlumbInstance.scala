package typingsJapgolly.jsplumb.mod

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.Selection
import typingsJapgolly.jsplumb.anon.Each
import typingsJapgolly.jsplumb.jsplumbStrings.click
import typingsJapgolly.jsplumb.jsplumbStrings.connection
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsplumb", "jsPlumbInstance")
@js.native
open class jsPlumbInstance () extends StObject {
  
  def addEndpoint(el: ElementGroupRef): Endpoint | js.Array[Endpoint] = js.native
  def addEndpoint(el: ElementGroupRef, params: Unit, referenceParams: EndpointOptions): Endpoint | js.Array[Endpoint] = js.native
  def addEndpoint(el: ElementGroupRef, params: EndpointOptions): Endpoint | js.Array[Endpoint] = js.native
  def addEndpoint(el: ElementGroupRef, params: EndpointOptions, referenceParams: EndpointOptions): Endpoint | js.Array[Endpoint] = js.native
  
  def addEndpoints(target: ElementGroupRef, endpoints: js.Array[EndpointOptions]): js.Array[Endpoint] = js.native
  def addEndpoints(target: ElementGroupRef, endpoints: js.Array[EndpointOptions], referenceParams: EndpointOptions): js.Array[Endpoint] = js.native
  
  def addGroup(params: GroupOptions): Group = js.native
  
  def addToGroup(group: String, el: ElementRef): Unit = js.native
  def addToGroup(group: String, el: ElementRef, doNotFireEvent: Boolean): Unit = js.native
  def addToGroup(group: Group, el: ElementRef): Unit = js.native
  def addToGroup(group: Group, el: ElementRef, doNotFireEvent: Boolean): Unit = js.native
  
  def animate(el: ElementRef): Unit = js.native
  def animate(el: ElementRef, properties: js.Object): Unit = js.native
  def animate(el: ElementRef, properties: js.Object, options: js.Object): Unit = js.native
  def animate(el: ElementRef, properties: Unit, options: js.Object): Unit = js.native
  
  def batch(fn: js.Function): Unit = js.native
  def batch(fn: js.Function, doNotRepaintAfterwards: Boolean): Unit = js.native
  
  def bind(
    event: String,
    callback: js.Function2[/* info */ OnConnectionBindInfo, /* originalEvent */ Event, Unit]
  ): Unit = js.native
  def bind(
    event: String,
    callback: js.Function2[/* info */ OnConnectionBindInfo, /* originalEvent */ Event, Unit],
    insertAtStart: Boolean
  ): Unit = js.native
  @JSName("bind")
  def bind_click(event: click, callback: js.Function2[/* info */ Connection, /* originalEvent */ Event, Unit]): Unit = js.native
  @JSName("bind")
  def bind_click(
    event: click,
    callback: js.Function2[/* info */ Connection, /* originalEvent */ Event, Unit],
    insertAtStart: Boolean
  ): Unit = js.native
  @JSName("bind")
  def bind_connection(
    event: connection,
    callback: js.Function2[/* info */ ConnectionMadeEventInfo, /* originalEvent */ Event, Unit]
  ): Unit = js.native
  @JSName("bind")
  def bind_connection(
    event: connection,
    callback: js.Function2[/* info */ ConnectionMadeEventInfo, /* originalEvent */ Event, Unit],
    insertAtStart: Boolean
  ): Unit = js.native
  
  def cleanupListeners(): Unit = js.native
  
  def collapseGroup(group: String): Unit = js.native
  def collapseGroup(group: Group): Unit = js.native
  
  def connect(params: ConnectParams): Connection = js.native
  def connect(params: ConnectParams, referenceParams: js.Object): Connection = js.native
  
  def deleteConnection(conn: Connection): Unit = js.native
  
  def deleteEndpoint(`object`: Endpoint): jsPlumbInstance = js.native
  def deleteEndpoint(`object`: Endpoint, doNotRepaintAfterwards: Boolean): jsPlumbInstance = js.native
  def deleteEndpoint(`object`: UUID): jsPlumbInstance = js.native
  def deleteEndpoint(`object`: UUID, doNotRepaintAfterwards: Boolean): jsPlumbInstance = js.native
  
  def deleteEveryConnection(): Unit = js.native
  
  def deleteEveryEndpoint(): jsPlumbInstance = js.native
  
  def doWhileSuspended(): jsPlumbInstance = js.native
  
  def draggable(el: js.Object): jsPlumbInstance = js.native
  def draggable(el: js.Object, options: DragOptions): jsPlumbInstance = js.native
  
  def empty(el: Selector | String): Unit = js.native
  def empty(el: Element): Unit = js.native
  
  def expandGroup(group: String): Unit = js.native
  def expandGroup(group: String, doNotFireEvent: Boolean): Unit = js.native
  def expandGroup(group: Group): Unit = js.native
  def expandGroup(group: Group, doNotFireEvent: Boolean): Unit = js.native
  
  def fire(event: String, value: js.Object, originalEvent: Event): Unit = js.native
  
  def getAllConnections(): js.Array[Connection] = js.native
  
  def getConnections(scope: String, options: js.Object): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: String): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: String, source: Selector | String): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: String,
    source: Selector | String,
    target: Selector | String
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: String,
    source: Selector | String,
    target: Selector | String,
    flat: Boolean
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: String,
    source: Selector | String,
    target: Unit,
    flat: Boolean
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: String, source: Unit, target: Selector | String): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: String,
    source: Unit,
    target: Selector | String,
    flat: Boolean
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: String, source: Unit, target: Unit, flat: Boolean): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: Unit, source: Selector | String): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: Unit,
    source: Selector | String,
    target: Selector | String
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: Unit,
    source: Selector | String,
    target: Selector | String,
    flat: Boolean
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: Unit,
    source: Selector | String,
    target: Unit,
    flat: Boolean
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: Unit, source: Unit, target: Selector | String): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(
    scope: String,
    options: js.Object,
    scope2: Unit,
    source: Unit,
    target: Selector | String,
    flat: Boolean
  ): js.Array[Any] | (Record[Any, Any]) = js.native
  def getConnections(scope: String, options: js.Object, scope2: Unit, source: Unit, target: Unit, flat: Boolean): js.Array[Any] | (Record[Any, Any]) = js.native
  
  def getContainer(): Element = js.native
  
  def getDefaultScope(): String = js.native
  
  def getEndpoint(uuid: String): Endpoint = js.native
  
  def getEndpoints(element: String): js.Array[Endpoint] = js.native
  def getEndpoints(element: Element): js.Array[Endpoint] = js.native
  
  def getGroup(groupId: String): Group = js.native
  def getGroup(groupId: Group): Group = js.native
  
  def getGroups(): js.Array[Group] = js.native
  
  def getHoverPaintStyle(
    params: js.UndefOr[js.Object],
    scope: js.UndefOr[String],
    source: js.UndefOr[String | Element | Selector | js.Array[Any]],
    target: js.UndefOr[String | Element | Selector | js.Array[Any]],
    element: js.UndefOr[String | Element | Selector | js.Array[Any]]
  ): Selection = js.native
  
  /**
    * Gets the current rotation, if any, for the element with the given id. If no specific rotation has been applied this method will return 0, never null or undefined.
    * @param elementId ID of the element to retrieve rotation for.
    * @returns The element's current rotation, 0 if no rotation applied.
    */
  def getRotation(elementId: String): Double = js.native
  
  def getScope(Element: String): String = js.native
  def getScope(Element: Element): String = js.native
  
  def getSelector(): Unit = js.native
  def getSelector(context: Element): Unit = js.native
  def getSelector(context: Element, spec: String): Unit = js.native
  def getSelector(context: Unit, spec: String): Unit = js.native
  def getSelector(context: Selector): Unit = js.native
  def getSelector(context: Selector, spec: String): Unit = js.native
  
  def getSourceScope(element: String): String = js.native
  def getSourceScope(element: Element): String = js.native
  
  def getTargetScope(element: String): String = js.native
  def getTargetScope(element: Element): String = js.native
  
  def getType(id: String, typeDescriptor: String): js.Object = js.native
  
  def getZoom(): Double = js.native
  
  def hide(el: Selector | String): jsPlumbInstance = js.native
  def hide(el: Selector | String, changeEndpoints: Boolean): jsPlumbInstance = js.native
  def hide(el: Element): jsPlumbInstance = js.native
  def hide(el: Element, changeEndpoints: Boolean): jsPlumbInstance = js.native
  
  def importDefaults(defaults: js.Object): jsPlumbInstance = js.native
  
  def isHoverSuspended(): Boolean = js.native
  
  def isSource(el: Selector | String): Boolean = js.native
  def isSource(el: Element): Boolean = js.native
  
  def isSourceEnabled(el: Selector | String): Boolean = js.native
  def isSourceEnabled(el: Selector | String, connectionType: String): Boolean = js.native
  def isSourceEnabled(el: Element): Boolean = js.native
  def isSourceEnabled(el: Element, connectionType: String): Boolean = js.native
  
  def isSuspendDrawing(): Boolean = js.native
  
  def isSuspendEvents(): Boolean = js.native
  
  def isTarget(el: Selector | String): Boolean = js.native
  def isTarget(el: Element): Boolean = js.native
  
  def isTargetEnabled(el: Selector | String): Boolean = js.native
  def isTargetEnabled(el: Element): Boolean = js.native
  
  def makeSource(
    el: String | Element | Selector,
    params: js.Object,
    endpoint: js.UndefOr[String | js.Array[Any]],
    parent: js.UndefOr[String | Element],
    scope: js.UndefOr[String],
    dragOptions: js.UndefOr[js.Object],
    deleteEndpointsOnEmpty: js.UndefOr[Boolean],
    filter: js.UndefOr[js.Function]
  ): Unit = js.native
  
  def makeTarget(
    el: String | Element | Selector,
    params: js.Object,
    endpoint: js.UndefOr[String | js.Array[Any]],
    scope: js.UndefOr[String],
    dropOptions: js.UndefOr[js.Object],
    deleteEndpointsOnEmpty: js.UndefOr[Boolean],
    maxConnections: js.UndefOr[Double],
    onMaxConnections: js.UndefOr[js.Function]
  ): Unit = js.native
  
  def off(el: String, event: String, fn: js.Function): jsPlumbInstance = js.native
  def off(el: Element, event: String, fn: js.Function): jsPlumbInstance = js.native
  
  def on(el: String): jsPlumbInstance = js.native
  def on(el: String, children: String): jsPlumbInstance = js.native
  def on(el: String, children: String, event: String): jsPlumbInstance = js.native
  def on(el: String, children: String, event: String, fn: js.Function): jsPlumbInstance = js.native
  def on(el: String, children: String, event: Unit, fn: js.Function): jsPlumbInstance = js.native
  def on(el: String, children: Unit, event: String): jsPlumbInstance = js.native
  def on(el: String, children: Unit, event: String, fn: js.Function): jsPlumbInstance = js.native
  def on(el: String, children: Unit, event: Unit, fn: js.Function): jsPlumbInstance = js.native
  def on(el: Element): jsPlumbInstance = js.native
  def on(el: Element, children: String): jsPlumbInstance = js.native
  def on(el: Element, children: String, event: String): jsPlumbInstance = js.native
  def on(el: Element, children: String, event: String, fn: js.Function): jsPlumbInstance = js.native
  def on(el: Element, children: String, event: Unit, fn: js.Function): jsPlumbInstance = js.native
  def on(el: Element, children: Unit, event: String): jsPlumbInstance = js.native
  def on(el: Element, children: Unit, event: String, fn: js.Function): jsPlumbInstance = js.native
  def on(el: Element, children: Unit, event: Unit, fn: js.Function): jsPlumbInstance = js.native
  
  def ready(fn: js.Function): Unit = js.native
  
  def recalculateOffsets(el: Selector | String): Unit = js.native
  def recalculateOffsets(el: Element): Unit = js.native
  
  def refreshAllGroups(): Unit = js.native
  
  def registerConnectionType(typeId: String, `type`: js.Object): Unit = js.native
  
  def registerConnectionTypes(types: js.Object): Unit = js.native
  
  def registerEndpointType(typeId: String, `type`: js.Object): Unit = js.native
  
  def registerEndpointTypes(types: js.Object): Unit = js.native
  
  def remove(el: Selector | String): Unit = js.native
  def remove(el: Element): Unit = js.native
  
  def removeAllEndpoints(el: Selector | String): jsPlumbInstance = js.native
  def removeAllEndpoints(el: Selector | String, recurse: Boolean): jsPlumbInstance = js.native
  def removeAllEndpoints(el: Element): jsPlumbInstance = js.native
  def removeAllEndpoints(el: Element, recurse: Boolean): jsPlumbInstance = js.native
  
  def removeAllGroups(deleteMembers: String): Unit = js.native
  def removeAllGroups(deleteMembers: String, manipulateDOM: Boolean): Unit = js.native
  def removeAllGroups(deleteMembers: String, manipulateDOM: Boolean, doNotFireEvent: Boolean): Unit = js.native
  def removeAllGroups(deleteMembers: String, manipulateDOM: Unit, doNotFireEvent: Boolean): Unit = js.native
  
  def removeFromGroup(group: String, el: ElementRef): Unit = js.native
  def removeFromGroup(group: String, el: ElementRef, doNotFireEvent: Boolean): Unit = js.native
  def removeFromGroup(group: Group, el: ElementRef): Unit = js.native
  def removeFromGroup(group: Group, el: ElementRef, doNotFireEvent: Boolean): Unit = js.native
  
  def removeGroup(group: String, deleteMembers: String): OrphanedPositions | Unit = js.native
  def removeGroup(group: String, deleteMembers: String, manipulateDOM: Boolean): OrphanedPositions | Unit = js.native
  def removeGroup(group: String, deleteMembers: String, manipulateDOM: Boolean, doNotFireEvent: Boolean): OrphanedPositions | Unit = js.native
  def removeGroup(group: String, deleteMembers: String, manipulateDOM: Unit, doNotFireEvent: Boolean): OrphanedPositions | Unit = js.native
  def removeGroup(group: Group, deleteMembers: String): OrphanedPositions | Unit = js.native
  def removeGroup(group: Group, deleteMembers: String, manipulateDOM: Boolean): OrphanedPositions | Unit = js.native
  def removeGroup(group: Group, deleteMembers: String, manipulateDOM: Boolean, doNotFireEvent: Boolean): OrphanedPositions | Unit = js.native
  def removeGroup(group: Group, deleteMembers: String, manipulateDOM: Unit, doNotFireEvent: Boolean): OrphanedPositions | Unit = js.native
  
  def repaint(el: Selector | String): jsPlumbInstance = js.native
  def repaint(el: Element): jsPlumbInstance = js.native
  
  def repaintEverything(): jsPlumbInstance = js.native
  def repaintEverything(clearEdits: Boolean): jsPlumbInstance = js.native
  
  def repaintGroup(group: String): Unit = js.native
  def repaintGroup(group: Group): Unit = js.native
  
  def reset(): Unit = js.native
  def reset(doNotUnbindInstanceEventListeners: Boolean): Unit = js.native
  
  def restoreDefaults(): jsPlumbInstance = js.native
  
  def revalidate(el: String): RedrawResult = js.native
  def revalidate(el: Element): RedrawResult = js.native
  
  /**
    * Rotates the element with the given id by the given amount in degrees. This method sets two properties on the element's style: `transform:rotate(<amount>deg)` and `transform-origin:center center`.
    * Transform origins other than `center center` are not supported. To reset the rotation for some element, call `rotate(elId, 0)`.
    * @param elId
    * @param amountInDegrees
    * @param doNotRedraw
    * @returns a RedrawResult, which is empty if no redraw was requested (or an element with the given id is not being managed)
    */
  def rotate(elId: String, amountInDegrees: Double): RedrawResult = js.native
  def rotate(elId: String, amountInDegrees: Double, doNotRedraw: Boolean): RedrawResult = js.native
  
  def select(): Each = js.native
  def select(params: js.Object): Each = js.native
  def select(params: js.Object, scope: String): Each = js.native
  def select(params: js.Object, scope: String, source: String): Each = js.native
  def select(params: js.Object, scope: String, source: String, target: String): Each = js.native
  def select(
    params: js.Object,
    scope: String,
    source: String,
    target: String,
    connections: js.Array[Connection]
  ): Each = js.native
  def select(params: js.Object, scope: String, source: String, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: js.Object, scope: String, source: Unit, target: String): Each = js.native
  def select(params: js.Object, scope: String, source: Unit, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: js.Object, scope: String, source: Unit, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: js.Object, scope: Unit, source: String): Each = js.native
  def select(params: js.Object, scope: Unit, source: String, target: String): Each = js.native
  def select(params: js.Object, scope: Unit, source: String, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: js.Object, scope: Unit, source: String, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: js.Object, scope: Unit, source: Unit, target: String): Each = js.native
  def select(params: js.Object, scope: Unit, source: Unit, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: js.Object, scope: Unit, source: Unit, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: String): Each = js.native
  def select(params: Unit, scope: String, source: String): Each = js.native
  def select(params: Unit, scope: String, source: String, target: String): Each = js.native
  def select(params: Unit, scope: String, source: String, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: String, source: String, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: String, source: Unit, target: String): Each = js.native
  def select(params: Unit, scope: String, source: Unit, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: String, source: Unit, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: Unit, source: String): Each = js.native
  def select(params: Unit, scope: Unit, source: String, target: String): Each = js.native
  def select(params: Unit, scope: Unit, source: String, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: Unit, source: String, target: Unit, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: Unit, source: Unit, target: String): Each = js.native
  def select(params: Unit, scope: Unit, source: Unit, target: String, connections: js.Array[Connection]): Each = js.native
  def select(params: Unit, scope: Unit, source: Unit, target: Unit, connections: js.Array[Connection]): Each = js.native
  
  def setContainer(el: Selector | String): Unit = js.native
  def setContainer(el: Element): Unit = js.native
  
  def setDefaultScope(scope: String): jsPlumbInstance = js.native
  
  def setDraggable(el: String, draggable: Boolean): Unit = js.native
  def setDraggable(el: js.Array[Any], draggable: Boolean): Unit = js.native
  def setDraggable(el: js.Object, draggable: Boolean): Unit = js.native
  
  def setHover(container: Selector | String): Unit = js.native
  def setHover(container: Element): Unit = js.native
  
  def setHoverSuspended(hover: Boolean): Unit = js.native
  
  def setIdChanged(oldId: String, newId: String): Unit = js.native
  
  def setParent(el: Element, newParent: Selector | String): Unit = js.native
  def setParent(el: Element, newParent: Element): Unit = js.native
  def setParent(el: Selector, newParent: Selector | String): Unit = js.native
  def setParent(el: Selector, newParent: Element): Unit = js.native
  
  def setScope(el: String, scope: String): Unit = js.native
  def setScope(el: Element, scope: String): Unit = js.native
  
  def setSource(connection: Connection, source: String): jsPlumbInstance = js.native
  def setSource(connection: Connection, source: String, doNotRepaint: Boolean): jsPlumbInstance = js.native
  def setSource(connection: Connection, source: Element): jsPlumbInstance = js.native
  def setSource(connection: Connection, source: Element, doNotRepaint: Boolean): jsPlumbInstance = js.native
  def setSource(connection: Connection, source: Endpoint): jsPlumbInstance = js.native
  def setSource(connection: Connection, source: Endpoint, doNotRepaint: Boolean): jsPlumbInstance = js.native
  
  def setSourceEnabled(el: Selector | String, state: Boolean): jsPlumbInstance = js.native
  def setSourceEnabled(el: Element, state: Boolean): jsPlumbInstance = js.native
  
  def setSourceScope(el: String, scope: String): Unit = js.native
  def setSourceScope(el: String, scope: String, connectionType: String): Unit = js.native
  def setSourceScope(el: Element, scope: String): Unit = js.native
  def setSourceScope(el: Element, scope: String, connectionType: String): Unit = js.native
  
  def setSuspendDrawing(`val`: Boolean): Boolean = js.native
  def setSuspendDrawing(`val`: Boolean, repaintAfterwards: Boolean): Boolean = js.native
  
  def setSuspendEvents(`val`: Boolean): Unit = js.native
  
  def setTarget(connection: Connection, target: String): jsPlumbInstance = js.native
  def setTarget(connection: Connection, target: String, doNotRepaint: Boolean): jsPlumbInstance = js.native
  def setTarget(connection: Connection, target: Element): jsPlumbInstance = js.native
  def setTarget(connection: Connection, target: Element, doNotRepaint: Boolean): jsPlumbInstance = js.native
  def setTarget(connection: Connection, target: Endpoint): jsPlumbInstance = js.native
  def setTarget(connection: Connection, target: Endpoint, doNotRepaint: Boolean): jsPlumbInstance = js.native
  
  def setTargetEnabled(el: Selector | String, state: Boolean): jsPlumbInstance = js.native
  def setTargetEnabled(el: Element, state: Boolean): jsPlumbInstance = js.native
  
  def setTargetScope(el: String, scope: String): Unit = js.native
  def setTargetScope(el: String, scope: String, connectionType: String): Unit = js.native
  def setTargetScope(el: Element, scope: String): Unit = js.native
  def setTargetScope(el: Element, scope: String, connectionType: String): Unit = js.native
  
  def setZoom(`val`: Double): Boolean = js.native
  def setZoom(`val`: Double, repaintEverything: Boolean): Boolean = js.native
  
  def show(el: Selector | String): jsPlumbInstance = js.native
  def show(el: Selector | String, changeEndpoints: Boolean): jsPlumbInstance = js.native
  def show(el: Element): jsPlumbInstance = js.native
  def show(el: Element, changeEndpoints: Boolean): jsPlumbInstance = js.native
  
  def toggleDraggable(el: Selector | String): Boolean = js.native
  def toggleDraggable(el: Element): Boolean = js.native
  
  def toggleSourceEnabled(el: Selector | String): Boolean = js.native
  def toggleSourceEnabled(el: Element): Boolean = js.native
  
  def toggleTargetEnabled(el: Selector | String): Boolean = js.native
  def toggleTargetEnabled(el: Element): Boolean = js.native
  
  def toggleVisible(el: Selector | String): Unit = js.native
  def toggleVisible(el: Selector | String, changeEndpoints: Boolean): Unit = js.native
  def toggleVisible(el: Element): Unit = js.native
  def toggleVisible(el: Element, changeEndpoints: Boolean): Unit = js.native
  
  def unbind(): Unit = js.native
  def unbind(eventOrListener: String): Unit = js.native
  def unbind(eventOrListener: String, listener: js.Function): Unit = js.native
  def unbind(eventOrListener: js.Function): Unit = js.native
  def unbind(eventOrListener: js.Function, listener: js.Function): Unit = js.native
  def unbind(eventOrListener: Unit, listener: js.Function): Unit = js.native
  
  def unmakeEverySource(): jsPlumbInstance = js.native
  
  def unmakeEveryTarget(): jsPlumbInstance = js.native
  
  def unmakeSource(el: Selector | String): jsPlumbInstance = js.native
  def unmakeSource(el: Element): jsPlumbInstance = js.native
  
  def unmakeTarget(el: Selector | String): jsPlumbInstance = js.native
  def unmakeTarget(el: Element): jsPlumbInstance = js.native
}
