package typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.anon.FetchTime
  - typingsJapgolly.relayRuntime.anon.Status
  - typingsJapgolly.relayRuntime.anon.`0`
*/
trait OperationAvailability extends StObject
object OperationAvailability {
  
  inline def `0`(): typingsJapgolly.relayRuntime.anon.`0` = {
    val __obj = js.Dynamic.literal(status = "missing")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.`0`]
  }
  
  inline def FetchTime(): typingsJapgolly.relayRuntime.anon.FetchTime = {
    val __obj = js.Dynamic.literal(status = "available")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.FetchTime]
  }
  
  inline def Status(): typingsJapgolly.relayRuntime.anon.Status = {
    val __obj = js.Dynamic.literal(status = "stale")
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.anon.Status]
  }
}
