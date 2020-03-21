package typingsJapgolly.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableDimension extends js.Object {
  // relative to the viewport when the drag started
  var client: BoxModel
  var descriptor: DraggableDescriptor
  // how much displacement the draggable causes
  // this is the size of the marginBox
  var displaceBy: Position
  // relative to the whole page
  var page: BoxModel
  // the placeholder for the draggable
  var placeholder: Placeholder
}

object DraggableDimension {
  @scala.inline
  def apply(
    client: BoxModel,
    descriptor: DraggableDescriptor,
    displaceBy: Position,
    page: BoxModel,
    placeholder: Placeholder
  ): DraggableDimension = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], displaceBy = displaceBy.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableDimension]
  }
}

