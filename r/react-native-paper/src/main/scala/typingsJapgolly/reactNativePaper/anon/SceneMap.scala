package typingsJapgolly.reactNativePaper.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneMap extends StObject {
  
  def apply(
    hasNavigationStateRenderSceneRenderIconRenderLabelRenderTouchableGetLabelTextGetBadgeGetColorGetAccessibilityLabelGetTestIDActiveColorInactiveColorKeyboardHidesNavigationBarBarStyleLabeledStyleThemeSceneAnimationEnabledOnTabPressOnIndexChangeShiftingSafeAreaInsetsLabelMaxFontSizeMultiplier: Props
  ): Element = js.native
  
  /**
    * Function which takes a map of route keys to components.
    * Pure components are used to minimize re-rendering of the pages.
    * This drastically improves the animation performance.
    */
  def SceneMap(scenes: StringDictionary[ComponentType[JumpTo]]): js.Function1[/* hasRouteJumpTo */ JumpTo, Element] = js.native
}
