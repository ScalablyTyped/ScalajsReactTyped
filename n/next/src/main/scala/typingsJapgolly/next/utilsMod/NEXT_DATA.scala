package typingsJapgolly.next.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.ErrorstatusCodenumber
import typingsJapgolly.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NEXT_DATA extends js.Object {
  var assetPrefix: js.UndefOr[String] = js.undefined
  var autoExport: js.UndefOr[Boolean] = js.undefined
  var buildId: String
  var dynamicIds: js.UndefOr[js.Array[String]] = js.undefined
  var err: js.UndefOr[ErrorstatusCodenumber] = js.undefined
  var nextExport: js.UndefOr[Boolean] = js.undefined
  var page: String
  var props: js.Any
  var query: ParsedUrlQuery
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object NEXT_DATA {
  @scala.inline
  def apply(
    buildId: String,
    page: String,
    props: js.Any,
    query: ParsedUrlQuery,
    assetPrefix: String = null,
    autoExport: js.UndefOr[Boolean] = js.undefined,
    dynamicIds: js.Array[String] = null,
    err: ErrorstatusCodenumber = null,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null
  ): NEXT_DATA = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExport)) __obj.updateDynamic("autoExport")(autoExport.asInstanceOf[js.Any])
    if (dynamicIds != null) __obj.updateDynamic("dynamicIds")(dynamicIds.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEXT_DATA]
  }
}

