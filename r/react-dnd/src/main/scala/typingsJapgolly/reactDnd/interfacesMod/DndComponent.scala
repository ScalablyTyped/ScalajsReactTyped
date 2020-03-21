package typingsJapgolly.reactDnd.interfacesMod

import typingsJapgolly.dndCore.interfacesMod.Identifier
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DndComponent[Props]
  extends Component[Props, js.Object, js.Any] {
  def getDecoratedComponentInstance(): (japgolly.scalajs.react.raw.React.Component[Props with js.Object, js.Object]) | Null = js.native
  def getHandlerId(): Identifier = js.native
}

