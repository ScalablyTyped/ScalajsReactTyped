package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.relayRuntimeStrings.executeDotcomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'execute.complete',   executeId :number}> */
trait Readonlynameexecutecomple
  extends StObject
     with LogEvent {
  
  val executeId: Double
  
  val name: executeDotcomplete
}
object Readonlynameexecutecomple {
  
  inline def apply(executeId: Double): Readonlynameexecutecomple = {
    val __obj = js.Dynamic.literal(executeId = executeId.asInstanceOf[js.Any], name = "execute.complete")
    __obj.asInstanceOf[Readonlynameexecutecomple]
  }
  
  extension [Self <: Readonlynameexecutecomple](x: Self) {
    
    inline def setExecuteId(value: Double): Self = StObject.set(x, "executeId", value.asInstanceOf[js.Any])
    
    inline def setName(value: executeDotcomplete): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
