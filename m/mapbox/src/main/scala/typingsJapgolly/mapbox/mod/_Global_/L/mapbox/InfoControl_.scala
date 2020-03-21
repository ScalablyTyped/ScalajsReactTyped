package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait InfoControl_ extends js.Object {
  /**
  			 * Adds an info string to infoControl.
  			 */
  def addInfo(info: String): js.Any
  def onAdd(map: Map_): js.Any
  def onRemove(map: Map_): js.Any
  /**
  			 * Removes an info string from infoControl
  			 */
  def removeInfo(info: String): js.Any
}

object InfoControl_ {
  @scala.inline
  def apply(
    addInfo: String => CallbackTo[js.Any],
    onAdd: Map_ => CallbackTo[js.Any],
    onRemove: Map_ => CallbackTo[js.Any],
    removeInfo: String => CallbackTo[js.Any]
  ): InfoControl_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addInfo")(js.Any.fromFunction1((t0: java.lang.String) => addInfo(t0).runNow()))
    __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onAdd(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onRemove(t0).runNow()))
    __obj.updateDynamic("removeInfo")(js.Any.fromFunction1((t0: java.lang.String) => removeInfo(t0).runNow()))
    __obj.asInstanceOf[InfoControl_]
  }
}

