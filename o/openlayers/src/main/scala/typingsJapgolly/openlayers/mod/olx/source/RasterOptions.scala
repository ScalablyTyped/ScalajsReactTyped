package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ImageData
import typingsJapgolly.openlayers.mod.GlobalObject
import typingsJapgolly.openlayers.mod.RasterOperation
import typingsJapgolly.openlayers.mod.RasterOperationType
import typingsJapgolly.openlayers.mod.source.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @api
  */
trait RasterOptions extends js.Object {
  var lib: js.UndefOr[GlobalObject] = js.undefined
  var operation: js.UndefOr[RasterOperation] = js.undefined
  var operationType: js.UndefOr[RasterOperationType] = js.undefined
  var sources: js.Array[Source]
  var threads: js.UndefOr[Double] = js.undefined
}

object RasterOptions {
  @scala.inline
  def apply(
    sources: js.Array[Source],
    lib: GlobalObject = null,
    operation: (/* data */ js.Array[js.Array[Double] | ImageData], /* obj */ GlobalObject) => CallbackTo[js.Array[Double] | ImageData] = null,
    operationType: RasterOperationType = null,
    threads: Int | Double = null
  ): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    if (lib != null) __obj.updateDynamic("lib")(lib.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Array[scala.Double] | org.scalajs.dom.raw.ImageData], t1: /* obj */ typingsJapgolly.openlayers.mod.GlobalObject) => operation(t0, t1).runNow()))
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
}

