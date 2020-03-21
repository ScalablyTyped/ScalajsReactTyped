package typingsJapgolly.tensorflowTfjsCore.jasmineUtilMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.environmentMod.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraints extends js.Object {
  var flags: js.UndefOr[Flags] = js.undefined
  var predicate: js.UndefOr[js.Function1[/* testEnv */ TestEnv, Boolean]] = js.undefined
}

object Constraints {
  @scala.inline
  def apply(flags: Flags = null, predicate: /* testEnv */ TestEnv => CallbackTo[Boolean] = null): Constraints = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1((t0: /* testEnv */ typingsJapgolly.tensorflowTfjsCore.jasmineUtilMod.TestEnv) => predicate(t0).runNow()))
    __obj.asInstanceOf[Constraints]
  }
}

