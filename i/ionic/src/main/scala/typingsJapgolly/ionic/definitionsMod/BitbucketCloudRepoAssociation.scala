package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.bitbucket_cloud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketCloudRepoAssociation
  extends StObject
     with RepoAssociationBase
     with RepoAssociation {
  
  var id: String
  
  var `type`: bitbucket_cloud
}
object BitbucketCloudRepoAssociation {
  
  inline def apply(clone_url: String, full_name: String, html_url: String, id: String): BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_cloud")
    __obj.asInstanceOf[BitbucketCloudRepoAssociation]
  }
  
  extension [Self <: BitbucketCloudRepoAssociation](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: bitbucket_cloud): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
