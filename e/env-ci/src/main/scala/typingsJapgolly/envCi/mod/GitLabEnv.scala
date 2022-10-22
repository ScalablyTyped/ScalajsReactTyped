package typingsJapgolly.envCi.mod

import typingsJapgolly.envCi.envCiStrings.`GitLab CISlashCD`
import typingsJapgolly.envCi.envCiStrings.gitlab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitLabEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var job: String
  
  var jobUrl: String
  
  var name: `GitLab CISlashCD`
  
  var root: String
  
  var service: gitlab
  
  var slug: String
  
  var tag: js.UndefOr[String] = js.undefined
}
object GitLabEnv {
  
  inline def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    job: String,
    jobUrl: String,
    root: String,
    slug: String
  ): GitLabEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "GitLab CI/CD", root = root.asInstanceOf[js.Any], service = "gitlab", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLabEnv]
  }
  
  extension [Self <: GitLabEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUrl(value: String): Self = StObject.set(x, "jobUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: `GitLab CISlashCD`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: gitlab): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
