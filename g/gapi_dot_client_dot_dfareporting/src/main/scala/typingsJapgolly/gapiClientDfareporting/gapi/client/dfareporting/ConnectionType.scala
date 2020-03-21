package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionType extends js.Object {
  /** ID of this connection type. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#connectionType". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this connection type. */
  var name: js.UndefOr[String] = js.undefined
}

object ConnectionType {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): ConnectionType = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionType]
  }
}

