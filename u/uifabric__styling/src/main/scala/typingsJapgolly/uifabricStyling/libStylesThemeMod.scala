package typingsJapgolly.uifabricStyling

import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.IPartialTheme
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.fluentuiTheme.libTypesThemeMod.PartialTheme
import typingsJapgolly.fluentuiTheme.libTypesThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesThemeMod {
  
  @JSImport("@uifabric/styling/lib/styles/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uifabric/styling/lib/styles/theme", "ThemeSettingName")
  @js.native
  val ThemeSettingName: /* "theme" */ String = js.native
  
  inline def createTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")().asInstanceOf[Theme]
  inline def createTheme(theme: Unit, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
  inline def createTheme(theme: PartialTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Theme]
  inline def createTheme(theme: PartialTheme, depComments: Boolean): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[Theme]
  
  inline def getTheme(): ITheme = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[ITheme]
  inline def getTheme(depComments: Boolean): ITheme = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")(depComments.asInstanceOf[js.Any]).asInstanceOf[ITheme]
  
  inline def initializeThemeInCustomizations(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeThemeInCustomizations")().asInstanceOf[Unit]
  
  inline def loadTheme(theme: IPartialTheme): ITheme = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[ITheme]
  inline def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTheme")(theme.asInstanceOf[js.Any], depComments.asInstanceOf[js.Any])).asInstanceOf[ITheme]
  
  inline def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnThemeChangeCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOnThemeChangeCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
