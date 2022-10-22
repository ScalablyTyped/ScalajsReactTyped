package typingsJapgolly.envCi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.envCi.mod.AppveyorEnv
  - typingsJapgolly.envCi.mod.BambooEnv
  - typingsJapgolly.envCi.mod.BitbucketEnv
  - typingsJapgolly.envCi.mod.BitriseEnv
  - typingsJapgolly.envCi.mod.BuddyEnv
  - typingsJapgolly.envCi.mod.BuildkiteEnv
  - typingsJapgolly.envCi.mod.CircleCiEnv
  - typingsJapgolly.envCi.mod.CirrusEnv
  - typingsJapgolly.envCi.mod.CodeBuildEnv
  - typingsJapgolly.envCi.mod.CodefreshEnv
  - typingsJapgolly.envCi.mod.CodeshipEnv
  - typingsJapgolly.envCi.mod.DroneEnv
  - typingsJapgolly.envCi.mod.GitLabEnv
  - typingsJapgolly.envCi.mod.JenkinsEnv
  - typingsJapgolly.envCi.mod.SailEnv
  - typingsJapgolly.envCi.mod.SemaphoreEnv
  - typingsJapgolly.envCi.mod.ShippableEnv
  - typingsJapgolly.envCi.mod.TeamCityEnv
  - typingsJapgolly.envCi.mod.TravisEnv
  - typingsJapgolly.envCi.mod.VstsEnv
  - typingsJapgolly.envCi.mod.WerckerEnv
*/
trait KnownCiEnv
  extends StObject
     with CiEnv
object KnownCiEnv {
  
  inline def AppveyorEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.AppveyorEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "Appveyor", root = root.asInstanceOf[js.Any], service = "appveyor", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.AppveyorEnv]
  }
  
  inline def BambooEnv(branch: String, build: String, buildUrl: String, commit: String, job: String, root: String): typingsJapgolly.envCi.mod.BambooEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, job = job.asInstanceOf[js.Any], name = "Bamboo", root = root.asInstanceOf[js.Any], service = "bamboo")
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.BambooEnv]
  }
  
  inline def BitbucketEnv(branch: String, build: String, buildUrl: String, commit: String, root: String, slug: String): typingsJapgolly.envCi.mod.BitbucketEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "Bitbucket Pipelines", root = root.asInstanceOf[js.Any], service = "bitbucket", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.BitbucketEnv]
  }
  
  inline def BitriseEnv(branch: String, build: String, buildUrl: String, commit: String, isPr: Boolean, slug: String): typingsJapgolly.envCi.mod.BitriseEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Bitrise", service = "bitrise", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.BitriseEnv]
  }
  
  inline def BuddyEnv(build: String, buildUrl: String, commit: String, isPr: Boolean, slug: String): typingsJapgolly.envCi.mod.BuddyEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Buddy", service = "buddy", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.BuddyEnv]
  }
  
  inline def BuildkiteEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.BuildkiteEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Buildkite", root = root.asInstanceOf[js.Any], service = "buildkite", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.BuildkiteEnv]
  }
  
  inline def CircleCiEnv(build: String, buildUrl: String, commit: String, isPr: Boolean, job: String, slug: String): typingsJapgolly.envCi.mod.CircleCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = "CircleCI", service = "circleci", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.CircleCiEnv]
  }
  
  inline def CirrusEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.CirrusEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "Cirrus CI", root = root.asInstanceOf[js.Any], service = "cirrus", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.CirrusEnv]
  }
  
  inline def CodeBuildEnv(branch: String, build: String, buildUrl: String, commit: String, root: String): typingsJapgolly.envCi.mod.CodeBuildEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "AWS CodeBuild", root = root.asInstanceOf[js.Any], service = "codebuild")
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.CodeBuildEnv]
  }
  
  inline def CodefreshEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.CodefreshEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Codefresh", root = root.asInstanceOf[js.Any], service = "codefresh", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.CodefreshEnv]
  }
  
  inline def CodeshipEnv(branch: String, build: String, buildUrl: String, commit: String, slug: String): typingsJapgolly.envCi.mod.CodeshipEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "Codeship", service = "codeship", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.CodeshipEnv]
  }
  
  inline def DroneEnv(branch: String, build: String, commit: String, isPr: Boolean, job: String, slug: String): typingsJapgolly.envCi.mod.DroneEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = "Drone", service = "drone", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.DroneEnv]
  }
  
  inline def GitLabEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    job: String,
    jobUrl: String,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.GitLabEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "GitLab CI/CD", root = root.asInstanceOf[js.Any], service = "gitlab", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.GitLabEnv]
  }
  
  inline def JenkinsEnv(branch: String, build: String, buildUrl: String, commit: String, isPr: Boolean, root: String): typingsJapgolly.envCi.mod.JenkinsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Jenkins", root = root.asInstanceOf[js.Any], service = "jenkins")
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.JenkinsEnv]
  }
  
  inline def SailEnv(commit: String, isPr: Boolean, root: String, slug: String): typingsJapgolly.envCi.mod.SailEnv = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Sail CI", root = root.asInstanceOf[js.Any], service = "sail", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.SailEnv]
  }
  
  inline def SemaphoreEnv(build: String, commit: String, isPr: Boolean, root: String, slug: String): typingsJapgolly.envCi.mod.SemaphoreEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Semaphore", root = root.asInstanceOf[js.Any], service = "semaphore", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.SemaphoreEnv]
  }
  
  inline def ShippableEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.ShippableEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = "Shippable", root = root.asInstanceOf[js.Any], service = "shippable", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.ShippableEnv]
  }
  
  inline def TeamCityEnv(build: String, commit: String, slug: String): typingsJapgolly.envCi.mod.TeamCityEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "TeamCity", service = "teamcity", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.TeamCityEnv]
  }
  
  inline def TravisEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    prBranch: String,
    root: String,
    slug: String
  ): typingsJapgolly.envCi.mod.TravisEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = "Travis CI", prBranch = prBranch.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = "travis", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.TravisEnv]
  }
  
  inline def VstsEnv(branch: String, build: String, commit: String, isPr: Boolean, root: String): typingsJapgolly.envCi.mod.VstsEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, isPr = isPr.asInstanceOf[js.Any], name = "Visual Studio Team Services", root = root.asInstanceOf[js.Any], service = "vsts")
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.VstsEnv]
  }
  
  inline def WerckerEnv(branch: String, build: String, buildUrl: String, commit: String, root: String, slug: String): typingsJapgolly.envCi.mod.WerckerEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = true, name = "Wercker", root = root.asInstanceOf[js.Any], service = "wercker", slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.envCi.mod.WerckerEnv]
  }
}
