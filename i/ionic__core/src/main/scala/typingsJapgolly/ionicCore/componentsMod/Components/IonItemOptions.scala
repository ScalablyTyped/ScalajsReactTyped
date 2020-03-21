package typingsJapgolly.ionicCore.componentsMod.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCore.mod.Side
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemOptions extends js.Object {
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: Side
  def fireSwipeEvent(): js.Promise[Unit]
}

object IonItemOptions {
  @scala.inline
  def apply(fireSwipeEvent: CallbackTo[js.Promise[Unit]], side: Side): IonItemOptions = {
    val __obj = js.Dynamic.literal(side = side.asInstanceOf[js.Any])
    __obj.updateDynamic("fireSwipeEvent")(fireSwipeEvent.toJsFn)
    __obj.asInstanceOf[IonItemOptions]
  }
}

