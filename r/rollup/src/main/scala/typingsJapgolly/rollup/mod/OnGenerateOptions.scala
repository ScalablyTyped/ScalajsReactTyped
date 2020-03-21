package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rollup.AnonDefine
import typingsJapgolly.rollup.rollupStrings.`inline`
import typingsJapgolly.rollup.rollupStrings.auto
import typingsJapgolly.rollup.rollupStrings.default
import typingsJapgolly.rollup.rollupStrings.hidden
import typingsJapgolly.rollup.rollupStrings.named
import typingsJapgolly.rollup.rollupStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGenerateOptions extends OutputOptions {
  var bundle: OutputChunk
}

object OnGenerateOptions {
  @scala.inline
  def apply(
    bundle: OutputChunk,
    amd: AnonDefine = null,
    assetFileNames: String = null,
    banner: String | (js.Function0[String | js.Promise[String]]) = null,
    chunkFileNames: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    dynamicImportFunction: String = null,
    entryFileNames: String = null,
    esModule: js.UndefOr[Boolean] = js.undefined,
    exports: default | named | none | auto = null,
    extend: js.UndefOr[Boolean] = js.undefined,
    externalLiveBindings: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    footer: String | (js.Function0[String | js.Promise[String]]) = null,
    format: ModuleFormat = null,
    freeze: js.UndefOr[Boolean] = js.undefined,
    globals: GlobalsOption = null,
    hoistTransitiveImports: js.UndefOr[Boolean] = js.undefined,
    indent: js.UndefOr[Boolean] = js.undefined,
    interop: js.UndefOr[Boolean] = js.undefined,
    intro: String | (js.Function0[String | js.Promise[String]]) = null,
    name: String = null,
    namespaceToStringTag: js.UndefOr[Boolean] = js.undefined,
    noConflict: js.UndefOr[Boolean] = js.undefined,
    outro: String | (js.Function0[String | js.Promise[String]]) = null,
    paths: OptionsPaths = null,
    plugins: js.Array[OutputPlugin] = null,
    preferConst: js.UndefOr[Boolean] = js.undefined,
    sourcemap: Boolean | `inline` | hidden = null,
    sourcemapExcludeSources: js.UndefOr[Boolean] = js.undefined,
    sourcemapFile: String = null,
    sourcemapPathTransform: /* sourcePath */ String => CallbackTo[String] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): OnGenerateOptions = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any])
    if (amd != null) __obj.updateDynamic("amd")(amd.asInstanceOf[js.Any])
    if (assetFileNames != null) __obj.updateDynamic("assetFileNames")(assetFileNames.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (chunkFileNames != null) __obj.updateDynamic("chunkFileNames")(chunkFileNames.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (dynamicImportFunction != null) __obj.updateDynamic("dynamicImportFunction")(dynamicImportFunction.asInstanceOf[js.Any])
    if (entryFileNames != null) __obj.updateDynamic("entryFileNames")(entryFileNames.asInstanceOf[js.Any])
    if (!js.isUndefined(esModule)) __obj.updateDynamic("esModule")(esModule.asInstanceOf[js.Any])
    if (exports != null) __obj.updateDynamic("exports")(exports.asInstanceOf[js.Any])
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(externalLiveBindings)) __obj.updateDynamic("externalLiveBindings")(externalLiveBindings.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(freeze)) __obj.updateDynamic("freeze")(freeze.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(hoistTransitiveImports)) __obj.updateDynamic("hoistTransitiveImports")(hoistTransitiveImports.asInstanceOf[js.Any])
    if (!js.isUndefined(indent)) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (!js.isUndefined(interop)) __obj.updateDynamic("interop")(interop.asInstanceOf[js.Any])
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceToStringTag)) __obj.updateDynamic("namespaceToStringTag")(namespaceToStringTag.asInstanceOf[js.Any])
    if (!js.isUndefined(noConflict)) __obj.updateDynamic("noConflict")(noConflict.asInstanceOf[js.Any])
    if (outro != null) __obj.updateDynamic("outro")(outro.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(preferConst)) __obj.updateDynamic("preferConst")(preferConst.asInstanceOf[js.Any])
    if (sourcemap != null) __obj.updateDynamic("sourcemap")(sourcemap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemapExcludeSources)) __obj.updateDynamic("sourcemapExcludeSources")(sourcemapExcludeSources.asInstanceOf[js.Any])
    if (sourcemapFile != null) __obj.updateDynamic("sourcemapFile")(sourcemapFile.asInstanceOf[js.Any])
    if (sourcemapPathTransform != null) __obj.updateDynamic("sourcemapPathTransform")(js.Any.fromFunction1((t0: /* sourcePath */ java.lang.String) => sourcemapPathTransform(t0).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGenerateOptions]
  }
}

