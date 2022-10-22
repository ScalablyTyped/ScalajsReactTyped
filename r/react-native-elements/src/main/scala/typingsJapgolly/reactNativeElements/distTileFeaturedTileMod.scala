package typingsJapgolly.reactNativeElements

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactNativeElements.anon.PickTouchableOpacityPropsAccessibilityActions
import typingsJapgolly.reactNativeElements.anon.TouchableOpacityPropsTouc
import typingsJapgolly.reactNativeElements.distHelpersMod.RneFunctionComponent
import typingsJapgolly.reactNativeElements.distTileTileMod.TileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileFeaturedTileMod extends Shortcut {
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", JSImport.Default)
  @js.native
  val default: FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc] = js.native
  
  @JSImport("react-native-elements/dist/tile/FeaturedTile", "FeaturedTile")
  @js.native
  val FeaturedTile: RneFunctionComponent[TileProps] = js.native
  
  type _To = FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc]
  
  /* This means you don't have to write `default`, but can instead just say `distTileFeaturedTileMod.foo` */
  override def _to: FunctionComponent[PickTouchableOpacityPropsAccessibilityActions] | ForwardRefExoticComponent[TouchableOpacityPropsTouc] = default
}
