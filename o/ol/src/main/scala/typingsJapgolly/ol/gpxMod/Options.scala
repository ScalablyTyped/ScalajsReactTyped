package typingsJapgolly.ol.gpxMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var readExtensions: js.UndefOr[
    js.Function2[
      /* p0 */ typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], 
      /* p1 */ Node, 
      Unit
    ]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    readExtensions: (/* p0 */ typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], /* p1 */ Node) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (readExtensions != null) __obj.updateDynamic("readExtensions")(js.Any.fromFunction2((t0: /* p0 */ typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], t1: /* p1 */ org.scalajs.dom.raw.Node) => readExtensions(t0, t1).runNow()))
    __obj.asInstanceOf[Options]
  }
}

