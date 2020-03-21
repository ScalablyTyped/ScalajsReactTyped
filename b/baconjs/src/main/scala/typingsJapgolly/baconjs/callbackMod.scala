package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/callback", JSImport.Namespace)
@js.native
object callbackMod extends js.Object {
  def fromCallback[V](f: js.Function, args: js.Any*): EventStream[V] = js.native
  def fromNodeCallback[V](f: js.Function, args: js.Any*): EventStream[V] = js.native
}

