package typingsJapgolly.jsonld.mod.Options

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpMap extends js.Object {
  // TODO: Figure out type of info
  var expansionMap: js.UndefOr[js.Function1[/* info */ js.Any, _]] = js.undefined
}

object ExpMap {
  @scala.inline
  def apply(expansionMap: /* info */ js.Any => CallbackTo[js.Any] = null): ExpMap = {
    val __obj = js.Dynamic.literal()
    if (expansionMap != null) __obj.updateDynamic("expansionMap")(js.Any.fromFunction1((t0: /* info */ js.Any) => expansionMap(t0).runNow()))
    __obj.asInstanceOf[ExpMap]
  }
}

