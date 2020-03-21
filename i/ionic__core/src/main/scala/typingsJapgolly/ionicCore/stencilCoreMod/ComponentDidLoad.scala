package typingsJapgolly.ionicCore.stencilCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidLoad extends js.Object {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  def componentDidLoad(): Unit
}

object ComponentDidLoad {
  @scala.inline
  def apply(componentDidLoad: Callback): ComponentDidLoad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("componentDidLoad")(componentDidLoad.toJsFn)
    __obj.asInstanceOf[ComponentDidLoad]
  }
}

