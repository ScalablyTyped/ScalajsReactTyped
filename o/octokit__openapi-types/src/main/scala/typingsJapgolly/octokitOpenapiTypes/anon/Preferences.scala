package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Preferences extends StObject {
  
  var preferences: Autotriggerchecks
  
  var repository: Blobsurl
}
object Preferences {
  
  inline def apply(preferences: Autotriggerchecks, repository: Blobsurl): Preferences = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preferences]
  }
  
  extension [Self <: Preferences](x: Self) {
    
    inline def setPreferences(value: Autotriggerchecks): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Blobsurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
