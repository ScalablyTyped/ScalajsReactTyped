package typingsJapgolly.reactNativeElements.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[P, T](component: ComponentType[P with ThemeProps[T]]): ComponentClassP[(Omit[P, String]) with js.Object] = js.native
}

