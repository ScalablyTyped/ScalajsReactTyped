package typingsJapgolly.knuddelsUserappsApi.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.knuddelsUserappsApi.mod.KnuddelsJsonData
import typingsJapgolly.knuddelsUserappsApi.mod._KnuddelsJsonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnuddelsJson
  extends /* x */ StringDictionary[js.UndefOr[KnuddelsJsonData]]
     with _KnuddelsJsonData

object KnuddelsJson {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[js.UndefOr[KnuddelsJsonData]] = null): KnuddelsJson = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnuddelsJson]
  }
}

