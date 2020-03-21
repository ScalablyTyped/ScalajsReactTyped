package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Binding
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingOnSyntax
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typingsJapgolly.inversify.interfacesMod.interfaces.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_when_on_syntax", JSImport.Namespace)
@js.native
object bindingWhenOnSyntaxMod extends js.Object {
  @js.native
  class BindingWhenOnSyntax[T] protected ()
    extends BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    var _bindingOnSyntax: js.Any = js.native
    var _bindingWhenSyntax: js.Any = js.native
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
  
}

