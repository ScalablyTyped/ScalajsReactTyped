package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAdvancedsecurityenabledfornewrepositories extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Advancedsecurityenabledfornewrepositories
}
object ApplicationjsonAdvancedsecurityenabledfornewrepositories {
  
  inline def apply(applicationSlashjson: Advancedsecurityenabledfornewrepositories): ApplicationjsonAdvancedsecurityenabledfornewrepositories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAdvancedsecurityenabledfornewrepositories]
  }
  
  extension [Self <: ApplicationjsonAdvancedsecurityenabledfornewrepositories](x: Self) {
    
    inline def setApplicationSlashjson(value: Advancedsecurityenabledfornewrepositories): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
