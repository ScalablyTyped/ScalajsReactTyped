package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileParamsAuthor extends js.Object {
  var email: String
  var name: String
}

object ReposCreateOrUpdateFileParamsAuthor {
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileParamsAuthor]
  }
}

