package typingsJapgolly.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefined extends js.Object {
  /** The end user specified key of the user defined data. */
  var key: js.UndefOr[String] = js.undefined
  /** Metadata about the user defined data. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The end user specified value of the user defined data. */
  var value: js.UndefOr[String] = js.undefined
}

object UserDefined {
  @scala.inline
  def apply(key: String = null, metadata: FieldMetadata = null, value: String = null): UserDefined = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefined]
  }
}

