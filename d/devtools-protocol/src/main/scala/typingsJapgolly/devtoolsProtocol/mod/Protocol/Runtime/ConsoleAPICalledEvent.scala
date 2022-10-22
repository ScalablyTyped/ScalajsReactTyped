package typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.assert
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.clear
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.count
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.debug
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.dir
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.dirxml
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.endGroup
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.info
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.log
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.profile
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.profileEnd
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.startGroup
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.startGroupCollapsed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.table
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.timeEnd
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.trace
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleAPICalledEvent extends StObject {
  
  /**
    * Call arguments.
    */
  var args: js.Array[RemoteObject]
  
  /**
    * Console context descriptor for calls on non-default console context (not console.*):
    * 'anonymous#unique-logger-id' for call on unnamed context, 'name#unique-logger-id' for call
    * on named context.
    */
  var context: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of the context where the call was made.
    */
  var executionContextId: ExecutionContextId
  
  /**
    * Stack trace captured when the call was made. The async stack chain is automatically reported for
    * the following call types: `assert`, `error`, `trace`, `warning`. For other types the async call
    * chain can be retrieved using `Debugger.getStackTrace` and `stackTrace.parentId` field.
    */
  var stackTrace: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Call timestamp.
    */
  var timestamp: Timestamp
  
  /**
    * Type of the call. (ConsoleAPICalledEventType enum)
    */
  var `type`: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
}
object ConsoleAPICalledEvent {
  
  inline def apply(
    args: js.Array[RemoteObject],
    executionContextId: ExecutionContextId,
    timestamp: Timestamp,
    `type`: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
  ): ConsoleAPICalledEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], executionContextId = executionContextId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAPICalledEvent]
  }
  
  extension [Self <: ConsoleAPICalledEvent](x: Self) {
    
    inline def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setExecutionContextId(value: ExecutionContextId): Self = StObject.set(x, "executionContextId", value.asInstanceOf[js.Any])
    
    inline def setStackTrace(value: StackTrace): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    inline def setStackTraceUndefined: Self = StObject.set(x, "stackTrace", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: log | debug | info | error | warning | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
