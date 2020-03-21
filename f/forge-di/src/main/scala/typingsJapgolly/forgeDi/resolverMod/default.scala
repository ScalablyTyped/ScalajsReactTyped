package typingsJapgolly.forgeDi.resolverMod

import typingsJapgolly.forgeDi.argumentsMod.Arguments
import typingsJapgolly.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/resolvers/Resolver", JSImport.Default)
@js.native
abstract class default protected () extends Resolver {
  def this(
    forge: typingsJapgolly.forgeDi.forgeMod.default,
    binding: typingsJapgolly.forgeDi.bindingMod.default
  ) = this()
  /* CompleteClass */
  override var binding: typingsJapgolly.forgeDi.bindingMod.default = js.native
  /* CompleteClass */
  override var dependencies: js.Array[Dependency] = js.native
  /* CompleteClass */
  override var forge: typingsJapgolly.forgeDi.forgeMod.default = js.native
  /* CompleteClass */
  override def resolve(context: typingsJapgolly.forgeDi.contextMod.default, args: Arguments): js.Any = js.native
  /* CompleteClass */
  /* protected */ override def resolveDependencies(
    context: typingsJapgolly.forgeDi.contextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any = js.native
}

