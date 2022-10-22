package typingsJapgolly.alt.components

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.alt.AltJS.Alt
import typingsJapgolly.alt.AltJS.AltStore
import typingsJapgolly.alt.altContainerMod.ContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AltContainer {
  
  object Class {
    
    @JSImport("alt/AltContainer", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.alt.altContainerMod.Class] {
      
      inline def component(value: Component[Any & js.Object, js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
      
      inline def flux(value: Alt): this.type = set("flux", value.asInstanceOf[js.Any])
      
      inline def render(value: /* repeated */ Any => Element): this.type = set("render", js.Any.fromFunction1(value))
      
      inline def shouldComponentUpdate(value: /* props */ Any => Boolean): this.type = set("shouldComponentUpdate", js.Any.fromFunction1(value))
      
      inline def store(value: AltStore[Any]): this.type = set("store", value.asInstanceOf[js.Any])
      
      inline def stores(value: js.Array[AltStore[Any]]): this.type = set("stores", value.asInstanceOf[js.Any])
      
      inline def storesVarargs(value: AltStore[Any]*): this.type = set("stores", js.Array(value*))
      
      inline def transform(value: (/* store */ AltStore[Any], /* actions */ Any) => Any): this.type = set("transform", js.Any.fromFunction2(value))
    }
    
    implicit def make(companion: Class.type): typingsJapgolly.alt.components.AltContainer.Class.Builder = new typingsJapgolly.alt.components.AltContainer.Class.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ContainerProps): typingsJapgolly.alt.components.AltContainer.Class.Builder = new typingsJapgolly.alt.components.AltContainer.Class.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("alt/AltContainer", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def component(value: Component[Any & js.Object, js.Object]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def flux(value: Alt): this.type = set("flux", value.asInstanceOf[js.Any])
    
    inline def render(value: /* repeated */ Any => Element): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def shouldComponentUpdate(value: /* props */ Any => Boolean): this.type = set("shouldComponentUpdate", js.Any.fromFunction1(value))
    
    inline def store(value: AltStore[Any]): this.type = set("store", value.asInstanceOf[js.Any])
    
    inline def stores(value: js.Array[AltStore[Any]]): this.type = set("stores", value.asInstanceOf[js.Any])
    
    inline def storesVarargs(value: AltStore[Any]*): this.type = set("stores", js.Array(value*))
    
    inline def transform(value: (/* store */ AltStore[Any], /* actions */ Any) => Any): this.type = set("transform", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: AltContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
