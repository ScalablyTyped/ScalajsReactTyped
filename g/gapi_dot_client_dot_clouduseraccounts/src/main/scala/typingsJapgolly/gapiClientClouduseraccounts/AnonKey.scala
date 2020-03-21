package typingsJapgolly.gapiClientClouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  /**
    * [Output Only] A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for
    * a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and
    * a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled
    * for IP forwarding).
    */
  var key: js.UndefOr[String] = js.undefined
  /** [Output Only] A warning data value corresponding to the key. */
  var value: js.UndefOr[String] = js.undefined
}

object AnonKey {
  @scala.inline
  def apply(key: String = null, value: String = null): AnonKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

