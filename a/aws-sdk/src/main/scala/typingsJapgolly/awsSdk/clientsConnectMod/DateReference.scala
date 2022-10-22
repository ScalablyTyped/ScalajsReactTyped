package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateReference extends StObject {
  
  /**
    * Identifier of the date reference.
    */
  var Name: js.UndefOr[ReferenceKey] = js.undefined
  
  /**
    * A valid date.
    */
  var Value: js.UndefOr[ReferenceValue] = js.undefined
}
object DateReference {
  
  inline def apply(): DateReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateReference]
  }
  
  extension [Self <: DateReference](x: Self) {
    
    inline def setName(value: ReferenceKey): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: ReferenceValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
