package typingsJapgolly.webpackSources.mod

import typingsJapgolly.sourceMap.mod.RawSourceMap
import typingsJapgolly.webpackSources.AnonColumns
import typingsJapgolly.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "LineToLineMappedSource")
@js.native
class LineToLineMappedSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String, originalSource: String) = this()
  var _name: String = js.native
  var _originalSource: String = js.native
  var _value: String = js.native
  /* CompleteClass */
  override def map(options: AnonColumns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: AnonColumns): AnonMap = js.native
}

