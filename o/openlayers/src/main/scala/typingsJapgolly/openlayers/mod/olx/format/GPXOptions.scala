package typingsJapgolly.openlayers.mod.olx.format

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import typingsJapgolly.openlayers.mod.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPXOptions extends js.Object {
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, _]] = js.undefined
}

object GPXOptions {
  @scala.inline
  def apply(readExtensions: (/* feature */ Feature, /* node */ Node) => CallbackTo[js.Any] = null): GPXOptions = {
    val __obj = js.Dynamic.literal()
    if (readExtensions != null) __obj.updateDynamic("readExtensions")(js.Any.fromFunction2((t0: /* feature */ typingsJapgolly.openlayers.mod.Feature, t1: /* node */ org.scalajs.dom.raw.Node) => readExtensions(t0, t1).runNow()))
    __obj.asInstanceOf[GPXOptions]
  }
}

