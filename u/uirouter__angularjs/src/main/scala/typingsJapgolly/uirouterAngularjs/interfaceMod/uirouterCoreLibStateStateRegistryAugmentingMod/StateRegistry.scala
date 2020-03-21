package typingsJapgolly.uirouterAngularjs.interfaceMod.uirouterCoreLibStateStateRegistryAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.uirouterAngularjs.interfaceMod.Ng1StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateRegistry extends js.Object {
  def register(state: Ng1StateDeclaration): js.Any
}

object StateRegistry {
  @scala.inline
  def apply(register: Ng1StateDeclaration => CallbackTo[js.Any]): StateRegistry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.uirouterAngularjs.interfaceMod.Ng1StateDeclaration) => register(t0).runNow()))
    __obj.asInstanceOf[StateRegistry]
  }
}

