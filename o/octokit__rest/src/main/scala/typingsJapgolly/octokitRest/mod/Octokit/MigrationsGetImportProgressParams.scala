package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetImportProgressParams extends js.Object {
  var owner: String
  var repo: String
}

object MigrationsGetImportProgressParams {
  @scala.inline
  def apply(owner: String, repo: String): MigrationsGetImportProgressParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetImportProgressParams]
  }
}

