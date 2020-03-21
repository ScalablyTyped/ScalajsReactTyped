package typingsJapgolly.webpackSources.mod

import typingsJapgolly.sourceMap.mod.RawSourceMap
import typingsJapgolly.webpackSources.AnonColumns
import typingsJapgolly.webpackSources.AnonMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-sources", "ConcatSource")
@js.native
class ConcatSource protected ()
  extends Source
     with SourceAndMapMixin {
  def this(args: (String | Source)*) = this()
  var children: js.Array[String | Source] = js.native
  def add(item: String): Unit = js.native
  def add(item: Source): Unit = js.native
  /* CompleteClass */
  override def map(options: AnonColumns): RawSourceMap = js.native
  /* CompleteClass */
  override def sourceAndMap(options: AnonColumns): AnonMap = js.native
}

