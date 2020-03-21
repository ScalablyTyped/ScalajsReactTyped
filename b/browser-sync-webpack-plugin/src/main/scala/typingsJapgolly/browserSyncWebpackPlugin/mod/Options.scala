package typingsJapgolly.browserSyncWebpackPlugin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.browserSync.mod.BrowserSyncInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * BrowserSync instance init callback.
    * @defaultValue undefined
    */
  var callback: js.UndefOr[js.Function2[/* error */ js.Error, /* bs */ BrowserSyncInstance, Unit]] = js.undefined
  /**
    * allows BrowserSync to inject changes inplace instead of reloading the page when changed
    * chunks are all CSS files.
    * @defaultValue false
    */
  var injectCss: js.UndefOr[Boolean] = js.undefined
  /**
    * BrowserSync instance name.
    * @defaultValue 'bs-webpack-plugin'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Should BrowserSync handle reloads?
    * @defaultValue true
    */
  var reload: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    callback: (/* error */ js.Error, /* bs */ BrowserSyncInstance) => Callback = null,
    injectCss: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    reload: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* bs */ typingsJapgolly.browserSync.mod.BrowserSyncInstance) => callback(t0, t1).runNow()))
    if (!js.isUndefined(injectCss)) __obj.updateDynamic("injectCss")(injectCss.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

