package typingsJapgolly.baseui.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent.Default
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
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (typingsJapgolly.std.Pick[
typingsJapgolly.baseui.buttonTypesMod.ButtonProps & typingsJapgolly.baseui.buttonTypesMod.SharedStyleProps & (typingsJapgolly.std.Omit[
  scala.Any, 
  typingsJapgolly.baseui.baseuiStrings.$colors | typingsJapgolly.baseui.baseuiStrings.$kind | typingsJapgolly.baseui.baseuiStrings.$isSelected | typingsJapgolly.baseui.baseuiStrings.$shape | typingsJapgolly.baseui.baseuiStrings.$size | typingsJapgolly.baseui.baseuiStrings.$isLoading | typingsJapgolly.baseui.baseuiStrings.$disabled | typingsJapgolly.baseui.baseuiStrings.$isFocusVisible | typingsJapgolly.baseui.baseuiStrings.children | typingsJapgolly.baseui.baseuiStrings.colors | typingsJapgolly.baseui.baseuiStrings.disabled | typingsJapgolly.baseui.baseuiStrings.endEnhancer | typingsJapgolly.baseui.baseuiStrings.isLoading | typingsJapgolly.baseui.baseuiStrings.isSelected | typingsJapgolly.baseui.baseuiStrings.kind | typingsJapgolly.baseui.baseuiStrings.onClick | typingsJapgolly.baseui.baseuiStrings.overrides | typingsJapgolly.baseui.baseuiStrings.shape | typingsJapgolly.baseui.baseuiStrings.size | typingsJapgolly.baseui.baseuiStrings.startEnhancer | typingsJapgolly.baseui.baseuiStrings.`type`
]) & typingsJapgolly.baseui.anon.`16`, 
java.lang.String | scala.Double | js.Symbol]) & typingsJapgolly.react.mod.RefAttributes[org.scalajs.dom.HTMLButtonElement] because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object ModalButton {
  
  def apply(
    p: (Pick[
      ButtonProps & SharedStyleProps & (Omit[
        Any, 
        $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible | children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type`
      ]) & `16`, 
      String | Double | js.Symbol
    ]) & RefAttributes[HTMLButtonElement]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("baseui/modal", "ModalButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ModalButton.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
