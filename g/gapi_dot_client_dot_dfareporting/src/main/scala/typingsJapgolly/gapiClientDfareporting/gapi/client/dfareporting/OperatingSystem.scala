package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperatingSystem extends js.Object {
  /** DART ID of this operating system. This is the ID used for targeting. */
  var dartId: js.UndefOr[String] = js.undefined
  /** Whether this operating system is for desktop. */
  var desktop: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#operatingSystem". */
  var kind: js.UndefOr[String] = js.undefined
  /** Whether this operating system is for mobile. */
  var mobile: js.UndefOr[Boolean] = js.undefined
  /** Name of this operating system. */
  var name: js.UndefOr[String] = js.undefined
}

object OperatingSystem {
  @scala.inline
  def apply(
    dartId: String = null,
    desktop: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    mobile: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    if (dartId != null) __obj.updateDynamic("dartId")(dartId.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile)) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperatingSystem]
  }
}

