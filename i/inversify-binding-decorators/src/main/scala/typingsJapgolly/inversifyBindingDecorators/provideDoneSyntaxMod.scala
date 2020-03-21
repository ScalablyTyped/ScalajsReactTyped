package typingsJapgolly.inversifyBindingDecorators

import typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.BindConstraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators/dts/syntax/provide_done_syntax", JSImport.Namespace)
@js.native
object provideDoneSyntaxMod extends js.Object {
  @js.native
  trait ProvideDoneSyntax
    extends typingsJapgolly.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax {
    var _binding: js.Any = js.native
  }
  
  @js.native
  class default protected () extends ProvideDoneSyntax {
    def this(binding: BindConstraint) = this()
  }
  
}

