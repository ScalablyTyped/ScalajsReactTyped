package typingsJapgolly.webcola.gridrouterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webcola.rectangleMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeAccessor[Node] extends js.Object {
  def getBounds(v: Node): Rectangle
  def getChildren(v: Node): js.Array[Double]
}

object NodeAccessor {
  @scala.inline
  def apply[Node](getBounds: Node => CallbackTo[Rectangle], getChildren: Node => CallbackTo[js.Array[Double]]): NodeAccessor[Node] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBounds")(js.Any.fromFunction1((t0: Node) => getBounds(t0).runNow()))
    __obj.updateDynamic("getChildren")(js.Any.fromFunction1((t0: Node) => getChildren(t0).runNow()))
    __obj.asInstanceOf[NodeAccessor[Node]]
  }
}

