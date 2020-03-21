package typingsJapgolly.reactJsonschemaForm.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form", "withTheme")
@js.native
object withTheme extends js.Object {
  def apply[T](themeProps: ThemeProps[T]): (ComponentClassP[FormProps[T] with js.Object]) | StatelessComponent[FormProps[T]] = js.native
}

