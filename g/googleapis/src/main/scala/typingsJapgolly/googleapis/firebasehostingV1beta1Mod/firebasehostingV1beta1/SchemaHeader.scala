package typingsJapgolly.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A [`header`](/docs/hosting/full-config#headers) defines custom headers to
  * add to a response should the request URL path match the pattern.
  */
@js.native
trait SchemaHeader extends js.Object {
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.native
  /**
    * Required. The additional headers to add to the response.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaHeader {
  @scala.inline
  def apply(glob: String = null, headers: StringDictionary[String] = null): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaHeader]
  }
}

