package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingOnSyntax[T] extends js.Object {
  def onActivation(fn: js.Function2[/* context */ Context, /* injectable */ T, T]): BindingWhenSyntax[T]
}

object BindingOnSyntax {
  @scala.inline
  def apply[T](
    onActivation: js.Function2[/* context */ Context, /* injectable */ T, T] => CallbackTo[BindingWhenSyntax[T]]
  ): BindingOnSyntax[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onActivation")(js.Any.fromFunction1((t0: js.Function2[
  /* context */ typingsJapgolly.inversify.interfacesMod.interfaces.Context, 
  /* injectable */ T, 
  T]) => onActivation(t0).runNow()))
    __obj.asInstanceOf[BindingOnSyntax[T]]
  }
}

