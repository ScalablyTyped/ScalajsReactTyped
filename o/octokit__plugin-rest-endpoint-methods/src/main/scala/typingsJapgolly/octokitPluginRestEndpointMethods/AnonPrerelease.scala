package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrerelease extends js.Object {
  var body: AnonType
  var draft: AnonType
  var name: AnonType
  var owner: AnonRequired
  var prerelease: AnonType
  var repo: AnonRequired
  var tag_name: AnonRequired
  var target_commitish: AnonType
}

object AnonPrerelease {
  @scala.inline
  def apply(
    body: AnonType,
    draft: AnonType,
    name: AnonType,
    owner: AnonRequired,
    prerelease: AnonType,
    repo: AnonRequired,
    tag_name: AnonRequired,
    target_commitish: AnonType
  ): AnonPrerelease = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrerelease]
  }
}

