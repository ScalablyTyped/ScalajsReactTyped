package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPage extends js.Object {
  var name: AnonRequired
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonPage {
  @scala.inline
  def apply(name: AnonRequired, owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired): AnonPage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPage]
  }
}

