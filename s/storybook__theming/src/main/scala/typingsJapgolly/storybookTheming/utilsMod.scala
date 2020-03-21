package typingsJapgolly.storybookTheming

import typingsJapgolly.storybookTheming.storybookThemingStrings.dark
import typingsJapgolly.storybookTheming.storybookThemingStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def darkenColor(color: String): String = js.native
  def getPreferredColorScheme(): light | dark = js.native
  def lightenColor(color: String): String = js.native
  def mkColor(color: String): AnonColorString = js.native
}

