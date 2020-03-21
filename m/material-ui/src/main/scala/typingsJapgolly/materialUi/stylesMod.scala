package typingsJapgolly.materialUi

import typingsJapgolly.materialUi.MaterialUI.Styles.Colors
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typingsJapgolly.materialUi.MaterialUI.Styles.RawTheme
import typingsJapgolly.materialUi.MaterialUI.Styles.Spacing
import typingsJapgolly.materialUi.MaterialUI.Styles.Transitions
import typingsJapgolly.materialUi.MaterialUI.Styles.Typography
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any]
  
  var DarkRawTheme: RawTheme = js.native
  var LightRawTheme: RawTheme = js.native
  var colors: Colors = js.native
  var darkBaseTheme: RawTheme = js.native
  var lightBaseTheme: RawTheme = js.native
  var spacing: Spacing = js.native
  var transitions: Transitions = js.native
  var typography: Typography = js.native
  var zIndex: typingsJapgolly.materialUi.MaterialUI.Styles.zIndex = js.native
  def getMuiTheme(muiTheme: typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme*): typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme = js.native
  type MuiTheme = typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
}

