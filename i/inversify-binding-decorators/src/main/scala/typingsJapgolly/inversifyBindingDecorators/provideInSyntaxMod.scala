package typingsJapgolly.inversifyBindingDecorators

import typingsJapgolly.inversify.interfacesMod.interfaces.Bind
import typingsJapgolly.inversify.interfacesMod.interfaces.BindingInSyntax
import typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_in_syntax", JSImport.Namespace)
@js.native
object provideInSyntaxMod extends js.Object {
  @js.native
  trait ProvideInSyntax[T]
    extends typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInSyntax[T] {
    var _bindingInSyntax: js.Any = js.native
    var _provideDoneSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideInSyntax[T] {
    def this(
      bindingInSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingInSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
}

