package typingsJapgolly.gapiClientGroupsmigration.gapi.client.groupsmigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groups extends js.Object {
  /** The kind of insert resource this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** The status of the insert request. */
  var responseCode: js.UndefOr[String] = js.undefined
}

object Groups {
  @scala.inline
  def apply(kind: String = null, responseCode: String = null): Groups = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
}

