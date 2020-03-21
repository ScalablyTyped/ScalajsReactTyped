package typingsJapgolly.forgeDi.inspectorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeDi.constructorMod.Constructor
import typingsJapgolly.forgeDi.dependencyMod.Dependency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inspector extends js.Object {
  def findConstructor(func: Constructor): Constructor
  def getDependencies(func: js.Function): js.Array[Dependency]
}

object Inspector {
  @scala.inline
  def apply(
    findConstructor: Constructor => CallbackTo[Constructor],
    getDependencies: js.Function => CallbackTo[js.Array[Dependency]]
  ): Inspector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findConstructor")(js.Any.fromFunction1((t0: typingsJapgolly.forgeDi.constructorMod.Constructor) => findConstructor(t0).runNow()))
    __obj.updateDynamic("getDependencies")(js.Any.fromFunction1((t0: js.Function) => getDependencies(t0).runNow()))
    __obj.asInstanceOf[Inspector]
  }
}

