package typingsJapgolly.imagemapster.mod._Global_.ImageMapster

import typingsJapgolly.imagemapster.imagemapsterStrings.highlight
import typingsJapgolly.imagemapster.imagemapsterStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnStateChangeData extends js.Object {
  /**
    * map key
    */
  var key: String
  /**
    * indicating the current state (following the event)
    */
  var selected: Boolean
  var state: highlight | select
}

object OnStateChangeData {
  @scala.inline
  def apply(key: String, selected: Boolean, state: highlight | select): OnStateChangeData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnStateChangeData]
  }
}

