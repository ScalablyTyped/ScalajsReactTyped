package typingsJapgolly.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPositionService extends js.Object {
  /**
    * Provides a read-only equivalent of jQuery's offset function.
    */
  def offset(element: JQuery): IPositionCoordinates
  /**
    * Provides a read-only equivalent of jQuery's position function.
    */
  def position(element: JQuery): IPositionCoordinates
}

object IPositionService {
  @scala.inline
  def apply(
    offset: JQuery => CallbackTo[IPositionCoordinates],
    position: JQuery => CallbackTo[IPositionCoordinates]
  ): IPositionService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(js.Any.fromFunction1((t0: typingsJapgolly.angular.JQuery) => offset(t0).runNow()))
    __obj.updateDynamic("position")(js.Any.fromFunction1((t0: typingsJapgolly.angular.JQuery) => position(t0).runNow()))
    __obj.asInstanceOf[IPositionService]
  }
}

