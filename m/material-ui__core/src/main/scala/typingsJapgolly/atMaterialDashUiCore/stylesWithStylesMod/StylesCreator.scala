package typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atMaterialDashUiCore.Anon_Index
import typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StylesCreator extends js.Object {
  var options: Anon_Index
  var themingEnabled: Boolean
  def create(theme: Theme, name: String): StyleRules[String]
}

object StylesCreator {
  @scala.inline
  def apply(
    create: (Theme, String) => CallbackTo[StyleRules[String]],
    options: Anon_Index,
    themingEnabled: Boolean
  ): StylesCreator = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], themingEnabled = themingEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme, t1: java.lang.String) => create(t0, t1).runNow()))
    __obj.asInstanceOf[StylesCreator]
  }
}

