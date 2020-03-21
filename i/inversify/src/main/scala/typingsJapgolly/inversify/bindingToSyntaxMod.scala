package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Abstract
import typingsJapgolly.inversify.interfacesMod.interfaces.Binding
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingInWhenOnSyntax
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingWhenOnSyntax
import typingsJapgolly.inversify.interfacesMod.interfaces.Context
import typingsJapgolly.inversify.interfacesMod.interfaces.FactoryCreator
import typingsJapgolly.inversify.interfacesMod.interfaces.Newable
import typingsJapgolly.inversify.interfacesMod.interfaces.ProviderCreator
import typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_to_syntax", JSImport.Namespace)
@js.native
object bindingToSyntaxMod extends js.Object {
  @js.native
  class BindingToSyntax[T] protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.BindingToSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    /* CompleteClass */
    override def to(constructor: AnonInstantiable[T]): BindingInWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toConstantValue(value: T): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toFunction(func: T): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toSelf(): BindingInWhenOnSyntax[T] = js.native
    def toService(service: String): Unit = js.native
    def toService(service: js.Symbol): Unit = js.native
    def toService(service: Abstract[T]): Unit = js.native
    def toService(service: Newable[T]): Unit = js.native
    /* CompleteClass */
    override def toService(service: ServiceIdentifier[T]): Unit = js.native
  }
  
}

