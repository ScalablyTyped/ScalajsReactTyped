package typingsJapgolly.coreJs.libraryFnMapMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.Map
import typingsJapgolly.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/map", JSImport.Namespace)
@js.native
class ^[K, V] () extends Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
}

@JSImport("core-js/library/fn/map", JSImport.Namespace)
@js.native
object ^ extends TopLevel[MapConstructor]

