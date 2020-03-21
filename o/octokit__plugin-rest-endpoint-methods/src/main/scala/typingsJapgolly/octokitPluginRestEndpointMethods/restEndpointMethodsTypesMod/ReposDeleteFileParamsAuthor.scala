package typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileParamsAuthor extends js.Object {
  /**
    * The email of the author (or committer) of the commit
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The name of the author (or committer) of the commit
    */
  var name: js.UndefOr[String] = js.undefined
}

object ReposDeleteFileParamsAuthor {
  @scala.inline
  def apply(email: String = null, name: String = null): ReposDeleteFileParamsAuthor = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeleteFileParamsAuthor]
  }
}

