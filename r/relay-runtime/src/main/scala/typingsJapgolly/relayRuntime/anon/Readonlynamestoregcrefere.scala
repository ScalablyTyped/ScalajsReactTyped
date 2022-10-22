package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.DataIDSet
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.LogEvent
import typingsJapgolly.relayRuntime.relayRuntimeStrings.storeDotgc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  name :'store.gc',   references :relay-runtime.relay-runtime/lib/store/RelayStoreTypes.DataIDSet}> */
trait Readonlynamestoregcrefere
  extends StObject
     with LogEvent {
  
  val name: storeDotgc
  
  val references: DataIDSet
}
object Readonlynamestoregcrefere {
  
  inline def apply(references: DataIDSet): Readonlynamestoregcrefere = {
    val __obj = js.Dynamic.literal(name = "store.gc", references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readonlynamestoregcrefere]
  }
  
  extension [Self <: Readonlynamestoregcrefere](x: Self) {
    
    inline def setName(value: storeDotgc): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: DataIDSet): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
  }
}
