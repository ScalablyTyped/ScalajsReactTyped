package typingsJapgolly.inversify.interfacesMod.interfaces

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inversify.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingToSyntax[T] extends js.Object {
  def to(constructor: AnonInstantiable[T]): BindingInWhenOnSyntax[T]
  def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T]
  def toConstantValue(value: T): BindingWhenOnSyntax[T]
  def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T]
  def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T]
  def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T]
  def toFunction(func: T): BindingWhenOnSyntax[T]
  def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T]
  def toSelf(): BindingInWhenOnSyntax[T]
  def toService(service: ServiceIdentifier[T]): Unit
}

object BindingToSyntax {
  @scala.inline
  def apply[T](
    to: AnonInstantiable[T] => CallbackTo[BindingInWhenOnSyntax[T]],
    toAutoFactory: ServiceIdentifier[js.Any] => CallbackTo[BindingWhenOnSyntax[T]],
    toConstantValue: T => CallbackTo[BindingWhenOnSyntax[T]],
    toConstructor: Newable[js.Any] => CallbackTo[BindingWhenOnSyntax[T]],
    toDynamicValue: js.Function1[/* context */ Context, T] => CallbackTo[BindingInWhenOnSyntax[T]],
    toFactory: FactoryCreator[js.Any] => CallbackTo[BindingWhenOnSyntax[T]],
    toFunction: T => CallbackTo[BindingWhenOnSyntax[T]],
    toProvider: ProviderCreator[js.Any] => CallbackTo[BindingWhenOnSyntax[T]],
    toSelf: CallbackTo[BindingInWhenOnSyntax[T]],
    toService: ServiceIdentifier[T] => Callback
  ): BindingToSyntax[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.AnonInstantiable[T]) => to(t0).runNow()))
    __obj.updateDynamic("toAutoFactory")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[js.Any]) => toAutoFactory(t0).runNow()))
    __obj.updateDynamic("toConstantValue")(js.Any.fromFunction1((t0: T) => toConstantValue(t0).runNow()))
    __obj.updateDynamic("toConstructor")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.Newable[js.Any]) => toConstructor(t0).runNow()))
    __obj.updateDynamic("toDynamicValue")(js.Any.fromFunction1((t0: js.Function1[/* context */ typingsJapgolly.inversify.interfacesMod.interfaces.Context, T]) => toDynamicValue(t0).runNow()))
    __obj.updateDynamic("toFactory")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.FactoryCreator[js.Any]) => toFactory(t0).runNow()))
    __obj.updateDynamic("toFunction")(js.Any.fromFunction1((t0: T) => toFunction(t0).runNow()))
    __obj.updateDynamic("toProvider")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ProviderCreator[js.Any]) => toProvider(t0).runNow()))
    __obj.updateDynamic("toSelf")(toSelf.toJsFn)
    __obj.updateDynamic("toService")(js.Any.fromFunction1((t0: typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier[T]) => toService(t0).runNow()))
    __obj.asInstanceOf[BindingToSyntax[T]]
  }
}

