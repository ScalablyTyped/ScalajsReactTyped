package typingsJapgolly.hyperlorisTyson.typeAdapterFactoryMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hyperlorisTyson.mod.Tyson
import typingsJapgolly.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typingsJapgolly.hyperlorisTyson.typeTokenMod.TypeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeAdapterFactory extends js.Object {
  def create[T](tyson: Tyson, typeToken: TypeToken[T]): js.UndefOr[TypeAdapter[T]]
}

object TypeAdapterFactory {
  @scala.inline
  def apply(create: (Tyson, TypeToken[js.Any]) => CallbackTo[js.UndefOr[TypeAdapter[js.Any]]]): TypeAdapterFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.hyperlorisTyson.mod.Tyson, t1: typingsJapgolly.hyperlorisTyson.typeTokenMod.TypeToken[js.Any]) => create(t0, t1).runNow()))
    __obj.asInstanceOf[TypeAdapterFactory]
  }
}

