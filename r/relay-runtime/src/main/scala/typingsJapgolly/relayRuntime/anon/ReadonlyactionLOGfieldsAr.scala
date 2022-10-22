package typingsJapgolly.relayRuntime.anon

import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.FieldLocation
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.MissingRequiredFields
import typingsJapgolly.relayRuntime.relayRuntimeStrings.LOG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  action :'LOG',   fields :std.Array<relay-runtime.relay-runtime/lib/store/RelayStoreTypes.FieldLocation>}> */
trait ReadonlyactionLOGfieldsAr
  extends StObject
     with MissingRequiredFields {
  
  val action: LOG
  
  val fields: js.Array[FieldLocation]
}
object ReadonlyactionLOGfieldsAr {
  
  inline def apply(fields: js.Array[FieldLocation]): ReadonlyactionLOGfieldsAr = {
    val __obj = js.Dynamic.literal(action = "LOG", fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyactionLOGfieldsAr]
  }
  
  extension [Self <: ReadonlyactionLOGfieldsAr](x: Self) {
    
    inline def setAction(value: LOG): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[FieldLocation]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldLocation*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
