package typingsJapgolly.ol.rasterMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ImageData
import typingsJapgolly.ol.olStrings.image
import typingsJapgolly.ol.olStrings.pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var lib: js.UndefOr[js.Any] = js.undefined
  var operation: js.UndefOr[Operation] = js.undefined
  var operationType: js.UndefOr[pixel | image] = js.undefined
  var sources: js.Array[
    typingsJapgolly.ol.sourceSourceMod.default | typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
  ]
  var threads: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    sources: js.Array[
      typingsJapgolly.ol.sourceSourceMod.default | typingsJapgolly.ol.layerLayerMod.default[typingsJapgolly.ol.sourceSourceMod.default]
    ],
    lib: js.Any = null,
    operation: (/* p0 */ js.Array[js.Array[Double] | ImageData], /* p1 */ js.Object) => CallbackTo[js.Array[Double] | ImageData] = null,
    operationType: pixel | image = null,
    threads: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    if (lib != null) __obj.updateDynamic("lib")(lib.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(js.Any.fromFunction2((t0: /* p0 */ js.Array[js.Array[scala.Double] | org.scalajs.dom.raw.ImageData], t1: /* p1 */ js.Object) => operation(t0, t1).runNow()))
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

