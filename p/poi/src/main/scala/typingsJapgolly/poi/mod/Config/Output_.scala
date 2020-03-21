package typingsJapgolly.poi.mod.Config

import typingsJapgolly.poi.mod.Config.Output.FileNames
import typingsJapgolly.poi.mod.Config.Output.Html
import typingsJapgolly.poi.poiStrings.`async-node`
import typingsJapgolly.poi.poiStrings.`electron-main`
import typingsJapgolly.poi.poiStrings.`electron-renderer`
import typingsJapgolly.poi.poiStrings.`node-webkit`
import typingsJapgolly.poi.poiStrings.cjs
import typingsJapgolly.poi.poiStrings.electron
import typingsJapgolly.poi.poiStrings.iife
import typingsJapgolly.poi.poiStrings.node
import typingsJapgolly.poi.poiStrings.umd
import typingsJapgolly.poi.poiStrings.web
import typingsJapgolly.poi.poiStrings.webworker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output_ extends js.Object {
  var clean: js.UndefOr[Boolean] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var fileNames: js.UndefOr[FileNames] = js.undefined
  var format: js.UndefOr[iife | cjs | umd] = js.undefined
  var html: js.UndefOr[Html] = js.undefined
  var minimize: js.UndefOr[Boolean] = js.undefined
  var moduleName: js.UndefOr[String] = js.undefined
  var publicUrl: js.UndefOr[String] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[
    web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
  ] = js.undefined
}

object Output_ {
  @scala.inline
  def apply(
    clean: js.UndefOr[Boolean] = js.undefined,
    dir: String = null,
    fileNames: FileNames = null,
    format: iife | cjs | umd = null,
    html: Html = null,
    minimize: js.UndefOr[Boolean] = js.undefined,
    moduleName: String = null,
    publicUrl: String = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    target: web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker = null
  ): Output_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (fileNames != null) __obj.updateDynamic("fileNames")(fileNames.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName.asInstanceOf[js.Any])
    if (publicUrl != null) __obj.updateDynamic("publicUrl")(publicUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output_]
  }
}

