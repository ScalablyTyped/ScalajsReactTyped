package typingsJapgolly.proxyLists

import typingsJapgolly.proxyLists.mod.AnonymityLevel
import typingsJapgolly.proxyLists.mod.IPType
import typingsJapgolly.proxyLists.mod.Protocol
import typingsJapgolly.proxyLists.proxyListsStrings.loose
import typingsJapgolly.proxyLists.proxyListsStrings.strict
import typingsJapgolly.request.mod.CoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<proxy-lists.proxy-lists.Options> */
trait PartialOptions extends js.Object {
  var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.undefined
  var countries: js.UndefOr[js.Array[String]] = js.undefined
  var countriesBlackList: js.UndefOr[js.Array[String]] = js.undefined
  var defaultRequestOptions: js.UndefOr[CoreOptions] = js.undefined
  var filterMode: js.UndefOr[strict | loose] = js.undefined
  var ipTypes: js.UndefOr[js.Array[IPType]] = js.undefined
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
  var series: js.UndefOr[Boolean] = js.undefined
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.undefined
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    anonymityLevels: js.Array[AnonymityLevel] = null,
    countries: js.Array[String] = null,
    countriesBlackList: js.Array[String] = null,
    defaultRequestOptions: CoreOptions = null,
    filterMode: strict | loose = null,
    ipTypes: js.Array[IPType] = null,
    protocols: js.Array[Protocol] = null,
    series: js.UndefOr[Boolean] = js.undefined,
    sourcesBlackList: js.Array[String] = null,
    sourcesWhiteList: js.Array[String] = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (anonymityLevels != null) __obj.updateDynamic("anonymityLevels")(anonymityLevels.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (countriesBlackList != null) __obj.updateDynamic("countriesBlackList")(countriesBlackList.asInstanceOf[js.Any])
    if (defaultRequestOptions != null) __obj.updateDynamic("defaultRequestOptions")(defaultRequestOptions.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (ipTypes != null) __obj.updateDynamic("ipTypes")(ipTypes.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(series)) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (sourcesBlackList != null) __obj.updateDynamic("sourcesBlackList")(sourcesBlackList.asInstanceOf[js.Any])
    if (sourcesWhiteList != null) __obj.updateDynamic("sourcesWhiteList")(sourcesWhiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

