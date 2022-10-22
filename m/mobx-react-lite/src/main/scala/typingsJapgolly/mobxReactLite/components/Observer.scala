package typingsJapgolly.mobxReactLite.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mobxReactLite.distObserverComponentMod.IObserverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Observer {
  
  @JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: CallbackTo[Element | Null]): this.type = set("children", value.toJsFn)
    
    inline def render(value: CallbackTo[Element | Null]): this.type = set("render", value.toJsFn)
  }
  
  implicit def make(companion: Observer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IObserverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
