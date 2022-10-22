package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.baseui.anon.`16`
import typingsJapgolly.baseui.baseuiStrings.$colors
import typingsJapgolly.baseui.baseuiStrings.$disabled
import typingsJapgolly.baseui.baseuiStrings.$isFocusVisible
import typingsJapgolly.baseui.baseuiStrings.$isLoading
import typingsJapgolly.baseui.baseuiStrings.$isSelected
import typingsJapgolly.baseui.baseuiStrings.$kind
import typingsJapgolly.baseui.baseuiStrings.$shape
import typingsJapgolly.baseui.baseuiStrings.$size
import typingsJapgolly.baseui.baseuiStrings.`type`
import typingsJapgolly.baseui.baseuiStrings.children
import typingsJapgolly.baseui.baseuiStrings.colors
import typingsJapgolly.baseui.baseuiStrings.disabled
import typingsJapgolly.baseui.baseuiStrings.endEnhancer
import typingsJapgolly.baseui.baseuiStrings.isLoading
import typingsJapgolly.baseui.baseuiStrings.isSelected
import typingsJapgolly.baseui.baseuiStrings.kind
import typingsJapgolly.baseui.baseuiStrings.onClick
import typingsJapgolly.baseui.baseuiStrings.overrides
import typingsJapgolly.baseui.baseuiStrings.shape
import typingsJapgolly.baseui.baseuiStrings.size
import typingsJapgolly.baseui.baseuiStrings.startEnhancer
import typingsJapgolly.baseui.buttonTypesMod.ButtonProps
import typingsJapgolly.baseui.buttonTypesMod.SharedStyleProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalButtonMod extends Shortcut {
  
  @JSImport("baseui/modal/modal-button", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `16`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ] = js.native
  
  type _To = ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `16`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `modalModalButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `16`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ] = default
}
