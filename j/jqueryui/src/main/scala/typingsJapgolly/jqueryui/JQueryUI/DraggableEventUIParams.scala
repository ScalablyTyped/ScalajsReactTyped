package typingsJapgolly.jqueryui.JQueryUI

import typingsJapgolly.jqueryui.Anon_Left
import typingsJapgolly.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Draggable //////////////////////////////////////////////////
trait DraggableEventUIParams extends js.Object {
  var helper: JQuery
  var offset: Anon_Left
  var position: Anon_Left
}

object DraggableEventUIParams {
  @scala.inline
  def apply(helper: JQuery, offset: Anon_Left, position: Anon_Left): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableEventUIParams]
  }
}

