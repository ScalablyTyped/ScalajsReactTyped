package typingsJapgolly.atStorybookReact.atStorybookReactMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryObject extends js.Object {
  var name: String
  var render: RenderFunction
}

object StoryObject {
  @scala.inline
  def apply(name: String, render: CallbackTo[Renderable | js.Array[Renderable]]): StoryObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(render.toJsFn)
    __obj.asInstanceOf[StoryObject]
  }
}

