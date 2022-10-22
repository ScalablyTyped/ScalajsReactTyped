package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.CSPViolation
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.DOM
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.EventListener
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.OOM
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.XHR
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.ambiguous
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.assert
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.debugCommand
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.exception
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.instrumentation
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.other_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.promiseRejection
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.StackTraceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PausedEvent extends StObject {
  
  /**
    * Never present, will be removed.
    */
  var asyncCallStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Async stack trace, if any.
    */
  var asyncStackTraceId: js.UndefOr[StackTraceId] = js.undefined
  
  /**
    * Call stack the virtual machine stopped on.
    */
  var callFrames: js.Array[CallFrame]
  
  /**
    * Object containing break-specific auxiliary properties.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Hit breakpoints IDs
    */
  var hitBreakpoints: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Pause reason. (PausedEventReason enum)
    */
  var reason: ambiguous | assert | CSPViolation | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
}
object PausedEvent {
  
  inline def apply(
    callFrames: js.Array[CallFrame],
    reason: ambiguous | assert | CSPViolation | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
  ): PausedEvent = {
    val __obj = js.Dynamic.literal(callFrames = callFrames.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[PausedEvent]
  }
  
  extension [Self <: PausedEvent](x: Self) {
    
    inline def setAsyncCallStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncCallStackTraceId", value.asInstanceOf[js.Any])
    
    inline def setAsyncCallStackTraceIdUndefined: Self = StObject.set(x, "asyncCallStackTraceId", js.undefined)
    
    inline def setAsyncStackTrace(value: StackTrace): Self = StObject.set(x, "asyncStackTrace", value.asInstanceOf[js.Any])
    
    inline def setAsyncStackTraceId(value: StackTraceId): Self = StObject.set(x, "asyncStackTraceId", value.asInstanceOf[js.Any])
    
    inline def setAsyncStackTraceIdUndefined: Self = StObject.set(x, "asyncStackTraceId", js.undefined)
    
    inline def setAsyncStackTraceUndefined: Self = StObject.set(x, "asyncStackTrace", js.undefined)
    
    inline def setCallFrames(value: js.Array[CallFrame]): Self = StObject.set(x, "callFrames", value.asInstanceOf[js.Any])
    
    inline def setCallFramesVarargs(value: CallFrame*): Self = StObject.set(x, "callFrames", js.Array(value*))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHitBreakpoints(value: js.Array[String]): Self = StObject.set(x, "hitBreakpoints", value.asInstanceOf[js.Any])
    
    inline def setHitBreakpointsUndefined: Self = StObject.set(x, "hitBreakpoints", js.undefined)
    
    inline def setHitBreakpointsVarargs(value: String*): Self = StObject.set(x, "hitBreakpoints", js.Array(value*))
    
    inline def setReason(
      value: ambiguous | assert | CSPViolation | debugCommand | DOM | EventListener | exception | instrumentation | OOM | other_ | promiseRejection | XHR
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
