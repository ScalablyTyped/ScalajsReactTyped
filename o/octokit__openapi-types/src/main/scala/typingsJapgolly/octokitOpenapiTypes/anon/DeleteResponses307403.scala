package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses307403 extends StObject {
  
  /**
    * Deleting a repository requires admin access. If OAuth is used, the `delete_repo` scope is required.
    *
    * If an organization owner has configured the organization to prevent members from deleting organization-owned
    * repositories, you will get a `403 Forbidden` response.
    */
  var delete: Responses307403
  
  /** The `parent` and `source` objects are present when the repository is a fork. `parent` is the repository this repository was forked from, `source` is the ultimate source for the network. */
  var get: Parameters395
  
  /** **Note**: To edit a repository's topics, use the [Replace all repository topics](https://docs.github.com/rest/reference/repos#replace-all-repository-topics) endpoint. */
  var patch: Responses200307403
}
object DeleteResponses307403 {
  
  inline def apply(delete: Responses307403, get: Parameters395, patch: Responses200307403): DeleteResponses307403 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses307403]
  }
  
  extension [Self <: DeleteResponses307403](x: Self) {
    
    inline def setDelete(value: Responses307403): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: Parameters395): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200307403): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
