package typingsJapgolly.materialUiCore.withStylesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialUiCore.AnonIndex
import typingsJapgolly.materialUiCore.createMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylesCreator extends js.Object {
  var options: AnonIndex = js.native
  var themingEnabled: Boolean = js.native
  def create(theme: Theme, name: String): StyleRules[String] = js.native
}

object StylesCreator {
  @scala.inline
  def apply(
    create: (Theme, String) => CallbackTo[StyleRules[String]],
    options: AnonIndex,
    themingEnabled: Boolean
  ): StylesCreator = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.materialUiCore.createMuiThemeMod.Theme, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.asInstanceOf[StylesCreator]
  }
}

