package typingsJapgolly.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.forgeDi.argumentsMod.Arguments
import typingsJapgolly.forgeDi.configMod.Config
import typingsJapgolly.forgeDi.inspectorMod.Inspector
import typingsJapgolly.forgeDi.modeMod.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/Forge", JSImport.Namespace)
@js.native
object forgeMod extends js.Object {
  @js.native
  trait Forge extends js.Object {
    var bindings: StringDictionary[js.Array[typingsJapgolly.forgeDi.bindingMod.default]] = js.native
    var getMatchingBindings: js.Any = js.native
    var inspector: Inspector = js.native
    def bind(name: String): typingsJapgolly.forgeDi.bindingMod.default = js.native
    def get[T](name: String): T = js.native
    def get[T](name: String, hint: js.Any): T = js.native
    def get[T](name: String, hint: js.Any, args: Arguments): T = js.native
    def getAll[T](name: String): js.Array[T] = js.native
    def getAll[T](name: String, args: Arguments): js.Array[T] = js.native
    def getOne[T](name: String): T = js.native
    def getOne[T](name: String, hint: js.Any): T = js.native
    def getOne[T](name: String, hint: js.Any, args: Arguments): T = js.native
    def inspect(): String = js.native
    def rebind(name: String): typingsJapgolly.forgeDi.bindingMod.default = js.native
    def resolve(name: String, context: typingsJapgolly.forgeDi.contextMod.default, hint: js.Any, args: Arguments): js.Any = js.native
    def resolve(
      name: String,
      context: typingsJapgolly.forgeDi.contextMod.default,
      hint: js.Any,
      args: Arguments,
      mode: Mode
    ): js.Any = js.native
    def unbind(name: String): Double = js.native
  }
  
  @js.native
  class default () extends Forge {
    def this(config: Config) = this()
  }
  
}

