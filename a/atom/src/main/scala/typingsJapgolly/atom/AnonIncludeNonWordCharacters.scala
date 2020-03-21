package typingsJapgolly.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeNonWordCharacters extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  var wordRegex: js.UndefOr[js.RegExp] = js.undefined
}

object AnonIncludeNonWordCharacters {
  @scala.inline
  def apply(includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined, wordRegex: js.RegExp = null): AnonIncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters.asInstanceOf[js.Any])
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeNonWordCharacters]
  }
}

