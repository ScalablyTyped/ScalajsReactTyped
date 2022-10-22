package typingsJapgolly.envCi.mod

import typingsJapgolly.envCi.envCiStrings.`Bitbucket Pipelines`
import typingsJapgolly.envCi.envCiStrings.bitbucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var name: `Bitbucket Pipelines`
  
  var root: String
  
  var service: bitbucket
  
  var slug: String
  
  var tag: js.UndefOr[String] = js.undefined
}
object BitbucketEnv {
  
  inline def apply(branch: String, build: String, buildUrl: String, commit: String, root: String, slug: String): BitbucketEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "Bitbucket Pipelines", root = root.asInstanceOf[js.Any], service = "bitbucket", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitbucketEnv]
  }
  
  extension [Self <: BitbucketEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setName(value: `Bitbucket Pipelines`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: bitbucket): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
