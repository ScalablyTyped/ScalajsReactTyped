package typingsJapgolly.reactJss.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.theming.mod.DefaultTheme
import typingsJapgolly.theming.mod.ThemeProviderFactory
import typingsJapgolly.theming.mod.ThemeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", "ThemeProvider")
@js.native
class ThemeProvider protected ()
  extends typingsJapgolly.theming.mod.ThemeProvider {
  def this(props: ThemeProviderProps[DefaultTheme]) = this()
  def this(props: ThemeProviderProps[DefaultTheme], context: js.Any) = this()
}

@JSImport("react-jss", "ThemeProvider")
@js.native
object ThemeProvider extends TopLevel[ThemeProviderFactory[DefaultTheme]]

