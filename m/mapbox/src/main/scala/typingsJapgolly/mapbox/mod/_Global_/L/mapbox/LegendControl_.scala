package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait LegendControl_ extends js.Object {
  /**
  			 * Adds a legend to the legendControl.
  			 */
  def addLegend(legend: String): js.Any
  def onAdd(map: Map_): js.Any
  /**
  			 * Removes a legend from the legendControl.
  			 */
  def removeLegend(legend: String): js.Any
}

object LegendControl_ {
  @scala.inline
  def apply(
    addLegend: String => CallbackTo[js.Any],
    onAdd: Map_ => CallbackTo[js.Any],
    removeLegend: String => CallbackTo[js.Any]
  ): LegendControl_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLegend")(js.Any.fromFunction1((t0: java.lang.String) => addLegend(t0).runNow()))
    __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onAdd(t0).runNow()))
    __obj.updateDynamic("removeLegend")(js.Any.fromFunction1((t0: java.lang.String) => removeLegend(t0).runNow()))
    __obj.asInstanceOf[LegendControl_]
  }
}

