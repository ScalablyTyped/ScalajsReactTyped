package typingsJapgolly.reactLifecycleComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ErrorInfo
import typingsJapgolly.reactLifecycleComponent.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LifecycleComponent {
  
  inline def apply(component: ComponentClassP[Any & js.Object]): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props[Any, Any]]))
  }
  
  @JSImport("react-lifecycle-component", "LifecycleComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactLifecycleComponent.mod.LifecycleComponent] {
    
    inline def UNSAFE_componentWillMount(value: Callback): this.type = set("UNSAFE_componentWillMount", value.toJsFn)
    
    inline def UNSAFE_componentWillReceiveProps(value: (Any, /* nextContext */ Any) => Callback): this.type = set("UNSAFE_componentWillReceiveProps", js.Any.fromFunction2((t0: Any, t1: /* nextContext */ Any) => (value(t0, t1)).runNow()))
    
    inline def UNSAFE_componentWillUpdate(value: (Any, Any, /* nextContext */ Any) => Callback): this.type = set("UNSAFE_componentWillUpdate", js.Any.fromFunction3((t0: Any, t1: Any, t2: /* nextContext */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def componentDidCatch(value: (/* error */ js.Error, /* errorInfo */ ErrorInfo) => Callback): this.type = set("componentDidCatch", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* errorInfo */ ErrorInfo) => (value(t0, t1)).runNow()))
    
    inline def componentDidMount(value: Callback): this.type = set("componentDidMount", value.toJsFn)
    
    inline def componentDidUpdate(value: (Any, Any, /* snapshot */ js.UndefOr[Any]) => Callback): this.type = set("componentDidUpdate", js.Any.fromFunction3((t0: Any, t1: Any, t2: /* snapshot */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def componentWillMount(value: Callback): this.type = set("componentWillMount", value.toJsFn)
    
    inline def componentWillReceiveProps(value: (Any, /* nextContext */ Any) => Callback): this.type = set("componentWillReceiveProps", js.Any.fromFunction2((t0: Any, t1: /* nextContext */ Any) => (value(t0, t1)).runNow()))
    
    inline def componentWillUnmount(value: Callback): this.type = set("componentWillUnmount", value.toJsFn)
    
    inline def componentWillUpdate(value: (Any, Any, /* nextContext */ Any) => Callback): this.type = set("componentWillUpdate", js.Any.fromFunction3((t0: Any, t1: Any, t2: /* nextContext */ Any) => (value(t0, t1, t2)).runNow()))
    
    inline def getSnapshotBeforeUpdate(value: (Any, Any) => Any | Null): this.type = set("getSnapshotBeforeUpdate", js.Any.fromFunction2(value))
    
    inline def shouldComponentUpdate(value: (Any, Any, /* nextContext */ Any) => Boolean): this.type = set("shouldComponentUpdate", js.Any.fromFunction3(value))
  }
  
  def withProps(p: Props[Any, Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
