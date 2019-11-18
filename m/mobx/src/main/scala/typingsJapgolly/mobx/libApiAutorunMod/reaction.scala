package typingsJapgolly.mobx.libApiAutorunMod

import typingsJapgolly.mobx.libCoreReactionMod.IReactionDisposer
import typingsJapgolly.mobx.libCoreReactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/autorun", "reaction")
@js.native
object reaction extends js.Object {
  def apply[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit]
  ): IReactionDisposer = js.native
  def apply[T](
    expression: js.Function1[/* r */ IReactionPublic, T],
    effect: js.Function2[/* arg */ T, /* r */ IReactionPublic, Unit],
    opts: IReactionOptions
  ): IReactionDisposer = js.native
}

