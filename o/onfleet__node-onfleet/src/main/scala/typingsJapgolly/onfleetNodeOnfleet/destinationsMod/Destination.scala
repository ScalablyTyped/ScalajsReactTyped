package typingsJapgolly.onfleetNodeOnfleet.destinationsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destination extends js.Object {
  def create(destination: CreateDestinationProps): js.Promise[OnfleetDestination]
  def get(id: String): js.Promise[OnfleetDestination]
}

object Destination {
  @scala.inline
  def apply(
    create: CreateDestinationProps => CallbackTo[js.Promise[OnfleetDestination]],
    get: String => CallbackTo[js.Promise[OnfleetDestination]]
  ): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.onfleetNodeOnfleet.destinationsMod.CreateDestinationProps) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.asInstanceOf[Destination]
  }
}

