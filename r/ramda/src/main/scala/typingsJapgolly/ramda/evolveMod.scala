package typingsJapgolly.ramda

import typingsJapgolly.ramda.toolsMod.Evolvable
import typingsJapgolly.ramda.toolsMod.Evolve
import typingsJapgolly.ramda.toolsMod.Evolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ramda/src/evolve", JSImport.Namespace)
@js.native
object evolveMod extends js.Object {
  def default[E /* <: Evolver[_] */](transformations: E): js.Function1[/* obj */ Evolvable[E], Evolve[Evolvable[E], E]] = js.native
  def default[E /* <: Evolver[_] */, V /* <: Evolvable[E] */](transformations: E, obj: V): Evolve[V, E] = js.native
}

