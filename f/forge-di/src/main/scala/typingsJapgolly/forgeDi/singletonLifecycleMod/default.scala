package typingsJapgolly.forgeDi.singletonLifecycleMod

import typingsJapgolly.forgeDi.argumentsMod.Arguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/lifecycles/SingletonLifecycle", JSImport.Default)
@js.native
class default () extends SingletonLifecycle {
  /* CompleteClass */
  override var instance: js.Any = js.native
  /* CompleteClass */
  override def resolve(
    resolver: typingsJapgolly.forgeDi.resolverMod.default,
    context: typingsJapgolly.forgeDi.contextMod.default,
    args: Arguments
  ): js.Any = js.native
}

