package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.observableMod.EventStream
import typingsJapgolly.baconjs.observableMod.Property
import typingsJapgolly.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/sample", JSImport.Namespace)
@js.native
object sampleMod extends js.Object {
  def sampleP[V](samplee: Property[V], samplingInterval: Double): EventStream[V] = js.native
  def sampledBy[V, V2, R](samplee: default[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = js.native
  def sampledByE[V, V2, R](samplee: EventStream[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = js.native
  def sampledByP[V, V2, R](samplee: Property[V], sampler: default[V2], f: Combinator[V, V2, R]): default[R] = js.native
  type Combinator[V, V2, R] = js.Function2[/* x */ V, /* y */ V2, R]
}

