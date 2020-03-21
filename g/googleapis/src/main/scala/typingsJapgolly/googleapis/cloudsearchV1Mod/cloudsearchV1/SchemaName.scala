package typingsJapgolly.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s name.
  */
@js.native
trait SchemaName extends js.Object {
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer&#39;s account or the &lt;code&gt;Accept-Language&lt;/code&gt;
    * HTTP header.
    */
  var displayName: js.UndefOr[String] = js.native
}

object SchemaName {
  @scala.inline
  def apply(displayName: String = null): SchemaName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaName]
  }
}

