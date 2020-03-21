package typingsJapgolly.googleapis

import typingsJapgolly.googleapis.pagespeedonlineV2Mod.pagespeedonlineV2.SchemaPagespeedApiFormatStringV2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetailsResult extends js.Object {
  var details: js.UndefOr[js.Array[SchemaPagespeedApiFormatStringV2]] = js.native
  var result: js.UndefOr[SchemaPagespeedApiFormatStringV2] = js.native
}

object AnonDetailsResult {
  @scala.inline
  def apply(
    details: js.Array[SchemaPagespeedApiFormatStringV2] = null,
    result: SchemaPagespeedApiFormatStringV2 = null
  ): AnonDetailsResult = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetailsResult]
  }
}

