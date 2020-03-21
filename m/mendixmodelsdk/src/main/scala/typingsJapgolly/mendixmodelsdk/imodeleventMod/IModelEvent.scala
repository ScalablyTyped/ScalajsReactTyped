package typingsJapgolly.mendixmodelsdk.imodeleventMod

import typingsJapgolly.mendixmodelsdk.deltasDeltasMod.Delta
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.deltas
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.fileChanges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.imodeleventMod.IFileEvent
  - typingsJapgolly.mendixmodelsdk.imodeleventMod.IDeltaEvent
*/
trait IModelEvent extends js.Object

object IModelEvent {
  @scala.inline
  def IFileEvent(files: js.Array[String], id: Double, `type`: fileChanges): IModelEvent = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelEvent]
  }
  @scala.inline
  def IDeltaEvent(deltas: js.Array[Delta], id: Double, `type`: deltas): IModelEvent = {
    val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelEvent]
  }
}

