package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseHead_ extends StObject {
  
  var base: String
  
  var head: String
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: String
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: String
}
object BaseHead_ {
  
  inline def apply(base: String, head: String, owner: String, repo: String): BaseHead_ = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseHead_]
  }
  
  extension [Self <: BaseHead_](x: Self) {
    
    inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
