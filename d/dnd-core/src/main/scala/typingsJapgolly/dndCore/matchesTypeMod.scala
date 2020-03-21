package typingsJapgolly.dndCore

import typingsJapgolly.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/utils/matchesType", JSImport.Namespace)
@js.native
object matchesTypeMod extends js.Object {
  def default(): Boolean = js.native
  def default(targetType: js.Array[Identifier]): Boolean = js.native
  def default(targetType: js.Array[Identifier], draggedItemType: Identifier): Boolean = js.native
  def default(targetType: Null, draggedItemType: Identifier): Boolean = js.native
  def default(targetType: Identifier): Boolean = js.native
  def default(targetType: Identifier, draggedItemType: Identifier): Boolean = js.native
}

