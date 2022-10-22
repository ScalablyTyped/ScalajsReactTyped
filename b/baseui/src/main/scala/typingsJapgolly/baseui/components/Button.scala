package typingsJapgolly.baseui.components

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
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
import typingsJapgolly.baseui.baseuiStrings.button
import typingsJapgolly.baseui.baseuiStrings.children
import typingsJapgolly.baseui.baseuiStrings.circle
import typingsJapgolly.baseui.baseuiStrings.colors
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.disabled
import typingsJapgolly.baseui.baseuiStrings.endEnhancer
import typingsJapgolly.baseui.baseuiStrings.isLoading
import typingsJapgolly.baseui.baseuiStrings.isSelected
import typingsJapgolly.baseui.baseuiStrings.kind
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.onClick
import typingsJapgolly.baseui.baseuiStrings.overrides
import typingsJapgolly.baseui.baseuiStrings.pill
import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.reset
import typingsJapgolly.baseui.baseuiStrings.round_
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.shape
import typingsJapgolly.baseui.baseuiStrings.size
import typingsJapgolly.baseui.baseuiStrings.square
import typingsJapgolly.baseui.baseuiStrings.startEnhancer
import typingsJapgolly.baseui.baseuiStrings.submit
import typingsJapgolly.baseui.baseuiStrings.tertiary
import typingsJapgolly.baseui.buttonTypesMod.ButtonOverrides
import typingsJapgolly.baseui.buttonTypesMod.ButtonProps
import typingsJapgolly.baseui.buttonTypesMod.CustomColors
import typingsJapgolly.baseui.buttonTypesMod.SharedStyleProps
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  inline def apply[C /* <: ElementType */](): Builder[C] = {
    val __props = js.Dynamic.literal()
    new Builder[C](js.Array(this.component, __props.asInstanceOf[ButtonProps & SharedStyleProps & (Omit[
    ComponentProps[C], 
    children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type` | $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible
  ]) & As[C]]))
  }
  
  @JSImport("baseui/button", "Button")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[C /* <: ElementType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def $as(value: C): this.type = set("$as", value.asInstanceOf[js.Any])
    
    inline def $colors(value: CustomColors): this.type = set("$colors", value.asInstanceOf[js.Any])
    
    inline def $disabled(value: Boolean): this.type = set("$disabled", value.asInstanceOf[js.Any])
    
    inline def $isFocusVisible(value: Boolean): this.type = set("$isFocusVisible", value.asInstanceOf[js.Any])
    
    inline def $isLoading(value: Boolean): this.type = set("$isLoading", value.asInstanceOf[js.Any])
    
    inline def $isSelected(value: Boolean): this.type = set("$isSelected", value.asInstanceOf[js.Any])
    
    inline def $kind(value: primary | secondary | tertiary): this.type = set("$kind", value.asInstanceOf[js.Any])
    
    inline def $shape(value: default_ | pill | round_ | circle | square): this.type = set("$shape", value.asInstanceOf[js.Any])
    
    inline def $size(value: mini | default_ | compact | large_): this.type = set("$size", value.asInstanceOf[js.Any])
    
    inline def colors(value: CustomColors): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def endEnhancer(value: Node | ComponentType[Any]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def endEnhancerNull: this.type = set("endEnhancer", null)
    
    inline def endEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("endEnhancer", js.Array(value*))
    
    inline def endEnhancerVdomElement(value: VdomElement): this.type = set("endEnhancer", value.rawElement.asInstanceOf[js.Any])
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def kind(value: primary | secondary | tertiary): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* a */ ReactEventFrom[HTMLButtonElement] => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def overrides(value: ButtonOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def shape(value: default_ | pill | round_ | circle | square): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def size(value: mini | default_ | compact | large_): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def startEnhancer(value: Node | ComponentType[Any]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
    
    inline def startEnhancerNull: this.type = set("startEnhancer", null)
    
    inline def startEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("startEnhancer", js.Array(value*))
    
    inline def startEnhancerVdomElement(value: VdomElement): this.type = set("startEnhancer", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make[C /* <: ElementType */](companion: Button.type): Builder[C] = new Builder[C](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[C /* <: ElementType */](
    p: ButtonProps & SharedStyleProps & (Omit[
      ComponentProps[C], 
      children | colors | disabled | endEnhancer | isLoading | isSelected | kind | onClick | overrides | shape | size | startEnhancer | `type` | $colors | $kind | $isSelected | $shape | $size | $isLoading | $disabled | $isFocusVisible
    ]) & As[C]
  ): Builder[C] = new Builder[C](js.Array(this.component, p.asInstanceOf[js.Any]))
}
