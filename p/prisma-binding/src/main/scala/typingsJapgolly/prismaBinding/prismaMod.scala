package typingsJapgolly.prismaBinding

import typingsJapgolly.graphqlBinding.mod.Binding
import typingsJapgolly.prismaBinding.typesMod.Exists
import typingsJapgolly.prismaBinding.typesMod.PrismaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prisma-binding/dist/Prisma", JSImport.Namespace)
@js.native
object prismaMod extends js.Object {
  @js.native
  class Prisma protected () extends Binding {
    def this(hasTypeDefsEndpointSecretFragmentReplacementsDebugDisableCache: PrismaOptions) = this()
    var buildExists: js.Any = js.native
    var exists: Exists = js.native
  }
  
}

