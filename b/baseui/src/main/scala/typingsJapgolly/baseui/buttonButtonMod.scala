package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.baseui.anon.As
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
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod extends Shortcut {
  
  @JSImport("baseui/button/button", JSImport.Default)
  @js.native
  val default: ButtonComponentType = js.native
  
  @js.native
  trait ButtonComponentType extends StObject {
    
    def apply[C /* <: ElementType */](
      props: ButtonProps & SharedStyleProps & (Omit[
          ComponentProps[C], 
          children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type` | $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible
        ]) & As[C]
    ): Element = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  type _To = ButtonComponentType
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: ButtonComponentType = default
}
