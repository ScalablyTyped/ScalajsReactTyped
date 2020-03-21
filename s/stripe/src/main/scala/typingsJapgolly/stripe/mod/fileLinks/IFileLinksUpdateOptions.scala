package typingsJapgolly.stripe.mod.fileLinks

import typingsJapgolly.stripe.mod.IDataOptionsWithMetadata
import typingsJapgolly.stripe.mod.IOptionsMetadata
import typingsJapgolly.stripe.stripeStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileLinksUpdateOptions extends IDataOptionsWithMetadata {
  var expires_at: js.UndefOr[Double | now] = js.undefined
}

object IFileLinksUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    expires_at: Double | now = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IFileLinksUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (expires_at != null) __obj.updateDynamic("expires_at")(expires_at.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileLinksUpdateOptions]
  }
}

