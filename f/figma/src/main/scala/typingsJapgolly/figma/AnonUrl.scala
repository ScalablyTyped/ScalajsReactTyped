package typingsJapgolly.figma

import typingsJapgolly.figma.figmaStrings.URL
import typingsJapgolly.figma.mod._Global_.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUrl extends Action {
  val `type`: URL
  var url: String
}

object AnonUrl {
  @scala.inline
  def apply(`type`: URL, url: String): AnonUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUrl]
  }
}

