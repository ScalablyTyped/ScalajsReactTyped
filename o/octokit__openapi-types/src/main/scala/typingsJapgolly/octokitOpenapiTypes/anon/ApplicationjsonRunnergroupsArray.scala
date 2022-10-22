package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunnergroupsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RunnergroupsArray
}
object ApplicationjsonRunnergroupsArray {
  
  inline def apply(applicationSlashjson: RunnergroupsArray): ApplicationjsonRunnergroupsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunnergroupsArray]
  }
  
  extension [Self <: ApplicationjsonRunnergroupsArray](x: Self) {
    
    inline def setApplicationSlashjson(value: RunnergroupsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
