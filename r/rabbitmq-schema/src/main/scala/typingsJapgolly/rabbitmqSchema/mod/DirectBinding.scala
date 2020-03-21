package typingsJapgolly.rabbitmqSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectBinding extends Binding {
  @JSName("routingPattern")
  var routingPattern_DirectBinding: String
}

object DirectBinding {
  @scala.inline
  def apply(destination: Exchange | Queue, routingPattern: String, source: Exchange, args: js.Object = null): DirectBinding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], routingPattern = routingPattern.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectBinding]
  }
}

