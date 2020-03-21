package typingsJapgolly.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Namespace)
@js.native
object functionResolverMod extends js.Object {
  @js.native
  trait FunctionResolver
    extends typingsJapgolly.forgeDi.resolverMod.default {
    var func: js.Function = js.native
  }
  
  @js.native
  class default protected () extends FunctionResolver {
    def this(
      forge: typingsJapgolly.forgeDi.forgeMod.default,
      binding: typingsJapgolly.forgeDi.bindingMod.default,
      func: js.Function
    ) = this()
  }
  
}

