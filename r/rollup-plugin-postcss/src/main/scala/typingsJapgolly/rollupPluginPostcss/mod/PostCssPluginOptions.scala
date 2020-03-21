package typingsJapgolly.rollupPluginPostcss.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cssnano.mod.CssNanoOptions
import typingsJapgolly.rollupPluginPostcss.AnonCtx
import typingsJapgolly.rollupPluginPostcss.AnonInsertAt
import typingsJapgolly.rollupPluginPostcss.rollupPluginPostcssStrings.`inline`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCssPluginOptions extends js.Object {
  var autoModules: js.UndefOr[Boolean] = js.undefined
  var config: js.UndefOr[Boolean | AnonCtx] = js.undefined
  var exec: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var extract: js.UndefOr[Boolean | String] = js.undefined
  var inject: js.UndefOr[Boolean | AnonInsertAt] = js.undefined
  var loaders: js.UndefOr[js.Array[_]] = js.undefined
  var minimize: js.UndefOr[Boolean | CssNanoOptions] = js.undefined
  var modules: js.UndefOr[Boolean | js.Any] = js.undefined
  var name: js.UndefOr[js.Array[_ | js.Array[_]]] = js.undefined
  var namedExports: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | Boolean]] = js.undefined
  var onImport: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.undefined
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  var sourceMap: js.UndefOr[Boolean | `inline`] = js.undefined
  var stringifier: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.undefined
  var syntax: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit | String]] = js.undefined
}

object PostCssPluginOptions {
  @scala.inline
  def apply(
    autoModules: js.UndefOr[Boolean] = js.undefined,
    config: Boolean | AnonCtx = null,
    exec: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    extract: Boolean | String = null,
    inject: Boolean | AnonInsertAt = null,
    loaders: js.Array[_] = null,
    minimize: Boolean | CssNanoOptions = null,
    modules: Boolean | js.Any = null,
    name: js.Array[_ | js.Array[_]] = null,
    namedExports: /* repeated */ js.Any => CallbackTo[Unit | Boolean] = null,
    onImport: /* id */ js.Any => Callback = null,
    parser: /* repeated */ js.Any => CallbackTo[Unit | String] = null,
    plugins: js.Array[_] = null,
    sourceMap: Boolean | `inline` = null,
    stringifier: /* repeated */ js.Any => CallbackTo[Unit | String] = null,
    syntax: /* repeated */ js.Any => CallbackTo[Unit | String] = null
  ): PostCssPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoModules)) __obj.updateDynamic("autoModules")(autoModules.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(exec)) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (extract != null) __obj.updateDynamic("extract")(extract.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (loaders != null) __obj.updateDynamic("loaders")(loaders.asInstanceOf[js.Any])
    if (minimize != null) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namedExports != null) __obj.updateDynamic("namedExports")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => namedExports(t0).runNow()))
    if (onImport != null) __obj.updateDynamic("onImport")(js.Any.fromFunction1((t0: /* id */ js.Any) => onImport(t0).runNow()))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => parser(t0).runNow()))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (stringifier != null) __obj.updateDynamic("stringifier")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => stringifier(t0).runNow()))
    if (syntax != null) __obj.updateDynamic("syntax")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => syntax(t0).runNow()))
    __obj.asInstanceOf[PostCssPluginOptions]
  }
}

