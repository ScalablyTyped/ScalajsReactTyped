package typingsJapgolly.envCi.mod

import typingsJapgolly.envCi.envCiBooleans.`true`
import typingsJapgolly.envCi.envCiStrings.`AWS CodeBuild`
import typingsJapgolly.envCi.envCiStrings.codebuild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeBuildEnv
  extends KnownCiEnv
     with CiEnvBase {
  var branch: String
  var build: String
  var buildUrl: String
  var commit: String
  var name: `AWS CodeBuild`
  var root: String
  var service: codebuild
}

object CodeBuildEnv {
  @scala.inline
  def apply(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `AWS CodeBuild`,
    root: String,
    service: codebuild
  ): CodeBuildEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeBuildEnv]
  }
}

