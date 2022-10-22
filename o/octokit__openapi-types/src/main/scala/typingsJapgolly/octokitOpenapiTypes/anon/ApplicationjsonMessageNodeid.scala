package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMessageNodeid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: MessageNodeid
}
object ApplicationjsonMessageNodeid {
  
  inline def apply(applicationSlashjson: MessageNodeid): ApplicationjsonMessageNodeid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMessageNodeid]
  }
  
  extension [Self <: ApplicationjsonMessageNodeid](x: Self) {
    
    inline def setApplicationSlashjson(value: MessageNodeid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
