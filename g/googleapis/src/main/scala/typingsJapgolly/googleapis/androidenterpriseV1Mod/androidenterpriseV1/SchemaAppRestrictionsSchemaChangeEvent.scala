package typingsJapgolly.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a new app version is uploaded to Google Play and
  * its app restrictions schema changed. To fetch the app restrictions schema
  * for an app, use Products.getAppRestrictionsSchema on the EMM API.
  */
@js.native
trait SchemaAppRestrictionsSchemaChangeEvent extends js.Object {
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the app restriction schema changed. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
}

object SchemaAppRestrictionsSchemaChangeEvent {
  @scala.inline
  def apply(productId: String = null): SchemaAppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaChangeEvent]
  }
}

