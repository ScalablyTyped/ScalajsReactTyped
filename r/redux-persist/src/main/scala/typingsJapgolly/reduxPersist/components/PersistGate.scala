package typingsJapgolly.reduxPersist.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reduxPersist.esTypesMod.Persistor
import typingsJapgolly.reduxPersist.integrationReactMod.PersistGateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PersistGate {
  
  inline def apply(persistor: Persistor): Builder = {
    val __props = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PersistGateProps]))
  }
  
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reduxPersist.integrationReactMod.PersistGate] {
    
    inline def children(value: Node | (js.Function1[/* bootstrapped */ Boolean, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* bootstrapped */ Boolean => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def loading(value: VdomNode): this.type = set("loading", value.rawNode.asInstanceOf[js.Any])
    
    inline def loadingNull: this.type = set("loading", null)
    
    inline def loadingVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loading", js.Array(value*))
    
    inline def loadingVdomElement(value: VdomElement): this.type = set("loading", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBeforeLift(value: CallbackTo[Unit | js.Promise[Unit]]): this.type = set("onBeforeLift", value.toJsFn)
  }
  
  def withProps(p: PersistGateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
