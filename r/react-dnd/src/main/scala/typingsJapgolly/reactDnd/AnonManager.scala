package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.interfacesMod.DragDropManager
import typingsJapgolly.reactDnd.dndProviderMod.DndProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManager
  extends DndProviderProps[js.Any, js.Any] {
  var manager: DragDropManager
}

object AnonManager {
  @scala.inline
  def apply(manager: DragDropManager): AnonManager = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonManager]
  }
}

