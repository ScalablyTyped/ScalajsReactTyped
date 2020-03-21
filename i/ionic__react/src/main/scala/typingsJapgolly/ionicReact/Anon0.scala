package typingsJapgolly.ionicReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicReact.createOverlayComponentMod.OverlayElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[OverlayType /* <: OverlayElement */] extends js.Object {
  def create(options: js.Any): js.Promise[OverlayType]
}

object Anon0 {
  @scala.inline
  def apply[OverlayType /* <: OverlayElement */](create: js.Any => CallbackTo[js.Promise[OverlayType]]): Anon0[OverlayType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: js.Any) => create(t0).runNow()))
    __obj.asInstanceOf[Anon0[OverlayType]]
  }
}

