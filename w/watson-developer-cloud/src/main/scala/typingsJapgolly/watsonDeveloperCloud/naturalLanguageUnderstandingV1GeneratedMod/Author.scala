package typingsJapgolly.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The author of the analyzed content. */
trait Author extends js.Object {
  /** Name of the author. */
  var name: js.UndefOr[String] = js.undefined
}

object Author {
  @scala.inline
  def apply(name: String = null): Author = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}

