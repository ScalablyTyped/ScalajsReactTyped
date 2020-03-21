package typingsJapgolly.storybookTheming

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming/dist/create", JSImport.Namespace)
@js.native
object createMod extends js.Object {
  def create(): ThemeVars = js.native
  def create(vars: ThemeVars): ThemeVars = js.native
  def create(vars: ThemeVars, rest: Rest): ThemeVars = js.native
  @js.native
  object themes extends js.Object {
    var dark: ThemeVars = js.native
    var light: ThemeVars = js.native
    var normal: ThemeVars = js.native
  }
  
  type Rest = StringDictionary[js.Any]
}

