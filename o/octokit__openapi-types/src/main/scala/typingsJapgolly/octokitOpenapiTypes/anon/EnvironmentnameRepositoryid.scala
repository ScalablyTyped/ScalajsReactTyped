package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentnameRepositoryid extends StObject {
  
  /** The name of the environment. */
  var environment_name: String
  
  /** The unique identifier of the repository. */
  var repository_id: Double
}
object EnvironmentnameRepositoryid {
  
  inline def apply(environment_name: String, repository_id: Double): EnvironmentnameRepositoryid = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentnameRepositoryid]
  }
  
  extension [Self <: EnvironmentnameRepositoryid](x: Self) {
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
