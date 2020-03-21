package typingsJapgolly.grommet.themeContextMod

import typingsJapgolly.grommet.AnonValueThemeValue
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeContextI extends Context[ThemeValue] {
  var Extend: FC[AnonValueThemeValue]
}

object ThemeContextI {
  @scala.inline
  def apply(
    Consumer: Consumer[ThemeValue],
    Extend: FC[AnonValueThemeValue],
    Provider: Provider[ThemeValue],
    displayName: String = null
  ): ThemeContextI = {
    val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Extend = Extend.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeContextI]
  }
}

