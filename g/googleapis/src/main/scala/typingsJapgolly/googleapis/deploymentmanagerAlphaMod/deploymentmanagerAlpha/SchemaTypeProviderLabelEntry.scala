package typingsJapgolly.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTypeProviderLabelEntry extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object SchemaTypeProviderLabelEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): SchemaTypeProviderLabelEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeProviderLabelEntry]
  }
}

