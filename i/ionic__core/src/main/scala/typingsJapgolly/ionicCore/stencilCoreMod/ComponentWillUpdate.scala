package typingsJapgolly.ionicCore.stencilCoreMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentWillUpdate extends js.Object {
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  def componentWillUpdate(): js.Promise[Unit] | Unit
}

object ComponentWillUpdate {
  @scala.inline
  def apply(componentWillUpdate: CallbackTo[js.Promise[Unit] | Unit]): ComponentWillUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentWillUpdate")(componentWillUpdate.toJsFn)
    __obj.asInstanceOf[ComponentWillUpdate]
  }
}

