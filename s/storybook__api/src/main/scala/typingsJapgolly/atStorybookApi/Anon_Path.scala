package typingsJapgolly.atStorybookApi

import typingsJapgolly.atStorybookApi.distModulesUrlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: String
  var queryParams: QueryParams
  var storyId: js.UndefOr[String] = js.undefined
  var url: String
  var viewMode: js.UndefOr[String] = js.undefined
}

object Anon_Path {
  @scala.inline
  def apply(
    path: String,
    queryParams: QueryParams,
    url: String,
    storyId: String = null,
    viewMode: String = null
  ): Anon_Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Path]
  }
}

