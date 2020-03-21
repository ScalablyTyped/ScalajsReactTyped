package typingsJapgolly.mapbox.mod._Global_.L.mapbox

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Control * / any */ trait ShareControl_ extends js.Object {
  def onAdd(map: Map_): js.Any
}

object ShareControl_ {
  @scala.inline
  def apply(onAdd: Map_ => CallbackTo[js.Any]): ShareControl_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onAdd")(js.Any.fromFunction1((t0: typingsJapgolly.mapbox.mod._Global_.L.mapbox.Map_) => onAdd(t0).runNow()))
    __obj.asInstanceOf[ShareControl_]
  }
}

