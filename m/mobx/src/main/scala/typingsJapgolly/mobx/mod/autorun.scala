package typingsJapgolly.mobx.mod

import typingsJapgolly.mobx.autorunMod.IAutorunOptions
import typingsJapgolly.mobx.reactionMod.IReactionDisposer
import typingsJapgolly.mobx.reactionMod.IReactionPublic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx", "autorun")
@js.native
object autorun extends js.Object {
  def apply(view: js.Function1[/* r */ IReactionPublic, _]): IReactionDisposer = js.native
  def apply(view: js.Function1[/* r */ IReactionPublic, _], opts: IAutorunOptions): IReactionDisposer = js.native
}

