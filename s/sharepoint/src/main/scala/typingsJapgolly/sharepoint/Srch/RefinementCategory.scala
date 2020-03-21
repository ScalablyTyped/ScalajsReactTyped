package typingsJapgolly.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharepoint.sharepointStrings.AND
import typingsJapgolly.sharepoint.sharepointStrings.OR
import typingsJapgolly.sharepoint.sharepointStrings.and_
import typingsJapgolly.sharepoint.sharepointStrings.or_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementCategory extends js.Object {
  /** Use KQL */
  var k: Boolean
  /**  token to display value map */
  var m: StringDictionary[String] | Null
  /** Refiner Name (Mapped property) */
  var n: String
  var o: String | and_ | or_ | AND | OR
  /** Values, prefixed by ǂǂ for taxonomy terms */
  var t: js.Array[String]
}

object RefinementCategory {
  @scala.inline
  def apply(
    k: Boolean,
    n: String,
    o: String | and_ | or_ | AND | OR,
    t: js.Array[String],
    m: StringDictionary[String] = null
  ): RefinementCategory = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementCategory]
  }
}

