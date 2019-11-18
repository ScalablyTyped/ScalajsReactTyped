package typingsJapgolly.coreDashJs.fnWeakDashMapMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.WeakMap
import typingsJapgolly.std.WeakMapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/weak-map", JSImport.Namespace)
@js.native
class ^[K /* <: js.Object */, V] () extends WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}

@JSImport("core-js/fn/weak-map", JSImport.Namespace)
@js.native
object ^ extends TopLevel[WeakMapConstructor]

