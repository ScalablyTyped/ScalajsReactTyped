package typingsJapgolly.esm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<esm.esm.Options.Esm> */
trait PartialEsm extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var dedefault: js.UndefOr[Boolean] = js.undefined
  var esModule: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[Boolean] = js.undefined
  var mutableNamespace: js.UndefOr[Boolean] = js.undefined
  var namedExports: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[Boolean] = js.undefined
  var topLevelReturn: js.UndefOr[Boolean] = js.undefined
  var vars: js.UndefOr[Boolean] = js.undefined
}

object PartialEsm {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    dedefault: js.UndefOr[Boolean] = js.undefined,
    esModule: js.UndefOr[Boolean] = js.undefined,
    extensions: js.UndefOr[Boolean] = js.undefined,
    mutableNamespace: js.UndefOr[Boolean] = js.undefined,
    namedExports: js.UndefOr[Boolean] = js.undefined,
    paths: js.UndefOr[Boolean] = js.undefined,
    topLevelReturn: js.UndefOr[Boolean] = js.undefined,
    vars: js.UndefOr[Boolean] = js.undefined
  ): PartialEsm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(dedefault)) __obj.updateDynamic("dedefault")(dedefault.asInstanceOf[js.Any])
    if (!js.isUndefined(esModule)) __obj.updateDynamic("esModule")(esModule.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(mutableNamespace)) __obj.updateDynamic("mutableNamespace")(mutableNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(namedExports)) __obj.updateDynamic("namedExports")(namedExports.asInstanceOf[js.Any])
    if (!js.isUndefined(paths)) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(topLevelReturn)) __obj.updateDynamic("topLevelReturn")(topLevelReturn.asInstanceOf[js.Any])
    if (!js.isUndefined(vars)) __obj.updateDynamic("vars")(vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialEsm]
  }
}

