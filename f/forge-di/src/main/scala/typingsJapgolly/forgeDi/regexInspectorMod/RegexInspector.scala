package typingsJapgolly.forgeDi.regexInspectorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeDi.constructorMod.Constructor
import typingsJapgolly.forgeDi.dependencyMod.Dependency
import typingsJapgolly.forgeDi.inspectorMod.Inspector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegexInspector extends Inspector {
  var getParameterNames: js.Any
}

object RegexInspector {
  @scala.inline
  def apply(
    findConstructor: Constructor => CallbackTo[Constructor],
    getDependencies: js.Function => CallbackTo[js.Array[Dependency]],
    getParameterNames: js.Any
  ): RegexInspector = {
    val __obj = js.Dynamic.literal(getParameterNames = getParameterNames.asInstanceOf[js.Any])
    __obj.updateDynamic("findConstructor")(js.Any.fromFunction1((t0: typingsJapgolly.forgeDi.constructorMod.Constructor) => findConstructor(t0).runNow()))
    __obj.updateDynamic("getDependencies")(js.Any.fromFunction1((t0: js.Function) => getDependencies(t0).runNow()))
    __obj.asInstanceOf[RegexInspector]
  }
}

