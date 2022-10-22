package typingsJapgolly.reactAsync.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAsync.anon.Children
import typingsJapgolly.reactAsync.mod.AbstractState
import typingsJapgolly.reactAsync.mod.AsyncFulfilled
import typingsJapgolly.reactAsync.mod.AsyncInitial
import typingsJapgolly.reactAsync.mod.AsyncPending
import typingsJapgolly.reactAsync.mod.AsyncRejected
import typingsJapgolly.reactAsync.mod.FulfilledChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IfFulfilled {
  
  inline def apply[T /* <: js.Object */](
    state: (AsyncInitial[T, AbstractState[T]]) | (AsyncPending[T, AbstractState[T]]) | (AsyncFulfilled[T, AbstractState[T]]) | (AsyncRejected[T, AbstractState[T]])
  ): Builder[T] = {
    val __props = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Children[T]]))
  }
  
  @JSImport("react-async", "IfFulfilled")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: FulfilledChildren[T]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction2(value: (T, /* state */ AsyncFulfilled[T, AbstractState[T]]) => Node): this.type = set("children", js.Any.fromFunction2(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def persist(value: Boolean): this.type = set("persist", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: js.Object */](p: Children[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
