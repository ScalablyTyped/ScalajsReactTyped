package typingsJapgolly.nightwatch.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.Timestamp
import typingsJapgolly.nightwatch.nightwatchStrings.assert
import typingsJapgolly.nightwatch.nightwatchStrings.clear
import typingsJapgolly.nightwatch.nightwatchStrings.count
import typingsJapgolly.nightwatch.nightwatchStrings.debug_
import typingsJapgolly.nightwatch.nightwatchStrings.dir
import typingsJapgolly.nightwatch.nightwatchStrings.dirxml
import typingsJapgolly.nightwatch.nightwatchStrings.endGroup
import typingsJapgolly.nightwatch.nightwatchStrings.error
import typingsJapgolly.nightwatch.nightwatchStrings.info_
import typingsJapgolly.nightwatch.nightwatchStrings.log
import typingsJapgolly.nightwatch.nightwatchStrings.profile
import typingsJapgolly.nightwatch.nightwatchStrings.profileEnd
import typingsJapgolly.nightwatch.nightwatchStrings.startGroup
import typingsJapgolly.nightwatch.nightwatchStrings.startGroupCollapsed
import typingsJapgolly.nightwatch.nightwatchStrings.table
import typingsJapgolly.nightwatch.nightwatchStrings.timeEnd
import typingsJapgolly.nightwatch.nightwatchStrings.trace
import typingsJapgolly.nightwatch.nightwatchStrings.warning_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<devtools-protocol.devtools-protocol.Protocol.Runtime.ConsoleAPICalledEvent, 'type' | 'timestamp' | 'args'> */
trait PickConsoleAPICalledEvent extends StObject {
  
  var args: js.Array[RemoteObject]
  
  var timestamp: Timestamp
  
  var `type`: log | debug_ | info_ | error | warning_ | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
}
object PickConsoleAPICalledEvent {
  
  inline def apply(
    args: js.Array[RemoteObject],
    timestamp: Timestamp,
    `type`: log | debug_ | info_ | error | warning_ | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
  ): PickConsoleAPICalledEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickConsoleAPICalledEvent]
  }
  
  extension [Self <: PickConsoleAPICalledEvent](x: Self) {
    
    inline def setArgs(value: js.Array[RemoteObject]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: RemoteObject*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: log | debug_ | info_ | error | warning_ | dir | dirxml | table | trace | clear | startGroup | startGroupCollapsed | endGroup | assert | profile | profileEnd | count | timeEnd
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
