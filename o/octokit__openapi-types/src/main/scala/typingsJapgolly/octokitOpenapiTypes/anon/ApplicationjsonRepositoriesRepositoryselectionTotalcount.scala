package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositoriesRepositoryselectionTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositoriesRepositoryselectionTotalcount
}
object ApplicationjsonRepositoriesRepositoryselectionTotalcount {
  
  inline def apply(applicationSlashjson: RepositoriesRepositoryselectionTotalcount): ApplicationjsonRepositoriesRepositoryselectionTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositoriesRepositoryselectionTotalcount]
  }
  
  extension [Self <: ApplicationjsonRepositoriesRepositoryselectionTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: RepositoriesRepositoryselectionTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
