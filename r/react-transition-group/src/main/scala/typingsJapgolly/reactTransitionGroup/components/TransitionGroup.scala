package typingsJapgolly.reactTransitionGroup.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTransitionGroup.anon.Dictprop
import typingsJapgolly.reactTransitionGroup.reactTransitionGroupStrings.div
import typingsJapgolly.reactTransitionGroup.transitionGroupMod.ComponentTransitionGroupProps
import typingsJapgolly.reactTransitionGroup.transitionGroupMod.IntrinsicTransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TransitionGroup {
  
  object ComponentTransitionGroupPropsDictprop {
    
    inline def apply(component: Any): Builder = {
      val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[ComponentTransitionGroupProps[Any] & Dictprop]))
    }
    
    @JSImport("react-transition-group", "TransitionGroup")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactTransitionGroup.mod.TransitionGroup] {
      
      inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
      
      inline def childFactory(value: /* child */ Element => Element): this.type = set("childFactory", js.Any.fromFunction1(value))
      
      inline def children(value: Element | js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
      
      inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: ComponentTransitionGroupProps[Any] & Dictprop): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object IntrinsicTransitionGroupPropsAny {
    
    @JSImport("react-transition-group", "TransitionGroup")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactTransitionGroup.mod.TransitionGroup] {
      
      inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
      
      inline def component(value: div): this.type = set("component", value.asInstanceOf[js.Any])
      
      inline def componentNull: this.type = set("component", null)
      
      inline def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
      
      inline def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: IntrinsicTransitionGroupPropsAny.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(
      p: IntrinsicTransitionGroupProps[div] & (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
    ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
