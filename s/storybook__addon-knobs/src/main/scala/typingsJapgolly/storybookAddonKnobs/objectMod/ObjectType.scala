package typingsJapgolly.storybookAddonKnobs.objectMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectType[T]
  extends Component[ObjectTypeProps[T], js.Object, js.Any] {
  @JSName("state")
  var state_ObjectType: ObjectTypeState[T] = js.native
  def handleChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
}

