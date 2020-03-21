package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamespace extends js.Object {
  var namespace: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonNamespace {
  @scala.inline
  def apply(namespace: AnonType, owner: AnonRequired, page: AnonType, per_page: AnonType, repo: AnonRequired): AnonNamespace = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamespace]
  }
}

