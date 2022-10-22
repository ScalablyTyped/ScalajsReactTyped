package typingsJapgolly.relayRuntime.libUtilReaderNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderLocalArgument
  - typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRootArgument
*/
trait ReaderArgumentDefinition extends StObject
object ReaderArgumentDefinition {
  
  inline def ReaderLocalArgument(defaultValue: Any, kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderLocalArgument = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderLocalArgument]
  }
  
  inline def ReaderRootArgument(kind: String, name: String): typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRootArgument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderRootArgument]
  }
}
