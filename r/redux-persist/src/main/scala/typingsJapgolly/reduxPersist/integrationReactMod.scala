package typingsJapgolly.reduxPersist

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reduxPersist.esTypesMod.Persistor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integrationReactMod {
  
  /**
    * Entry point of your react application to allow it persist a given store @see Persistor and its configuration.
    * @see Persistor
    * @see PersistGateProps
    * @see PersistGateState
    */
  @JSImport("redux-persist/integration/react", "PersistGate")
  @js.native
  open class PersistGate protected () extends PureComponent[PersistGateProps, PersistorGateState, Any] {
    def this(props: PersistGateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PersistGateProps, context: Any) = this()
  }
  
  /** @see PersistGate */
  trait PersistGateProps extends StObject {
    
    var children: js.UndefOr[Node | (js.Function1[/* bootstrapped */ Boolean, Node])] = js.undefined
    
    var loading: js.UndefOr[Node] = js.undefined
    
    var onBeforeLift: js.UndefOr[js.Function0[Unit | js.Promise[Unit]]] = js.undefined
    
    var persistor: Persistor
  }
  object PersistGateProps {
    
    inline def apply(persistor: Persistor): PersistGateProps = {
      val __obj = js.Dynamic.literal(persistor = persistor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistGateProps]
    }
    
    extension [Self <: PersistGateProps](x: Self) {
      
      inline def setChildren(value: Node | (js.Function1[/* bootstrapped */ Boolean, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* bootstrapped */ Boolean => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: VdomNode): Self = StObject.set(x, "loading", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoadingNull: Self = StObject.set(x, "loading", null)
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLoadingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loading", js.Array(value*))
      
      inline def setLoadingVdomElement(value: VdomElement): Self = StObject.set(x, "loading", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBeforeLift(value: CallbackTo[Unit | js.Promise[Unit]]): Self = StObject.set(x, "onBeforeLift", value.toJsFn)
      
      inline def setOnBeforeLiftUndefined: Self = StObject.set(x, "onBeforeLift", js.undefined)
      
      inline def setPersistor(value: Persistor): Self = StObject.set(x, "persistor", value.asInstanceOf[js.Any])
    }
  }
  
  /** @see PersistGate */
  trait PersistorGateState extends StObject {
    
    var bootstrapped: Boolean
  }
  object PersistorGateState {
    
    inline def apply(bootstrapped: Boolean): PersistorGateState = {
      val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistorGateState]
    }
    
    extension [Self <: PersistorGateState](x: Self) {
      
      inline def setBootstrapped(value: Boolean): Self = StObject.set(x, "bootstrapped", value.asInstanceOf[js.Any])
    }
  }
}
