package typingsJapgolly.ractive.mod

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registries[T /* <: Ractive[T] */] extends js.Object {
  var adaptors: Registry[Adaptor]
  var components: Registry[Component]
  var decorators: Registry[Decorator[T]]
  var easings: Registry[Easing]
  var events: Registry[Event_]
  var helpers: Registry[Helper]
  var interpolators: Registry[Interpolator]
  var partials: Registry[Partial]
}

object Registries {
  @scala.inline
  def apply[T /* <: Ractive[T] */](
    adaptors: Registry[Adaptor],
    components: Registry[Component],
    decorators: Registry[Decorator[T]],
    easings: Registry[Easing],
    events: Registry[Event_],
    helpers: Registry[Helper],
    interpolators: Registry[Interpolator],
    partials: Registry[Partial]
  ): Registries[T] = {
    val __obj = js.Dynamic.literal(adaptors = adaptors.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], easings = easings.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], helpers = helpers.asInstanceOf[js.Any], interpolators = interpolators.asInstanceOf[js.Any], partials = partials.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Registries[T]]
  }
}

