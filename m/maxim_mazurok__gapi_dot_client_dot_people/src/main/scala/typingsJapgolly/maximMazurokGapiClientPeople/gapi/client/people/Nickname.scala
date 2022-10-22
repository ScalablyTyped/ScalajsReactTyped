package typingsJapgolly.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nickname extends StObject {
  
  /** Metadata about the nickname. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The type of the nickname. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The nickname. */
  var value: js.UndefOr[String] = js.undefined
}
object Nickname {
  
  inline def apply(): Nickname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nickname]
  }
  
  extension [Self <: Nickname](x: Self) {
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
