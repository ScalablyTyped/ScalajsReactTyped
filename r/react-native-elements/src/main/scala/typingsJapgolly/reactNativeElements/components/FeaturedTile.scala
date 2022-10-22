package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeElements.anon.RecursivePartialFullThemeAvatar
import typingsJapgolly.reactNativeElements.distConfigThemeMod.Theme
import typingsJapgolly.reactNativeElements.distConfigThemeProviderMod.ThemeProps
import typingsJapgolly.reactNativeElements.distTileTileMod.TileProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeaturedTile {
  
  inline def apply(
    replaceTheme: RecursivePartialFullThemeAvatar => Callback,
    theme: Theme[TileProps],
    updateTheme: RecursivePartialFullThemeAvatar => Callback
  ): SharedBuilder_TilePropsPartial1895851243 = {
    val __props = js.Dynamic.literal(replaceTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => replaceTheme(t0).runNow()), theme = theme.asInstanceOf[js.Any], updateTheme = js.Any.fromFunction1((t0: RecursivePartialFullThemeAvatar) => updateTheme(t0).runNow()))
    new SharedBuilder_TilePropsPartial1895851243(js.Array(this.component, __props.asInstanceOf[TileProps & Partial[ThemeProps[TileProps]]]))
  }
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", "FeaturedTile")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TileProps & Partial[ThemeProps[TileProps]]): SharedBuilder_TilePropsPartial1895851243 = new SharedBuilder_TilePropsPartial1895851243(js.Array(this.component, p.asInstanceOf[js.Any]))
}
