package typingsJapgolly.rollupPluginTypescript2

import japgolly.scalajs.react.Callback
import typingsJapgolly.rollupPluginTypescript2.ioptionsMod.TransformerFactoryCreator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rollup-plugin-typescript2.rollup-plugin-typescript2/dist/partial.Partial<rollup-plugin-typescript2.rollup-plugin-typescript2/dist/ioptions.IOptions> */
trait PartialIOptions extends js.Object {
  var abortOnError: js.UndefOr[Boolean] = js.undefined
  var cacheRoot: js.UndefOr[String] = js.undefined
  var check: js.UndefOr[Boolean] = js.undefined
  var clean: js.UndefOr[Boolean] = js.undefined
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var include: js.UndefOr[String | js.Array[String]] = js.undefined
  var objectHashIgnoreUnknownHack: js.UndefOr[Boolean] = js.undefined
  var rollupCommonJSResolveHack: js.UndefOr[Boolean] = js.undefined
  var sourceMapCallback: js.UndefOr[js.Function2[/* id */ String, /* map */ String, Unit]] = js.undefined
  var transformers: js.UndefOr[js.Array[TransformerFactoryCreator]] = js.undefined
  var tsconfig: js.UndefOr[String] = js.undefined
  var tsconfigDefaults: js.UndefOr[js.Any] = js.undefined
  var tsconfigOverride: js.UndefOr[js.Any] = js.undefined
  var typescript: js.UndefOr[TypeoftsTypes] = js.undefined
  var useTsconfigDeclarationDir: js.UndefOr[Boolean] = js.undefined
  var verbosity: js.UndefOr[Double] = js.undefined
}

object PartialIOptions {
  @scala.inline
  def apply(
    abortOnError: js.UndefOr[Boolean] = js.undefined,
    cacheRoot: String = null,
    check: js.UndefOr[Boolean] = js.undefined,
    clean: js.UndefOr[Boolean] = js.undefined,
    exclude: String | js.Array[String] = null,
    include: String | js.Array[String] = null,
    objectHashIgnoreUnknownHack: js.UndefOr[Boolean] = js.undefined,
    rollupCommonJSResolveHack: js.UndefOr[Boolean] = js.undefined,
    sourceMapCallback: (/* id */ String, /* map */ String) => Callback = null,
    transformers: js.Array[TransformerFactoryCreator] = null,
    tsconfig: String = null,
    tsconfigDefaults: js.Any = null,
    tsconfigOverride: js.Any = null,
    typescript: TypeoftsTypes = null,
    useTsconfigDeclarationDir: js.UndefOr[Boolean] = js.undefined,
    verbosity: Int | Double = null
  ): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnError)) __obj.updateDynamic("abortOnError")(abortOnError.asInstanceOf[js.Any])
    if (cacheRoot != null) __obj.updateDynamic("cacheRoot")(cacheRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(objectHashIgnoreUnknownHack)) __obj.updateDynamic("objectHashIgnoreUnknownHack")(objectHashIgnoreUnknownHack.asInstanceOf[js.Any])
    if (!js.isUndefined(rollupCommonJSResolveHack)) __obj.updateDynamic("rollupCommonJSResolveHack")(rollupCommonJSResolveHack.asInstanceOf[js.Any])
    if (sourceMapCallback != null) __obj.updateDynamic("sourceMapCallback")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* map */ java.lang.String) => sourceMapCallback(t0, t1).runNow()))
    if (transformers != null) __obj.updateDynamic("transformers")(transformers.asInstanceOf[js.Any])
    if (tsconfig != null) __obj.updateDynamic("tsconfig")(tsconfig.asInstanceOf[js.Any])
    if (tsconfigDefaults != null) __obj.updateDynamic("tsconfigDefaults")(tsconfigDefaults.asInstanceOf[js.Any])
    if (tsconfigOverride != null) __obj.updateDynamic("tsconfigOverride")(tsconfigOverride.asInstanceOf[js.Any])
    if (typescript != null) __obj.updateDynamic("typescript")(typescript.asInstanceOf[js.Any])
    if (!js.isUndefined(useTsconfigDeclarationDir)) __obj.updateDynamic("useTsconfigDeclarationDir")(useTsconfigDeclarationDir.asInstanceOf[js.Any])
    if (verbosity != null) __obj.updateDynamic("verbosity")(verbosity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIOptions]
  }
}

