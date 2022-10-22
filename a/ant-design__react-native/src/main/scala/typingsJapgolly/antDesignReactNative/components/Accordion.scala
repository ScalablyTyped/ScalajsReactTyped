package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignReactNative.anon.PartialAccordionStyle
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.center
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.libAccordionMod.AccordionHeader
import typingsJapgolly.antDesignReactNative.libAccordionMod.AccordionNativeProps
import typingsJapgolly.antDesignReactNative.libAccordionMod.AccordionPanelProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCollapsible.mod.EasingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Accordion {
  
  inline def apply[T /* <: AccordionHeader */](children: Element | js.Array[Element]): Builder[T] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[AccordionNativeProps[T]]))
  }
  
  object Panel {
    
    inline def apply(header: Any): Default[typingsJapgolly.antDesignReactNative.mod.Accordion.Panel] = {
      val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
      new Default[typingsJapgolly.antDesignReactNative.mod.Accordion.Panel](js.Array(this.component, __props.asInstanceOf[AccordionPanelProps]))
    }
    
    @JSImport("@ant-design/react-native", "Accordion.Panel")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: AccordionPanelProps): Default[typingsJapgolly.antDesignReactNative.mod.Accordion.Panel] = new Default[typingsJapgolly.antDesignReactNative.mod.Accordion.Panel](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@ant-design/react-native", "Accordion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: AccordionHeader */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignReactNative.mod.Accordion[T]] {
    
    inline def activeSections(value: js.Array[Double | String]): this.type = set("activeSections", value.asInstanceOf[js.Any])
    
    inline def activeSectionsVarargs(value: (Double | String)*): this.type = set("activeSections", js.Array(value*))
    
    inline def align(value: top | center | bottom): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: EasingMode | Any): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def expandFromBottom(value: Boolean): this.type = set("expandFromBottom", value.asInstanceOf[js.Any])
    
    inline def expandMultiple(value: Boolean): this.type = set("expandMultiple", value.asInstanceOf[js.Any])
    
    inline def keyExtractor(value: (T, /* index */ Double) => Double | String): this.type = set("keyExtractor", js.Any.fromFunction2(value))
    
    inline def onChange(value: /* indexes */ js.Array[Double] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* indexes */ js.Array[Double]) => value(t0).runNow()))
    
    inline def renderAsFlatList(value: Boolean): this.type = set("renderAsFlatList", value.asInstanceOf[js.Any])
    
    inline def renderContent(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => Element): this.type = set("renderContent", js.Any.fromFunction4(value))
    
    inline def renderFooter(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => Element): this.type = set("renderFooter", js.Any.fromFunction4(value))
    
    inline def renderHeader(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => Element): this.type = set("renderHeader", js.Any.fromFunction4(value))
    
    inline def renderSectionTitle(value: (T, /* index */ Double, /* isActive */ Boolean, /* sections */ js.Array[T]) => Element): this.type = set("renderSectionTitle", js.Any.fromFunction4(value))
    
    inline def sectionContainerStyle(value: StyleProp[ViewStyle]): this.type = set("sectionContainerStyle", value.asInstanceOf[js.Any])
    
    inline def sectionContainerStyleNull: this.type = set("sectionContainerStyle", null)
    
    inline def sections(value: js.Array[T]): this.type = set("sections", value.asInstanceOf[js.Any])
    
    inline def sectionsVarargs(value: T*): this.type = set("sections", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def styles(value: PartialAccordionStyle): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def touchableComponent(value: ComponentClassP[js.Object]): this.type = set("touchableComponent", value.asInstanceOf[js.Any])
    
    inline def touchableProps(value: js.Object): this.type = set("touchableProps", value.asInstanceOf[js.Any])
    
    inline def underlayColor(value: String): this.type = set("underlayColor", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: AccordionHeader */](p: AccordionNativeProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
