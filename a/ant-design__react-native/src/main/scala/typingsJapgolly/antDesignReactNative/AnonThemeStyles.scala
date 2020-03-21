package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeStyles extends js.Object {
  def themeStyles(): Unit
}

object AnonThemeStyles {
  @scala.inline
  def apply(themeStyles: Callback): AnonThemeStyles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("themeStyles")(themeStyles.toJsFn)
    __obj.asInstanceOf[AnonThemeStyles]
  }
}

