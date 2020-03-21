package typingsJapgolly.forgeDi.resolverMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeDi.argumentsMod.Arguments
import typingsJapgolly.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  var binding: typingsJapgolly.forgeDi.bindingMod.default
  var dependencies: js.Array[Dependency]
  var forge: typingsJapgolly.forgeDi.forgeMod.default
  def resolve(context: typingsJapgolly.forgeDi.contextMod.default, args: Arguments): js.Any
  /* protected */ def resolveDependencies(
    context: typingsJapgolly.forgeDi.contextMod.default,
    dependencies: js.Array[Dependency],
    args: Arguments
  ): js.Any
}

object Resolver {
  @scala.inline
  def apply(
    binding: typingsJapgolly.forgeDi.bindingMod.default,
    dependencies: js.Array[Dependency],
    forge: typingsJapgolly.forgeDi.forgeMod.default,
    resolve: (typingsJapgolly.forgeDi.contextMod.default, Arguments) => CallbackTo[js.Any],
    resolveDependencies: (typingsJapgolly.forgeDi.contextMod.default, js.Array[Dependency], Arguments) => CallbackTo[js.Any]
  ): Resolver = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], forge = forge.asInstanceOf[js.Any])
    __obj.updateDynamic("resolve")(js.Any.fromFunction2((t0: typingsJapgolly.forgeDi.contextMod.default, t1: typingsJapgolly.forgeDi.argumentsMod.Arguments) => resolve(t0, t1).runNow()))
    __obj.updateDynamic("resolveDependencies")(js.Any.fromFunction3((t0: typingsJapgolly.forgeDi.contextMod.default, t1: js.Array[typingsJapgolly.forgeDi.dependencyMod.Dependency], t2: typingsJapgolly.forgeDi.argumentsMod.Arguments) => resolveDependencies(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Resolver]
  }
}

