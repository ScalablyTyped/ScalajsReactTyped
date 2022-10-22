package typingsJapgolly.awsSdk.clientsS3Mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordsEvent extends StObject {
  
  /**
    * The byte array of partial, one or more result records.
    */
  var Payload: js.UndefOr[Buffer] = js.undefined
}
object RecordsEvent {
  
  inline def apply(): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordsEvent]
  }
  
  extension [Self <: RecordsEvent](x: Self) {
    
    inline def setPayload(value: Buffer): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
  }
}
