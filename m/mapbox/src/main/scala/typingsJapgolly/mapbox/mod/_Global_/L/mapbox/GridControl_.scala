package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait GridControl_ extends js.Object {
  /**
  			 * If a tooltip is currently shown by the gridControl, hide and close it.
  			 */
  def hide(): js.Any
  def onAdd(map: Map_): js.Any
  def onRemove(map: Map_): js.Any
  /**
  			 * Change the Mustache template used to transform the UTFGrid data in the map's interactivity into HTML for display.
  			 */
  def setTemplate(template: String): js.Any
}

object GridControl_ {
  @scala.inline
  def apply(
    hide: CallbackTo[js.Any],
    onAdd: Map_ => CallbackTo[js.Any],
    onRemove: Map_ => CallbackTo[js.Any],
    setTemplate: String => CallbackTo[js.Any]
  ): GridControl_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onAdd(t0).runNow()))
    __obj.updateDynamic("onRemove")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onRemove(t0).runNow()))
    __obj.updateDynamic("setTemplate")(js.Any.fromFunction1((t0: java.lang.String) => setTemplate(t0).runNow()))
    __obj.asInstanceOf[GridControl_]
  }
}

