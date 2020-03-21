package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactInstantsearchCore.AnonLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSearchProvided[THit] extends js.Object {
  /** the refinement currently applied */
  var currentRefinement: NESW
  /** the records that matched the search */
  var hits: js.Array[THit]
  /** true if the current refinement is set with the map bounds */
  var isRefinedWithMap: Boolean
  /** the position of the search */
  var position: AnonLat
  /** a function to generate a URL for the corresponding search state */
  def createURL(args: js.Any*): js.Any
  /** a function to toggle the refinement */
  def refine(refinement: NESW): Unit
}

object GeoSearchProvided {
  @scala.inline
  def apply[THit](
    createURL: /* repeated */ js.Any => CallbackTo[js.Any],
    currentRefinement: NESW,
    hits: js.Array[THit],
    isRefinedWithMap: Boolean,
    position: AnonLat,
    refine: NESW => Callback
  ): GeoSearchProvided[THit] = {
    val __obj = js.Dynamic.literal(currentRefinement = currentRefinement.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], isRefinedWithMap = isRefinedWithMap.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("createURL")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => createURL(t0).runNow()))
    __obj.updateDynamic("refine")(js.Any.fromFunction1((t0: typingsJapgolly.reactInstantsearchCore.mod.NESW) => refine(t0).runNow()))
    __obj.asInstanceOf[GeoSearchProvided[THit]]
  }
}

