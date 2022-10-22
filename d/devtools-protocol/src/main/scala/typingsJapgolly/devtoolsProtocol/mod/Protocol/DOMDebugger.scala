package typingsJapgolly.devtoolsProtocol.mod.Protocol

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.ScriptId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOMDebugger {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`trustedtype-sink-violation`
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`trustedtype-policy-violation`
  */
  trait CSPViolationType extends StObject
  object CSPViolationType {
    
    inline def `trustedtype-policy-violation`: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`trustedtype-policy-violation` = "trustedtype-policy-violation".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`trustedtype-policy-violation`]
    
    inline def `trustedtype-sink-violation`: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`trustedtype-sink-violation` = "trustedtype-sink-violation".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`trustedtype-sink-violation`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`subtree-modified`
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`attribute-modified`
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`node-removed`
  */
  trait DOMBreakpointType extends StObject
  object DOMBreakpointType {
    
    inline def `attribute-modified`: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`attribute-modified` = "attribute-modified".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`attribute-modified`]
    
    inline def `node-removed`: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`node-removed` = "node-removed".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`node-removed`]
    
    inline def `subtree-modified`: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`subtree-modified` = "subtree-modified".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.`subtree-modified`]
  }
  
  trait EventListener extends StObject {
    
    /**
      * Node the listener is added to (if any).
      */
    var backendNodeId: js.UndefOr[BackendNodeId] = js.undefined
    
    /**
      * Column number in the script (0-based).
      */
    var columnNumber: integer
    
    /**
      * Event handler function value.
      */
    var handler: js.UndefOr[RemoteObject] = js.undefined
    
    /**
      * Line number in the script (0-based).
      */
    var lineNumber: integer
    
    /**
      * `EventListener`'s once flag.
      */
    var once: Boolean
    
    /**
      * Event original handler function value.
      */
    var originalHandler: js.UndefOr[RemoteObject] = js.undefined
    
    /**
      * `EventListener`'s passive flag.
      */
    var passive: Boolean
    
    /**
      * Script id of the handler code.
      */
    var scriptId: ScriptId
    
    /**
      * `EventListener`'s type.
      */
    var `type`: String
    
    /**
      * `EventListener`'s useCapture.
      */
    var useCapture: Boolean
  }
  object EventListener {
    
    inline def apply(
      columnNumber: integer,
      lineNumber: integer,
      once: Boolean,
      passive: Boolean,
      scriptId: ScriptId,
      `type`: String,
      useCapture: Boolean
    ): EventListener = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], passive = passive.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventListener]
    }
    
    extension [Self <: EventListener](x: Self) {
      
      inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
      
      inline def setBackendNodeIdUndefined: Self = StObject.set(x, "backendNodeId", js.undefined)
      
      inline def setColumnNumber(value: integer): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: RemoteObject): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setLineNumber(value: integer): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOriginalHandler(value: RemoteObject): Self = StObject.set(x, "originalHandler", value.asInstanceOf[js.Any])
      
      inline def setOriginalHandlerUndefined: Self = StObject.set(x, "originalHandler", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setScriptId(value: ScriptId): Self = StObject.set(x, "scriptId", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetEventListenersRequest extends StObject {
    
    /**
      * The maximum depth at which Node children should be retrieved, defaults to 1. Use -1 for the
      * entire subtree or provide an integer larger than 0.
      */
    var depth: js.UndefOr[integer] = js.undefined
    
    /**
      * Identifier of the object to return listeners for.
      */
    var objectId: RemoteObjectId
    
    /**
      * Whether or not iframes and shadow roots should be traversed when returning the subtree
      * (default is false). Reports listeners for all contexts if pierce is enabled.
      */
    var pierce: js.UndefOr[Boolean] = js.undefined
  }
  object GetEventListenersRequest {
    
    inline def apply(objectId: RemoteObjectId): GetEventListenersRequest = {
      val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventListenersRequest]
    }
    
    extension [Self <: GetEventListenersRequest](x: Self) {
      
      inline def setDepth(value: integer): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
      
      inline def setPierce(value: Boolean): Self = StObject.set(x, "pierce", value.asInstanceOf[js.Any])
      
      inline def setPierceUndefined: Self = StObject.set(x, "pierce", js.undefined)
    }
  }
  
  trait GetEventListenersResponse extends StObject {
    
    /**
      * Array of relevant listeners.
      */
    var listeners: js.Array[EventListener]
  }
  object GetEventListenersResponse {
    
    inline def apply(listeners: js.Array[EventListener]): GetEventListenersResponse = {
      val __obj = js.Dynamic.literal(listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetEventListenersResponse]
    }
    
    extension [Self <: GetEventListenersResponse](x: Self) {
      
      inline def setListeners(value: js.Array[EventListener]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersVarargs(value: EventListener*): Self = StObject.set(x, "listeners", js.Array(value*))
    }
  }
  
  trait RemoveDOMBreakpointRequest extends StObject {
    
    /**
      * Identifier of the node to remove breakpoint from.
      */
    var nodeId: NodeId
    
    /**
      * Type of the breakpoint to remove.
      */
    var `type`: DOMBreakpointType
  }
  object RemoveDOMBreakpointRequest {
    
    inline def apply(nodeId: NodeId, `type`: DOMBreakpointType): RemoveDOMBreakpointRequest = {
      val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveDOMBreakpointRequest]
    }
    
    extension [Self <: RemoveDOMBreakpointRequest](x: Self) {
      
      inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setType(value: DOMBreakpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveEventListenerBreakpointRequest extends StObject {
    
    /**
      * Event name.
      */
    var eventName: String
    
    /**
      * EventTarget interface name.
      */
    var targetName: js.UndefOr[String] = js.undefined
  }
  object RemoveEventListenerBreakpointRequest {
    
    inline def apply(eventName: String): RemoveEventListenerBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveEventListenerBreakpointRequest]
    }
    
    extension [Self <: RemoveEventListenerBreakpointRequest](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    }
  }
  
  trait RemoveInstrumentationBreakpointRequest extends StObject {
    
    /**
      * Instrumentation name to stop on.
      */
    var eventName: String
  }
  object RemoveInstrumentationBreakpointRequest {
    
    inline def apply(eventName: String): RemoveInstrumentationBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveInstrumentationBreakpointRequest]
    }
    
    extension [Self <: RemoveInstrumentationBreakpointRequest](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveXHRBreakpointRequest extends StObject {
    
    /**
      * Resource URL substring.
      */
    var url: String
  }
  object RemoveXHRBreakpointRequest {
    
    inline def apply(url: String): RemoveXHRBreakpointRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveXHRBreakpointRequest]
    }
    
    extension [Self <: RemoveXHRBreakpointRequest](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetBreakOnCSPViolationRequest extends StObject {
    
    /**
      * CSP Violations to stop upon.
      */
    var violationTypes: js.Array[CSPViolationType]
  }
  object SetBreakOnCSPViolationRequest {
    
    inline def apply(violationTypes: js.Array[CSPViolationType]): SetBreakOnCSPViolationRequest = {
      val __obj = js.Dynamic.literal(violationTypes = violationTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetBreakOnCSPViolationRequest]
    }
    
    extension [Self <: SetBreakOnCSPViolationRequest](x: Self) {
      
      inline def setViolationTypes(value: js.Array[CSPViolationType]): Self = StObject.set(x, "violationTypes", value.asInstanceOf[js.Any])
      
      inline def setViolationTypesVarargs(value: CSPViolationType*): Self = StObject.set(x, "violationTypes", js.Array(value*))
    }
  }
  
  trait SetDOMBreakpointRequest extends StObject {
    
    /**
      * Identifier of the node to set breakpoint on.
      */
    var nodeId: NodeId
    
    /**
      * Type of the operation to stop upon.
      */
    var `type`: DOMBreakpointType
  }
  object SetDOMBreakpointRequest {
    
    inline def apply(nodeId: NodeId, `type`: DOMBreakpointType): SetDOMBreakpointRequest = {
      val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDOMBreakpointRequest]
    }
    
    extension [Self <: SetDOMBreakpointRequest](x: Self) {
      
      inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setType(value: DOMBreakpointType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetEventListenerBreakpointRequest extends StObject {
    
    /**
      * DOM Event name to stop on (any DOM event will do).
      */
    var eventName: String
    
    /**
      * EventTarget interface name to stop on. If equal to `"*"` or not provided, will stop on any
      * EventTarget.
      */
    var targetName: js.UndefOr[String] = js.undefined
  }
  object SetEventListenerBreakpointRequest {
    
    inline def apply(eventName: String): SetEventListenerBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetEventListenerBreakpointRequest]
    }
    
    extension [Self <: SetEventListenerBreakpointRequest](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setTargetNameUndefined: Self = StObject.set(x, "targetName", js.undefined)
    }
  }
  
  trait SetInstrumentationBreakpointRequest extends StObject {
    
    /**
      * Instrumentation name to stop on.
      */
    var eventName: String
  }
  object SetInstrumentationBreakpointRequest {
    
    inline def apply(eventName: String): SetInstrumentationBreakpointRequest = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetInstrumentationBreakpointRequest]
    }
    
    extension [Self <: SetInstrumentationBreakpointRequest](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetXHRBreakpointRequest extends StObject {
    
    /**
      * Resource URL substring. All XHRs having this substring in the URL will get stopped upon.
      */
    var url: String
  }
  object SetXHRBreakpointRequest {
    
    inline def apply(url: String): SetXHRBreakpointRequest = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetXHRBreakpointRequest]
    }
    
    extension [Self <: SetXHRBreakpointRequest](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
