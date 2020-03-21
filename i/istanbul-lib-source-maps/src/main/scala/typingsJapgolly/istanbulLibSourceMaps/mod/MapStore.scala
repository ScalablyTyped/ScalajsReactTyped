package typingsJapgolly.istanbulLibSourceMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.istanbulLibCoverage.mod.CoverageMap
import typingsJapgolly.istanbulLibSourceMaps.AnonData
import typingsJapgolly.istanbulLibSourceMaps.AnonMap
import typingsJapgolly.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStore extends js.Object {
  var baseDir: String | Null
  var data: StringDictionary[AnonData]
  var sourceStore: SourceStore
  var verbose: Boolean
  def dispose(): Unit
  def registerMap(filename: String, sourceMap: RawSourceMap): Unit
  def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit
  def transformCoverage(coverageMap: CoverageMap): AnonMap
}

object MapStore {
  @scala.inline
  def apply(
    data: StringDictionary[AnonData],
    dispose: Callback,
    registerMap: (String, RawSourceMap) => Callback,
    registerURL: (String, String) => Callback,
    sourceStore: SourceStore,
    transformCoverage: CoverageMap => CallbackTo[AnonMap],
    verbose: Boolean,
    baseDir: String = null
  ): MapStore = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sourceStore = sourceStore.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("registerMap")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.sourceMap.mod.RawSourceMap) => registerMap(t0, t1).runNow()))
    __obj.updateDynamic("registerURL")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => registerURL(t0, t1).runNow()))
    __obj.updateDynamic("transformCoverage")(js.Any.fromFunction1((t0: typingsJapgolly.istanbulLibCoverage.mod.CoverageMap) => transformCoverage(t0).runNow()))
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStore]
  }
}

