package typingsJapgolly.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Scene")
@js.native
class Scene () extends js.Object {
  def this(options: SceneOptions) = this()
  def defaults(): SceneOptions = js.native
  def flushCache(): Unit = js.native
  def render(): js.Array[Transformable] = js.native
}

