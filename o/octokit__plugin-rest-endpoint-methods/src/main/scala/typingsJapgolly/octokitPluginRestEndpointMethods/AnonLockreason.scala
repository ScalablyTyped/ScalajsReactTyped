package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLockreason extends js.Object {
  var issue_number: AnonRequired
  var lock_reason: AnonEnum
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonLockreason {
  @scala.inline
  def apply(
    issue_number: AnonRequired,
    lock_reason: AnonEnum,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonLockreason = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], lock_reason = lock_reason.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLockreason]
  }
}

