package typingsJapgolly.webpackBundleAnalyzer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BundleAnalyzerPlugin {
  type ExcludeAssetsPattern = java.lang.String | js.RegExp | typingsJapgolly.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.ExcludeAssetsPatternFn
  type ExcludeAssetsPatternFn = js.Function1[/* assetName */ java.lang.String, scala.Boolean]
}
