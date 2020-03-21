package typingsJapgolly.istanbulLibReport.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMap
import typingsJapgolly.istanbulLibReport.PartialWatermarks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextOptions extends js.Object {
  var coverageMap: CoverageMap
  var defaultSummarizer: Summarizers
  var dir: String
  var watermarks: PartialWatermarks
  def sourceFinder(filepath: String): String
}

object ContextOptions {
  @scala.inline
  def apply(
    coverageMap: CoverageMap,
    defaultSummarizer: Summarizers,
    dir: String,
    sourceFinder: String => CallbackTo[String],
    watermarks: PartialWatermarks
  ): ContextOptions = {
    val __obj = js.Dynamic.literal(coverageMap = coverageMap.asInstanceOf[js.Any], defaultSummarizer = defaultSummarizer.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], watermarks = watermarks.asInstanceOf[js.Any])
    __obj.updateDynamic("sourceFinder")(js.Any.fromFunction1((t0: java.lang.String) => sourceFinder(t0).runNow()))
    __obj.asInstanceOf[ContextOptions]
  }
}

