package typingsJapgolly.ionicReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicReact.createControllerComponentMod.OverlayBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */] extends js.Object {
  def create(options: OptionsType): js.Promise[OverlayType]
}

object AnonCreate {
  @scala.inline
  def apply[OptionsType /* <: js.Object */, OverlayType /* <: OverlayBase */](create: OptionsType => CallbackTo[js.Promise[OverlayType]]): AnonCreate[OptionsType, OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: OptionsType) => create(t0).runNow()))
    __obj.asInstanceOf[AnonCreate[OptionsType, OverlayType]]
  }
}

