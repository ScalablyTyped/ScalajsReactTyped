package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.eventMod.End
import typingsJapgolly.baconjs.transformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/mapend", JSImport.Namespace)
@js.native
object mapendMod extends js.Object {
  def default[V](f: V): Transformer[V, V] = js.native
  def default[V](f: js.Function1[/* end */ End, V]): Transformer[V, V] = js.native
}

