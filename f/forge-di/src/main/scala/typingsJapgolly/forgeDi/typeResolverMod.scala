package typingsJapgolly.forgeDi

import typingsJapgolly.forgeDi.constructorMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Namespace)
@js.native
object typeResolverMod extends js.Object {
  @js.native
  trait TypeResolver
    extends typingsJapgolly.forgeDi.resolverMod.default {
    var `type`: Constructor = js.native
  }
  
  @js.native
  class default protected () extends TypeResolver {
    def this(
      forge: typingsJapgolly.forgeDi.forgeMod.default,
      binding: typingsJapgolly.forgeDi.bindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
}

