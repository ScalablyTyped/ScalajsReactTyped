package typingsJapgolly.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message specifies a header location to extract JWT token.
  */
@js.native
trait SchemaJwtHeader extends js.Object {
  /**
    * The HTTP header name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value prefix. The value format is &quot;value_prefix&quot; For
    * example, for &quot;Authorization: Bearer &quot;,
    * value_prefix=&quot;Bearer &quot; with a space at the end.
    */
  var valuePrefix: js.UndefOr[String] = js.native
}

object SchemaJwtHeader {
  @scala.inline
  def apply(name: String = null, valuePrefix: String = null): SchemaJwtHeader = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJwtHeader]
  }
}

