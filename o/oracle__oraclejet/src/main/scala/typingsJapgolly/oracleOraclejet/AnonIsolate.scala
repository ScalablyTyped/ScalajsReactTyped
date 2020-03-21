package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.center
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.end
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsolate extends js.Object {
  var isolate: js.UndefOr[off | on] = js.undefined
  var labelHalign: js.UndefOr[center | end | start] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var useNodeColor: js.UndefOr[on | off] = js.undefined
}

object AnonIsolate {
  @scala.inline
  def apply(
    isolate: off | on = null,
    labelHalign: center | end | start = null,
    labelStyle: js.Object = null,
    useNodeColor: on | off = null
  ): AnonIsolate = {
    val __obj = js.Dynamic.literal()
    if (isolate != null) __obj.updateDynamic("isolate")(isolate.asInstanceOf[js.Any])
    if (labelHalign != null) __obj.updateDynamic("labelHalign")(labelHalign.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (useNodeColor != null) __obj.updateDynamic("useNodeColor")(useNodeColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsolate]
  }
}

