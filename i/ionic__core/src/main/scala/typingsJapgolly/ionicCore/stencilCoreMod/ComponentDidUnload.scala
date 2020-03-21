package typingsJapgolly.ionicCore.stencilCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidUnload extends js.Object {
  /**
    * The component did unload and the element
    * will be destroyed.
    */
  def componentDidUnload(): Unit
}

object ComponentDidUnload {
  @scala.inline
  def apply(componentDidUnload: Callback): ComponentDidUnload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentDidUnload")(componentDidUnload.toJsFn)
    __obj.asInstanceOf[ComponentDidUnload]
  }
}

