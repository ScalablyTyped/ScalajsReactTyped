package typingsJapgolly.es6Shim

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Map")
@js.native
class MapCls[K, V] () extends Map[K, V] {
  def this(iterable: IterableShim[js.Tuple2[K, V]]) = this()
}

