package typingsJapgolly.atAngularCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atAngularCore.atAngularCoreStrings.any
import typingsJapgolly.atAngularCore.atAngularCoreStrings.root
import typingsJapgolly.atAngularCore.srcR3UnderscoreSymbolsMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnyFactory[T] extends js.Object {
  var providedIn: js.UndefOr[Type[_] | root | any | Null] = js.undefined
  var token: js.Any
  def factory(): T
}

object Anon_AnyFactory {
  @scala.inline
  def apply[T](factory: CallbackTo[T], token: js.Any, providedIn: Type[_] | root | any = null): Anon_AnyFactory[T] = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("factory")(factory.toJsFn)
    if (providedIn != null) __obj.updateDynamic("providedIn")(providedIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AnyFactory[T]]
  }
}

