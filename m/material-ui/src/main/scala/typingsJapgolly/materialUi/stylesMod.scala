package typingsJapgolly.materialUi

import typingsJapgolly.materialUi.MaterialUI.Styles.Colors
import typingsJapgolly.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typingsJapgolly.materialUi.MaterialUI.Styles.RawTheme
import typingsJapgolly.materialUi.MaterialUI.Styles.Spacing
import typingsJapgolly.materialUi.MaterialUI.Styles.Transitions
import typingsJapgolly.materialUi.MaterialUI.Styles.Typography
import typingsJapgolly.materialUi.MaterialUI.Styles.zIndex
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("material-ui/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-ui/styles", "DarkRawTheme")
  @js.native
  def DarkRawTheme: RawTheme = js.native
  inline def DarkRawTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DarkRawTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "LightRawTheme")
  @js.native
  def LightRawTheme: RawTheme = js.native
  inline def LightRawTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LightRawTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "MuiThemeProvider")
  @js.native
  open class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, Any]
  
  @JSImport("material-ui/styles", "colors")
  @js.native
  def colors: Colors = js.native
  inline def colors_=(x: Colors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "darkBaseTheme")
  @js.native
  def darkBaseTheme: RawTheme = js.native
  inline def darkBaseTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkBaseTheme")(x.asInstanceOf[js.Any])
  
  inline def getMuiTheme(muiTheme: typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme*): typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("getMuiTheme")(muiTheme.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme]
  
  @JSImport("material-ui/styles", "lightBaseTheme")
  @js.native
  def lightBaseTheme: RawTheme = js.native
  inline def lightBaseTheme_=(x: RawTheme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightBaseTheme")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "spacing")
  @js.native
  def spacing: Spacing = js.native
  inline def spacing_=(x: Spacing): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacing")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "transitions")
  @js.native
  def transitions: Transitions = js.native
  inline def transitions_=(x: Transitions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitions")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "typography")
  @js.native
  def typography: Typography = js.native
  inline def typography_=(x: Typography): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("typography")(x.asInstanceOf[js.Any])
  
  @JSImport("material-ui/styles", "zIndex")
  @js.native
  def zIndex: typingsJapgolly.materialUi.MaterialUI.Styles.zIndex = js.native
  inline def zIndex_=(x: zIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
  
  type MuiTheme = typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
}
