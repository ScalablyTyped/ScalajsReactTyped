package typingsJapgolly.webpackSources.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sourceMap.mod.RawSourceMap
import typingsJapgolly.webpackSources.AnonColumns
import typingsJapgolly.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndMapMixin extends js.Object {
  def map(options: AnonColumns): RawSourceMap
  def sourceAndMap(options: AnonColumns): AnonMap
}

object SourceAndMapMixin {
  @scala.inline
  def apply(map: AnonColumns => CallbackTo[RawSourceMap], sourceAndMap: AnonColumns => CallbackTo[AnonMap]): SourceAndMapMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: typingsJapgolly.webpackSources.AnonColumns) => map(t0).runNow()))
    __obj.updateDynamic("sourceAndMap")(js.Any.fromFunction1((t0: typingsJapgolly.webpackSources.AnonColumns) => sourceAndMap(t0).runNow()))
    __obj.asInstanceOf[SourceAndMapMixin]
  }
}

