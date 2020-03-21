package typingsJapgolly.atom

import typingsJapgolly.atom.atomStrings.separator
import typingsJapgolly.atom.mod.ContextMenuOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends ContextMenuOptions {
  var `type`: separator
}

object AnonType {
  @scala.inline
  def apply(`type`: separator): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

