package typingsJapgolly.googleapis

import typingsJapgolly.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4.SchemaPagespeedApiFormatStringV4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHeaderUrls extends js.Object {
  var header: js.UndefOr[SchemaPagespeedApiFormatStringV4] = js.native
  var urls: js.UndefOr[js.Array[AnonDetailsArray]] = js.native
}

object AnonHeaderUrls {
  @scala.inline
  def apply(header: SchemaPagespeedApiFormatStringV4 = null, urls: js.Array[AnonDetailsArray] = null): AnonHeaderUrls = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaderUrls]
  }
}

