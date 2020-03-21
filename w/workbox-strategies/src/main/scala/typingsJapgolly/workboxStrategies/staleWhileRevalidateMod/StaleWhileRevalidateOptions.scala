package typingsJapgolly.workboxStrategies.staleWhileRevalidateMod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.serviceworkers.CacheQueryOptions
import typingsJapgolly.workboxCore.workboxPluginMod.WorkboxPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaleWhileRevalidateOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  var matchOptions: js.UndefOr[CacheQueryOptions] = js.undefined
  var plugins: js.UndefOr[js.Array[WorkboxPlugin]] = js.undefined
}

object StaleWhileRevalidateOptions {
  @scala.inline
  def apply(
    cacheName: String = null,
    fetchOptions: RequestInit = null,
    matchOptions: CacheQueryOptions = null,
    plugins: js.Array[WorkboxPlugin] = null
  ): StaleWhileRevalidateOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (matchOptions != null) __obj.updateDynamic("matchOptions")(matchOptions.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaleWhileRevalidateOptions]
  }
}

