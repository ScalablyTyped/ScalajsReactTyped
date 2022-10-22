package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.baseuiStrings.span
import typingsJapgolly.baseui.buttonButtonMod.ButtonComponentType
import typingsJapgolly.baseui.buttonTypesMod.CustomColors
import typingsJapgolly.baseui.buttonTypesMod.SharedStyleProps
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("baseui/button", "Button")
  @js.native
  val Button: ButtonComponentType = js.native
  
  object KIND {
    
    @JSImport("baseui/button", "KIND.primary")
    @js.native
    val primary: typingsJapgolly.baseui.baseuiStrings.primary = js.native
    
    @JSImport("baseui/button", "KIND.secondary")
    @js.native
    val secondary: typingsJapgolly.baseui.baseuiStrings.secondary = js.native
    
    @JSImport("baseui/button", "KIND.tertiary")
    @js.native
    val tertiary: typingsJapgolly.baseui.baseuiStrings.tertiary = js.native
  }
  
  object SHAPE extends Shortcut {
    
    @JSImport("baseui/button", "SHAPE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button", "SHAPE.circle")
    @js.native
    val circle: typingsJapgolly.baseui.baseuiStrings.circle = js.native
    
    @JSImport("baseui/button", "SHAPE.pill")
    @js.native
    val pill: typingsJapgolly.baseui.baseuiStrings.pill = js.native
    
    @JSImport("baseui/button", "SHAPE.round")
    @js.native
    val round: round_ = js.native
    
    @JSImport("baseui/button", "SHAPE.square")
    @js.native
    val square: typingsJapgolly.baseui.baseuiStrings.square = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SHAPE.foo` */
    override def _to: default_ = default
  }
  
  object SIZE extends Shortcut {
    
    @JSImport("baseui/button", "SIZE.default")
    @js.native
    val default: default_ = js.native
    
    @JSImport("baseui/button", "SIZE.compact")
    @js.native
    val compact: typingsJapgolly.baseui.baseuiStrings.compact = js.native
    
    @JSImport("baseui/button", "SIZE.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/button", "SIZE.mini")
    @js.native
    val mini: typingsJapgolly.baseui.baseuiStrings.mini = js.native
    
    type _To = default_
    
    /* This means you don't have to write `default`, but can instead just say `SIZE.foo` */
    override def _to: default_ = default
  }
  
  @JSImport("baseui/button", "StyledBaseButton")
  @js.native
  val StyledBaseButton: StyletronComponent[button, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledEndEnhancer")
  @js.native
  val StyledEndEnhancer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinner")
  @js.native
  val StyledLoadingSpinner: StyletronComponent[span, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinnerContainer")
  @js.native
  val StyledLoadingSpinnerContainer: StyletronComponent[div, SharedStyleProps] = js.native
  
  @JSImport("baseui/button", "StyledStartEnhancer")
  @js.native
  val StyledStartEnhancer: StyletronComponent[div, SharedStyleProps] = js.native
  
  type CustomColorsT = CustomColors
}
