package typingsJapgolly.gulpSass.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeSass.mod.FunctionDeclarations
import typingsJapgolly.nodeSass.mod.Importer
import typingsJapgolly.nodeSass.mod.Options
import typingsJapgolly.nodeSass.mod.SassFunction
import typingsJapgolly.nodeSass.nodeSassStrings.compact
import typingsJapgolly.nodeSass.nodeSassStrings.compressed
import typingsJapgolly.nodeSass.nodeSassStrings.expanded
import typingsJapgolly.nodeSass.nodeSassStrings.nested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SassOptions extends Options {
  var error: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.undefined
  var imagePaths: js.UndefOr[js.Array[String]] = js.undefined
  var success: js.UndefOr[js.Function1[/* results */ SassResults, _]] = js.undefined
}

object SassOptions {
  @scala.inline
  def apply(
    data: String = null,
    error: /* err */ js.Error => CallbackTo[js.Any] = null,
    file: String = null,
    functions: FunctionDeclarations[SassFunction] = null,
    imagePaths: js.Array[String] = null,
    importer: Importer | js.Array[Importer] = null,
    includePaths: js.Array[String] = null,
    indentType: String = null,
    indentWidth: Int | Double = null,
    indentedSyntax: js.UndefOr[Boolean] = js.undefined,
    linefeed: String = null,
    omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined,
    outFile: String = null,
    outputStyle: compact | compressed | expanded | nested = null,
    precision: Int | Double = null,
    sourceComments: js.UndefOr[Boolean] = js.undefined,
    sourceMap: Boolean | String = null,
    sourceMapContents: js.UndefOr[Boolean] = js.undefined,
    sourceMapEmbed: js.UndefOr[Boolean] = js.undefined,
    sourceMapRoot: String = null,
    success: /* results */ SassResults => CallbackTo[js.Any] = null
  ): SassOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.Error) => error(t0).runNow()))
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (imagePaths != null) __obj.updateDynamic("imagePaths")(imagePaths.asInstanceOf[js.Any])
    if (importer != null) __obj.updateDynamic("importer")(importer.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    if (indentType != null) __obj.updateDynamic("indentType")(indentType.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(indentedSyntax)) __obj.updateDynamic("indentedSyntax")(indentedSyntax.asInstanceOf[js.Any])
    if (linefeed != null) __obj.updateDynamic("linefeed")(linefeed.asInstanceOf[js.Any])
    if (!js.isUndefined(omitSourceMapUrl)) __obj.updateDynamic("omitSourceMapUrl")(omitSourceMapUrl.asInstanceOf[js.Any])
    if (outFile != null) __obj.updateDynamic("outFile")(outFile.asInstanceOf[js.Any])
    if (outputStyle != null) __obj.updateDynamic("outputStyle")(outputStyle.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceComments)) __obj.updateDynamic("sourceComments")(sourceComments.asInstanceOf[js.Any])
    if (sourceMap != null) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapContents)) __obj.updateDynamic("sourceMapContents")(sourceMapContents.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapEmbed)) __obj.updateDynamic("sourceMapEmbed")(sourceMapEmbed.asInstanceOf[js.Any])
    if (sourceMapRoot != null) __obj.updateDynamic("sourceMapRoot")(sourceMapRoot.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* results */ typingsJapgolly.gulpSass.mod.SassResults) => success(t0).runNow()))
    __obj.asInstanceOf[SassOptions]
  }
}

