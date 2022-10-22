package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePresetRequest extends StObject {
  
  /**
    * The name of the preset to be deleted.
    */
  var Name: string
}
object DeletePresetRequest {
  
  inline def apply(Name: string): DeletePresetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePresetRequest]
  }
  
  extension [Self <: DeletePresetRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
