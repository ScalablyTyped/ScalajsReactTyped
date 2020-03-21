package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.BindingScope
import typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/bindings/binding", JSImport.Namespace)
@js.native
object bindingMod extends js.Object {
  @js.native
  class Binding[T] protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
  
}

