package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAssigneeAssignees extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AssigneeAssignees
}
object ApplicationjsonAssigneeAssignees {
  
  inline def apply(applicationSlashjson: AssigneeAssignees): ApplicationjsonAssigneeAssignees = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAssigneeAssignees]
  }
  
  extension [Self <: ApplicationjsonAssigneeAssignees](x: Self) {
    
    inline def setApplicationSlashjson(value: AssigneeAssignees): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
