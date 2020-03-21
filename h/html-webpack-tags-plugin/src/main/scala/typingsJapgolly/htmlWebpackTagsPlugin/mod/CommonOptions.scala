package typingsJapgolly.htmlWebpackTagsPlugin.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  var addHash: js.UndefOr[AddHashFunction] = js.undefined
  var addPublicPath: js.UndefOr[AddPublicPathFunction] = js.undefined
  var append: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[Boolean | String | AddHashFunction] = js.undefined
  var publicPath: js.UndefOr[Boolean | String | AddPublicPathFunction] = js.undefined
  var useHash: js.UndefOr[Boolean] = js.undefined
  var usePublicPath: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    addHash: (/* assetPath */ String, /* hash */ String) => CallbackTo[String] = null,
    addPublicPath: (/* assetPath */ String, /* publicPath */ String) => CallbackTo[String] = null,
    append: js.UndefOr[Boolean] = js.undefined,
    hash: Boolean | String | AddHashFunction = null,
    publicPath: Boolean | String | AddPublicPathFunction = null,
    useHash: js.UndefOr[Boolean] = js.undefined,
    usePublicPath: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (addHash != null) __obj.updateDynamic("addHash")(js.Any.fromFunction2((t0: /* assetPath */ java.lang.String, t1: /* hash */ java.lang.String) => addHash(t0, t1).runNow()))
    if (addPublicPath != null) __obj.updateDynamic("addPublicPath")(js.Any.fromFunction2((t0: /* assetPath */ java.lang.String, t1: /* publicPath */ java.lang.String) => addPublicPath(t0, t1).runNow()))
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.asInstanceOf[js.Any])
    if (!js.isUndefined(usePublicPath)) __obj.updateDynamic("usePublicPath")(usePublicPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}

