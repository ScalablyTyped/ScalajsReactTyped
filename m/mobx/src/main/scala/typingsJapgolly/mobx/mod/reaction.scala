package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.autorunMod.IReactionOptions
import typingsJapgolly.mobx.reactionMod.IReactionDisposer
import typingsJapgolly.mobx.reactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "reaction")
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

