package typingsJapgolly.emberApplication

import typingsJapgolly.emberObject.typesMod.EmberClassConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/-private/registry", JSImport.Namespace)
@js.native
object registryMod extends js.Object {
  @js.native
  trait Registry extends js.Object {
    def register(fullName: String, factory: EmberClassConstructor[_]): Unit = js.native
    def register(fullName: String, factory: EmberClassConstructor[_], options: AnonSingleton): Unit = js.native
  }
  
  @js.native
  class default () extends Registry
  
}

