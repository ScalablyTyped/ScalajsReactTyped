package typingsJapgolly.mobx.internalMod

import typingsJapgolly.mobx.Promisevoidcancelvoid
import typingsJapgolly.mobx.reactionMod.IReactionDisposer
import typingsJapgolly.mobx.utilsMod.Lambda
import typingsJapgolly.mobx.whenMod.IWhenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "when")
@js.native
object when extends js.Object {
  def apply(predicate: js.Function0[Boolean]): Promisevoidcancelvoid = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], effect: Lambda, opts: IWhenOptions): IReactionDisposer = js.native
  def apply(predicate: js.Function0[Boolean], opts: IWhenOptions): Promisevoidcancelvoid = js.native
}

