package typingsJapgolly.forgeDi.lifecycleMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeDi.argumentsMod.Arguments
import typingsJapgolly.forgeDi.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycle extends js.Object {
  def resolve(resolver: default, context: typingsJapgolly.forgeDi.contextMod.default, args: Arguments): js.Any
}

object Lifecycle {
  @scala.inline
  def apply(resolve: (default, typingsJapgolly.forgeDi.contextMod.default, Arguments) => CallbackTo[js.Any]): Lifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resolve")(js.Any.fromFunction3((t0: typingsJapgolly.forgeDi.resolverMod.default, t1: typingsJapgolly.forgeDi.contextMod.default, t2: typingsJapgolly.forgeDi.argumentsMod.Arguments) => resolve(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Lifecycle]
  }
}

