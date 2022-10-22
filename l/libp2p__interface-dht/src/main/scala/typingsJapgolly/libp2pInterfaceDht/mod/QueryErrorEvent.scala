package typingsJapgolly.libp2pInterfaceDht.mod

import typingsJapgolly.libp2pInterfaceDht.libp2pInterfaceDhtStrings.QUERY_ERROR
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryErrorEvent
  extends StObject
     with QueryEvent {
  
  var error: js.Error
  
  var from: PeerId
  
  var name: QUERY_ERROR
  
  var `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.QUERY_ERROR
}
object QueryErrorEvent {
  
  inline def apply(
    error: js.Error,
    from: PeerId,
    `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.QUERY_ERROR
  ): QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryErrorEvent]
  }
  
  extension [Self <: QueryErrorEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setName(value: QUERY_ERROR): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.QUERY_ERROR): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
