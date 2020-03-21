package typingsJapgolly.storybookAddonStoryshots

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRender extends js.Object {
  def render(): js.Any
}

object AnonRender {
  @scala.inline
  def apply(render: CallbackTo[js.Any]): AnonRender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[AnonRender]
  }
}

