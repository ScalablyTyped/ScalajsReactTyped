package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.bitbucket_server
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerRepoAssociation
  extends StObject
     with RepoAssociationBase
     with RepoAssociation {
  
  var id: Double
  
  var `type`: bitbucket_server
}
object BitbucketServerRepoAssociation {
  
  inline def apply(clone_url: String, full_name: String, html_url: String, id: Double): BitbucketServerRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_server")
    __obj.asInstanceOf[BitbucketServerRepoAssociation]
  }
  
  extension [Self <: BitbucketServerRepoAssociation](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: bitbucket_server): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
