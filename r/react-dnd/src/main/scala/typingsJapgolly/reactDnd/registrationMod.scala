package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.dndCore.interfacesMod.DragSource
import typingsJapgolly.dndCore.interfacesMod.DropTarget
import typingsJapgolly.dndCore.interfacesMod.Identifier
import typingsJapgolly.dndCore.interfacesMod.SourceType
import typingsJapgolly.dndCore.interfacesMod.TargetType
import typingsJapgolly.dndCore.interfacesMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/registration", JSImport.Namespace)
@js.native
object registrationMod extends js.Object {
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
}

