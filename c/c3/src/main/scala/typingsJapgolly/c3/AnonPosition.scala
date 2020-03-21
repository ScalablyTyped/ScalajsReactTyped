package typingsJapgolly.c3

import typingsJapgolly.c3.c3Strings.`inner-bottom`
import typingsJapgolly.c3.c3Strings.`inner-center`
import typingsJapgolly.c3.c3Strings.`inner-left`
import typingsJapgolly.c3.c3Strings.`inner-middle`
import typingsJapgolly.c3.c3Strings.`inner-right`
import typingsJapgolly.c3.c3Strings.`inner-top`
import typingsJapgolly.c3.c3Strings.`outer-bottom`
import typingsJapgolly.c3.c3Strings.`outer-center`
import typingsJapgolly.c3.c3Strings.`outer-left`
import typingsJapgolly.c3.c3Strings.`outer-middle`
import typingsJapgolly.c3.c3Strings.`outer-right`
import typingsJapgolly.c3.c3Strings.`outer-top`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  /** The position of the label. */
  var position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left` | `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`
  /** The label text to show. */
  var text: String
}

object AnonPosition {
  @scala.inline
  def apply(
    position: `inner-right` | `inner-center` | `inner-left` | `outer-right` | `outer-center` | `outer-left` | `inner-top` | `inner-middle` | `inner-bottom` | `outer-top` | `outer-middle` | `outer-bottom`,
    text: String
  ): AnonPosition = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}

