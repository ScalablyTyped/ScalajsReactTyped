package typingsJapgolly.reactJsonschemaForm

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: String | Element
  var id: String
}

object AnonDescription {
  @scala.inline
  def apply(description: String | Element, id: String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescription]
  }
}

