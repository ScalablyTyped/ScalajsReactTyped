package typingsJapgolly.reactTestRenderer.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTestRenderer extends js.Object {
  var root: ReactTestInstance = js.native
  def getInstance(): Null | ReactTestInstance = js.native
  def toJSON(): Null | ReactTestRendererJSON = js.native
  def toTree(): Null | ReactTestRendererTree = js.native
  def unmount(): Unit = js.native
  def unmount(nextElement: Element): Unit = js.native
  def update(nextElement: Element): Unit = js.native
}

