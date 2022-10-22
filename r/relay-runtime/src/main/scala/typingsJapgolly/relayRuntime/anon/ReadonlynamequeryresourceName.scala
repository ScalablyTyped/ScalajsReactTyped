package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.relayRuntimeStrings.queryresourceDotretain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'queryresource.retain',   resourceID :number,   profilerContext :unknown}> */
trait ReadonlynamequeryresourceName
  extends StObject
     with LogEvent {
  
  val name: queryresourceDotretain
  
  val profilerContext: Any
  
  val resourceID: Double
}
object ReadonlynamequeryresourceName {
  
  inline def apply(profilerContext: Any, resourceID: Double): ReadonlynamequeryresourceName = {
    val __obj = js.Dynamic.literal(name = "queryresource.retain", profilerContext = profilerContext.asInstanceOf[js.Any], resourceID = resourceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlynamequeryresourceName]
  }
  
  extension [Self <: ReadonlynamequeryresourceName](x: Self) {
    
    inline def setName(value: queryresourceDotretain): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProfilerContext(value: Any): Self = StObject.set(x, "profilerContext", value.asInstanceOf[js.Any])
    
    inline def setResourceID(value: Double): Self = StObject.set(x, "resourceID", value.asInstanceOf[js.Any])
  }
}
