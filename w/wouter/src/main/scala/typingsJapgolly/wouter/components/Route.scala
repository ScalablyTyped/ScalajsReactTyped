package typingsJapgolly.wouter.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wouter.mod.RouteComponentProps
import typingsJapgolly.wouter.mod.RouteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Route {
  
  inline def apply[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[RouteProps[T]]))
  }
  
  @JSImport("wouter", "Route")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(
      value: (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Params<T> */ /* params */ Any, 
          Node
        ]) | Node
    ): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Params<T> */ /* params */ Any => Node
    ): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def component(value: ComponentType[RouteComponentProps[T]]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def path(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ): this.type = set("path", value.asInstanceOf[js.Any])
  }
  
  implicit def make[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](companion: Route.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultParams */ Any */](p: RouteProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
