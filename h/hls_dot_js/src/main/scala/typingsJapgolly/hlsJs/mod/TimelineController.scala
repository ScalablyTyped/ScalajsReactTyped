package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Customized text track syncronization controller.
  */
trait TimelineController extends js.Object {
  /**
    * clean-up all used resources
    */
  def destroy(): Unit
}

object TimelineController {
  @scala.inline
  def apply(destroy: Callback): TimelineController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.asInstanceOf[TimelineController]
  }
}

