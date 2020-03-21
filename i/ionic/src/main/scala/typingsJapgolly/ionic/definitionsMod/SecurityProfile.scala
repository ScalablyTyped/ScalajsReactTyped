package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.AnonAndroid
import typingsJapgolly.ionic.ionicStrings.development
import typingsJapgolly.ionic.ionicStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityProfile extends js.Object {
  var created: String
  var credentials: AnonAndroid
  var name: String
  var tag: String
  var `type`: development | production
}

object SecurityProfile {
  @scala.inline
  def apply(
    created: String,
    credentials: AnonAndroid,
    name: String,
    tag: String,
    `type`: development | production
  ): SecurityProfile = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfile]
  }
}

