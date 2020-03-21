package typingsJapgolly.reduxSagaCore.effectsMod

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxSagaCore.typesMod.PuttableChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "put")
@js.native
object put extends js.Object {
  def apply[A /* <: Action[_] */](action: A): PutEffect[A] = js.native
  def apply[T](channel: PuttableChannel[T], action: T): ChannelPutEffect[T] = js.native
  def apply[T](
    channel: PuttableChannel[T],
    action: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify END */ js.Any
  ): ChannelPutEffect[T] = js.native
}

