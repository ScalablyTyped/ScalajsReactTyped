package typingsJapgolly.envCi.mod

import typingsJapgolly.envCi.envCiStrings.Appveyor
import typingsJapgolly.envCi.envCiStrings.appveyor_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppveyorEnv
  extends StObject
     with CiEnvBase
     with KnownCiEnv {
  
  var branch: String
  
  var build: String
  
  var buildUrl: String
  
  var commit: String
  
  var isPr: Boolean
  
  var job: String
  
  var jobUrl: String
  
  var name: Appveyor
  
  var pr: js.UndefOr[String] = js.undefined
  
  var prBranch: js.UndefOr[String] = js.undefined
  
  var root: String
  
  var service: appveyor_
  
  var slug: String
  
  var tag: js.UndefOr[String] = js.undefined
}
object AppveyorEnv {
  
  inline def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    root: String,
    slug: String
  ): AppveyorEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "Appveyor", root = root.asInstanceOf[js.Any], service = "appveyor", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppveyorEnv]
  }
  
  extension [Self <: AppveyorEnv](x: Self) {
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUrl(value: String): Self = StObject.set(x, "buildUrl", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setIsPr(value: Boolean): Self = StObject.set(x, "isPr", value.asInstanceOf[js.Any])
    
    inline def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUrl(value: String): Self = StObject.set(x, "jobUrl", value.asInstanceOf[js.Any])
    
    inline def setName(value: Appveyor): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPr(value: String): Self = StObject.set(x, "pr", value.asInstanceOf[js.Any])
    
    inline def setPrBranch(value: String): Self = StObject.set(x, "prBranch", value.asInstanceOf[js.Any])
    
    inline def setPrBranchUndefined: Self = StObject.set(x, "prBranch", js.undefined)
    
    inline def setPrUndefined: Self = StObject.set(x, "pr", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setService(value: appveyor_): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
