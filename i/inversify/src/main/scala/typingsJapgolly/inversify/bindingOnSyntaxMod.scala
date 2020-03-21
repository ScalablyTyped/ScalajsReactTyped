package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Binding
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typingsJapgolly.inversify.interfacesMod.interfaces.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_on_syntax", JSImport.Namespace)
@js.native
object bindingOnSyntaxMod extends js.Object {
  @js.native
  class BindingOnSyntax[T] protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
  
}

