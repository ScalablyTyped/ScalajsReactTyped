package typingsJapgolly.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Occupation extends js.Object {
  /** Metadata about the occupation. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The occupation; for example, `carpenter`. */
  var value: js.UndefOr[String] = js.undefined
}

object Occupation {
  @scala.inline
  def apply(metadata: FieldMetadata = null, value: String = null): Occupation = {
    val __obj = js.Dynamic.literal()
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Occupation]
  }
}

