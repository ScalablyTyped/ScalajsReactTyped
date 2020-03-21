package typingsJapgolly.storybookPreact.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorybookStory extends js.Object {
  var name: String
  def render(): js.Any
}

object IStorybookStory {
  @scala.inline
  def apply(name: String, render: CallbackTo[js.Any]): IStorybookStory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[IStorybookStory]
  }
}

