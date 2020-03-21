package typingsJapgolly.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  /**
    * The id for this locale.
    * Example: "en_US"
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A human-friendly name for this language/locale.
    * Example: "English"
    * @OutputOnly
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A human-friendy string representing the region for this locale.
    * Example: "United States"
    * Not present for every locale.
    * @OutputOnly
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Tags for this dimension.
    * Examples: "default"
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(id: String = null, name: String = null, region: String = null, tags: js.Array[String] = null): Locale = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

