package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.coreObservableMod.IObservable
import typingsJapgolly.mobx.derivationMod.IDerivation
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "getObservers")
@js.native
object getObservers extends js.Object {
  def apply(observable: IObservable): Set[IDerivation] = js.native
}

