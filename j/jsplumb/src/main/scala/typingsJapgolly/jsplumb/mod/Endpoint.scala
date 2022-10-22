package typingsJapgolly.jsplumb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint
  extends StObject
     with UIComponent {
  
  var anchor: Anchor
  
  var connections: js.UndefOr[js.Array[Connection]] = js.undefined
  
  def connectorSelector(): Connection
  
  def getElement(): Element
  
  //= 1?
  var id: String
  
  def isEnabled(): Boolean
  
  var maxConnections: Double
  
  var scope: String
  
  def setElement(el: Element): Unit
  
  def setEnabled(enabled: Boolean): Unit
  
  def setEndpoint(spec: EndpointSpec): Unit
  
  def setHover(hover: Boolean): Unit
  
  var `type`: EndpointId
}
object Endpoint {
  
  inline def apply(
    anchor: Anchor,
    connectorSelector: CallbackTo[Connection],
    getElement: CallbackTo[Element],
    getParameter: String => Any,
    getParameters: CallbackTo[Record[String, Any]],
    id: String,
    isEnabled: CallbackTo[Boolean],
    maxConnections: Double,
    scope: String,
    setElement: Element => Callback,
    setEnabled: Boolean => Callback,
    setEndpoint: EndpointSpec => Callback,
    setHover: Boolean => Callback,
    setParameter: (String, Any) => Callback,
    setParameters: Record[String, Any] => Callback,
    `type`: EndpointId
  ): Endpoint = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], connectorSelector = connectorSelector.toJsFn, getElement = getElement.toJsFn, getParameter = js.Any.fromFunction1(getParameter), getParameters = getParameters.toJsFn, id = id.asInstanceOf[js.Any], isEnabled = isEnabled.toJsFn, maxConnections = maxConnections.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], setElement = js.Any.fromFunction1((t0: Element) => setElement(t0).runNow()), setEnabled = js.Any.fromFunction1((t0: Boolean) => setEnabled(t0).runNow()), setEndpoint = js.Any.fromFunction1((t0: EndpointSpec) => setEndpoint(t0).runNow()), setHover = js.Any.fromFunction1((t0: Boolean) => setHover(t0).runNow()), setParameter = js.Any.fromFunction2((t0: String, t1: Any) => (setParameter(t0, t1)).runNow()), setParameters = js.Any.fromFunction1((t0: Record[String, Any]) => setParameters(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setConnections(value: js.Array[Connection]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setConnectorSelector(value: CallbackTo[Connection]): Self = StObject.set(x, "connectorSelector", value.toJsFn)
    
    inline def setGetElement(value: CallbackTo[Element]): Self = StObject.set(x, "getElement", value.toJsFn)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSetElement(value: Element => Callback): Self = StObject.set(x, "setElement", js.Any.fromFunction1((t0: Element) => value(t0).runNow()))
    
    inline def setSetEnabled(value: Boolean => Callback): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetEndpoint(value: EndpointSpec => Callback): Self = StObject.set(x, "setEndpoint", js.Any.fromFunction1((t0: EndpointSpec) => value(t0).runNow()))
    
    inline def setSetHover(value: Boolean => Callback): Self = StObject.set(x, "setHover", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setType(value: EndpointId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
