package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingInSyntax[T] extends js.Object {
  def inRequestScope(): BindingWhenOnSyntax[T]
  def inSingletonScope(): BindingWhenOnSyntax[T]
  def inTransientScope(): BindingWhenOnSyntax[T]
}

object BindingInSyntax {
  @scala.inline
  def apply[T](
    inRequestScope: CallbackTo[BindingWhenOnSyntax[T]],
    inSingletonScope: CallbackTo[BindingWhenOnSyntax[T]],
    inTransientScope: CallbackTo[BindingWhenOnSyntax[T]]
  ): BindingInSyntax[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inRequestScope")(inRequestScope.toJsFn)
    __obj.updateDynamic("inSingletonScope")(inSingletonScope.toJsFn)
    __obj.updateDynamic("inTransientScope")(inTransientScope.toJsFn)
    __obj.asInstanceOf[BindingInSyntax[T]]
  }
}

