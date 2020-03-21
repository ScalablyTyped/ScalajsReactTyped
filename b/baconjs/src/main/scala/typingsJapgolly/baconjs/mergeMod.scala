package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.EventStream
import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  def mergeAll[V](streams: (default[V] | js.Array[default[V]])*): EventStream[V] = js.native
}

