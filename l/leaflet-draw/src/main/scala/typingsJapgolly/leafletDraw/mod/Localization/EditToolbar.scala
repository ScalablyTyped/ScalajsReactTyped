package typingsJapgolly.leafletDraw.mod.Localization

import typingsJapgolly.leafletDraw.AnonCancel
import typingsJapgolly.leafletDraw.AnonEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditToolbar extends js.Object {
  var actions: AnonCancel
  var buttons: AnonEdit
}

object EditToolbar {
  @scala.inline
  def apply(actions: AnonCancel, buttons: AnonEdit): EditToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditToolbar]
  }
}

