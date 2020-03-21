package typingsJapgolly.storybookPolymer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryObject extends js.Object {
  var name: String = js.native
  @JSName("render")
  var render_Original: RenderFunction = js.native
  def render(): Renderable | js.Array[Renderable] = js.native
}

