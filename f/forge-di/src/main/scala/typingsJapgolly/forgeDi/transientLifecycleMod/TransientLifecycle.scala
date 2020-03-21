package typingsJapgolly.forgeDi.transientLifecycleMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeDi.argumentsMod.Arguments
import typingsJapgolly.forgeDi.lifecycleMod.Lifecycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransientLifecycle extends Lifecycle

object TransientLifecycle {
  @scala.inline
  def apply(
    resolve: (typingsJapgolly.forgeDi.resolverMod.default, typingsJapgolly.forgeDi.contextMod.default, Arguments) => CallbackTo[js.Any]
  ): TransientLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(js.Any.fromFunction3((t0: typingsJapgolly.forgeDi.resolverMod.default, t1: typingsJapgolly.forgeDi.contextMod.default, t2: typingsJapgolly.forgeDi.argumentsMod.Arguments) => resolve(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TransientLifecycle]
  }
}

