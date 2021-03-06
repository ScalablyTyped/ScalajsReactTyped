package typingsJapgolly.inversifyBindingDecorators

import typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInSyntax
import typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.ProvideOnSyntax
import typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.ProvideWhenSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_in_when_on_syntax", JSImport.Namespace)
@js.native
object provideInWhenOnSyntaxMod extends js.Object {
  @js.native
  trait ProvideInWhenOnSyntax[T]
    extends ProvideInSyntax[T]
       with ProvideWhenSyntax[T]
       with ProvideOnSyntax[T] {
    var _provideInSyntax: js.Any = js.native
    var _provideOnSyntax: js.Any = js.native
    var _provideWhenSyntax: js.Any = js.native
  }
  
  @js.native
  class default[T] protected () extends ProvideInWhenOnSyntax[T] {
    def this(
      provideInSyntax: ProvideInSyntax[T],
      provideWhenSyntax: ProvideWhenSyntax[T],
      provideOnSyntax: ProvideOnSyntax[T]
    ) = this()
  }
  
}

