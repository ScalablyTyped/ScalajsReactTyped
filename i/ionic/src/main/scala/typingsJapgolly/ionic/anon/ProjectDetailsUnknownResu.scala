package typingsJapgolly.ionic.anon

import typingsJapgolly.ionic.definitionsMod.ProjectType
import typingsJapgolly.ionic.ionicStrings.unknown
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsError
import typingsJapgolly.ionic.libProjectMod.ProjectDetailsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ionic.ionic/lib/project.ProjectDetailsUnknownResult & { readonly configPath :string} */
trait ProjectDetailsUnknownResu
  extends StObject
     with ProjectDetailsResult {
  
  val configPath: String
  
  val context: unknown
  
  val errors: js.Array[ProjectDetailsError]
  
  val `type`: js.UndefOr[ProjectType] = js.undefined
}
object ProjectDetailsUnknownResu {
  
  inline def apply(configPath: String, errors: js.Array[ProjectDetailsError]): ProjectDetailsUnknownResu = {
    val __obj = js.Dynamic.literal(configPath = configPath.asInstanceOf[js.Any], context = "unknown", errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsUnknownResu]
  }
  
  extension [Self <: ProjectDetailsUnknownResu](x: Self) {
    
    inline def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    inline def setContext(value: unknown): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[ProjectDetailsError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ProjectDetailsError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setType(value: ProjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
