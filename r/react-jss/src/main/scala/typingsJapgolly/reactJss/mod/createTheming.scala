package typingsJapgolly.reactJss.mod

import typingsJapgolly.react.mod.Context
import typingsJapgolly.theming.mod.Theming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "createTheming")
@js.native
object createTheming extends js.Object {
  def apply[Theme](context: Context[Theme]): Theming[Theme] = js.native
}

