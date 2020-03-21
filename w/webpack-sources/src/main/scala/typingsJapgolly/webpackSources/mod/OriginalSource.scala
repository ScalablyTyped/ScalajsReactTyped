package typingsJapgolly.webpackSources.mod

import typingsJapgolly.sourceMap.mod.RawSourceMap
import typingsJapgolly.sourceMap.mod.SourceNode
import typingsJapgolly.webpackSources.AnonColumns
import typingsJapgolly.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "OriginalSource")
@js.native
class OriginalSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(value: String, name: String) = this()
  var _name: String = js.native
  var _value: String = js.native
  /* CompleteClass */
  override def map(options: AnonColumns): RawSourceMap = js.native
  def node(options: AnonColumns): SourceNode = js.native
  /* CompleteClass */
  override def sourceAndMap(options: AnonColumns): AnonMap = js.native
}

