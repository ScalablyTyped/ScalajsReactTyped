package typingsJapgolly.atStorybookApi.atStorybookApiMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookApi.distModulesUrlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Other
  extends /* key */ StringDictionary[js.Any] {
  var customQueryParams: QueryParams
}

object Other {
  @scala.inline
  def apply(customQueryParams: QueryParams, StringDictionary: /* key */ StringDictionary[js.Any] = null): Other = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Other]
  }
}

