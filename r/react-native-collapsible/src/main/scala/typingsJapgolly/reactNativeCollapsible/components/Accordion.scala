package typingsJapgolly.reactNativeCollapsible.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.accordionMod.AccordionProps
import typingsJapgolly.reactNativeCollapsible.accordionMod.default
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.bottom
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.center
import typingsJapgolly.reactNativeCollapsible.reactNativeCollapsibleStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  inline def apply[T](
    activeSections: js.Array[Double | String],
    onChange: js.Array[Double] => Callback,
    renderContent: (T, Double, Boolean, js.Array[T]) => Element,
    renderHeader: (T, Double, Boolean, js.Array[T]) => Element,
    sections: js.Array[T]
  ): Builder[T] = {
    val __props = js.Dynamic.literal(activeSections = activeSections.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: js.Array[Double]) => onChange(t0).runNow()), renderContent = js.Any.fromFunction4(renderContent), renderHeader = js.Any.fromFunction4(renderHeader), sections = sections.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[AccordionProps[T]]))
  }
  
  @JSImport("react-native-collapsible/Accordion", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: EasingMode | Any): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def expandFromBottom(value: Boolean): this.type = set("expandFromBottom", value.asInstanceOf[js.Any])
    
    inline def expandMultiple(value: Boolean): this.type = set("expandMultiple", value.asInstanceOf[js.Any])
    
    inline def keyExtractor(value: (T, /* index */ Double) => Double | String): this.type = set("keyExtractor", js.Any.fromFunction2(value))
    
    inline def renderAsFlatList(value: Boolean): this.type = set("renderAsFlatList", value.asInstanceOf[js.Any])
    
    inline def renderFooter(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => Element): this.type = set("renderFooter", js.Any.fromFunction4(value))
    
    inline def renderSectionTitle(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => Element): this.type = set("renderSectionTitle", js.Any.fromFunction4(value))
    
    inline def sectionContainerStyle(value: StyleProp[ViewStyle]): this.type = set("sectionContainerStyle", value.asInstanceOf[js.Any])
    
    inline def sectionContainerStyleNull: this.type = set("sectionContainerStyle", null)
    
    inline def touchableComponent(value: ComponentClassP[js.Object]): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
    
    inline def touchableProps(value: js.Object): this.type = set("touchableProps", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: AccordionProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
