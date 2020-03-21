package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.derivationMod.IDerivation
import typingsJapgolly.mobx.reactionMod.Reaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "Reaction")
@js.native
class Reaction_ protected () extends Reaction {
  def this(name: String, onInvalidate: js.Function0[Unit]) = this()
  def this(
    name: String,
    onInvalidate: js.Function0[Unit],
    errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit]
  ) = this()
  def this(
    name: String,
    onInvalidate: js.Function0[Unit],
    errorHandler: js.UndefOr[scala.Nothing],
    requiresObservable: Boolean
  ) = this()
  def this(
    name: String,
    onInvalidate: js.Function0[Unit],
    errorHandler: js.Function2[/* error */ js.Any, /* derivation */ IDerivation, Unit],
    requiresObservable: Boolean
  ) = this()
}

