package typingsJapgolly.reactDraggableList.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableList[I, C, T /* <: Component[(Partial[TemplateProps[I, C]]) with js.Object, js.Object] */]
  extends typingsJapgolly.react.mod.Component[Props[I, C, T], js.Object, js.Any] {
  def getItemInstance(key: String): T = js.native
}

