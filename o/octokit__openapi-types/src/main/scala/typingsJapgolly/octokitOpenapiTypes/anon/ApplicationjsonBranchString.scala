package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBranchString extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BranchString
}
object ApplicationjsonBranchString {
  
  inline def apply(applicationSlashjson: BranchString): ApplicationjsonBranchString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBranchString]
  }
  
  extension [Self <: ApplicationjsonBranchString](x: Self) {
    
    inline def setApplicationSlashjson(value: BranchString): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
