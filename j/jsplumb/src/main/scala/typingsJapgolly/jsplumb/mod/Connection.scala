package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection
  extends StObject
     with UIComponent {
  
  def addOverlay(spec: OverlaySpec): Overlay
  
  val endpoints: js.Tuple2[Endpoint, Endpoint]
  
  def getElement(): Connection
  
  def getLabelOverlay(): Overlay
  
  def getOverlay(id: String): Overlay
  
  def getOverlays(): js.Object
  
  def hideOverlay(id: String): Unit
  
  val id: ConnectionId
  
  def removeOverlay(id: String): Unit
  
  def repaint(): Unit
  
  def setDetachable(detachable: Boolean): Unit
  
  def setLabel(s: String): Unit
  
  def showOverlay(id: String): Unit
  
  val source: Element
  
  val sourceId: String
  
  val target: Element
  
  val targetId: String
}
object Connection {
  
  inline def apply(
    addOverlay: OverlaySpec => Overlay,
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: CallbackTo[Connection],
    getLabelOverlay: CallbackTo[Overlay],
    getOverlay: String => Overlay,
    getOverlays: CallbackTo[js.Object],
    getParameter: String => Any,
    getParameters: CallbackTo[Record[String, Any]],
    hideOverlay: String => Callback,
    id: ConnectionId,
    removeOverlay: String => Callback,
    repaint: Callback,
    setDetachable: Boolean => Callback,
    setLabel: String => Callback,
    setParameter: (String, Any) => Callback,
    setParameters: Record[String, Any] => Callback,
    showOverlay: String => Callback,
    source: Element,
    sourceId: String,
    target: Element,
    targetId: String
  ): Connection = {
    val __obj = js.Dynamic.literal(addOverlay = js.Any.fromFunction1(addOverlay), endpoints = endpoints.asInstanceOf[js.Any], getElement = getElement.toJsFn, getLabelOverlay = getLabelOverlay.toJsFn, getOverlay = js.Any.fromFunction1(getOverlay), getOverlays = getOverlays.toJsFn, getParameter = js.Any.fromFunction1(getParameter), getParameters = getParameters.toJsFn, hideOverlay = js.Any.fromFunction1((t0: String) => hideOverlay(t0).runNow()), id = id.asInstanceOf[js.Any], removeOverlay = js.Any.fromFunction1((t0: String) => removeOverlay(t0).runNow()), repaint = repaint.toJsFn, setDetachable = js.Any.fromFunction1((t0: Boolean) => setDetachable(t0).runNow()), setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setParameter = js.Any.fromFunction2((t0: String, t1: Any) => (setParameter(t0, t1)).runNow()), setParameters = js.Any.fromFunction1((t0: Record[String, Any]) => setParameters(t0).runNow()), showOverlay = js.Any.fromFunction1((t0: String) => showOverlay(t0).runNow()), source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setAddOverlay(value: OverlaySpec => Overlay): Self = StObject.set(x, "addOverlay", js.Any.fromFunction1(value))
    
    inline def setEndpoints(value: js.Tuple2[Endpoint, Endpoint]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setGetElement(value: CallbackTo[Connection]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setGetLabelOverlay(value: CallbackTo[Overlay]): Self = StObject.set(x, "getLabelOverlay", value.toJsFn)
    
    inline def setGetOverlay(value: String => Overlay): Self = StObject.set(x, "getOverlay", js.Any.fromFunction1(value))
    
    inline def setGetOverlays(value: CallbackTo[js.Object]): Self = StObject.set(x, "getOverlays", value.toJsFn)
    
    inline def setHideOverlay(value: String => Callback): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setId(value: ConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRemoveOverlay(value: String => Callback): Self = StObject.set(x, "removeOverlay", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRepaint(value: Callback): Self = StObject.set(x, "repaint", value.toJsFn)
    
    inline def setSetDetachable(value: Boolean => Callback): Self = StObject.set(x, "setDetachable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetLabel(value: String => Callback): Self = StObject.set(x, "setLabel", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setShowOverlay(value: String => Callback): Self = StObject.set(x, "showOverlay", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
