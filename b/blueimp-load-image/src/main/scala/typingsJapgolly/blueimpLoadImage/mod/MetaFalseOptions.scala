package typingsJapgolly.blueimpLoadImage.mod

import typingsJapgolly.blueimpLoadImage.blueimpLoadImageBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaFalseOptions extends MetaOptions {
  var meta: js.UndefOr[`false`] = js.undefined
}

object MetaFalseOptions {
  @scala.inline
  def apply(meta: `false` = null): MetaFalseOptions = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaFalseOptions]
  }
}

