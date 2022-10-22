package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNative.mod.EventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalPortalHostMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
  @js.native
  open class default () extends PortalHost
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/portal/portal-host", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/portal/portal-host", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", "PortalContext")
  @js.native
  val PortalContext: Context[PortalMethods] = js.native
  
  @JSImport("@ant-design/react-native/lib/portal/portal-host", "portal")
  @js.native
  val portal: PortalGuard = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignReactNative.anon.ChildrenKey
    - typingsJapgolly.antDesignReactNative.anon.KeyType
    - typingsJapgolly.antDesignReactNative.anon.KeyNumber
  */
  trait Operation extends StObject
  object Operation {
    
    inline def ChildrenKey(key: Double): typingsJapgolly.antDesignReactNative.anon.ChildrenKey = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], children = null)
      __obj.updateDynamic("type")("mount")
      __obj.asInstanceOf[typingsJapgolly.antDesignReactNative.anon.ChildrenKey]
    }
    
    inline def KeyNumber(key: Double): typingsJapgolly.antDesignReactNative.anon.KeyNumber = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unmount")
      __obj.asInstanceOf[typingsJapgolly.antDesignReactNative.anon.KeyNumber]
    }
    
    inline def KeyType(key: Double): typingsJapgolly.antDesignReactNative.anon.KeyType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], children = null)
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typingsJapgolly.antDesignReactNative.anon.KeyType]
    }
  }
  
  trait PortalGuard extends StObject {
    
    def add(e: Node): Double
    
    /* private */ var nextKey: Any
    
    def remove(key: Double): Unit
  }
  object PortalGuard {
    
    inline def apply(add: Node => Double, nextKey: Any, remove: Double => Callback): PortalGuard = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), nextKey = nextKey.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: Double) => remove(t0).runNow()))
      __obj.asInstanceOf[PortalGuard]
    }
    
    extension [Self <: PortalGuard](x: Self) {
      
      inline def setAdd(value: Node => Double): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setNextKey(value: Any): Self = StObject.set(x, "nextKey", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: Double => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait PortalHost
    extends Component[PortalHostProps, js.Object, Any] {
    
    var _addType: EventSubscription = js.native
    
    var _manager: js.UndefOr[typingsJapgolly.antDesignReactNative.libPortalPortalManagerMod.default] = js.native
    
    def _mount(children: Node): Double = js.native
    def _mount(children: Node, _key: Double): Double = js.native
    
    var _nextKey: Double = js.native
    
    var _queue: js.Array[Operation] = js.native
    
    var _removeType: EventSubscription = js.native
    
    def _setManager(): Unit = js.native
    def _setManager(manager: Any): Unit = js.native
    
    def _unmount(key: Double): Unit = js.native
    
    def _update(key: Double, children: Node): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalHost(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalHost(): Unit = js.native
  }
  
  trait PortalHostProps extends StObject {
    
    var children: Node
  }
  object PortalHostProps {
    
    inline def apply(): PortalHostProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[PortalHostProps]
    }
    
    extension [Self <: PortalHostProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait PortalMethods extends StObject {
    
    def mount(children: Node): Double
    
    def unmount(key: Double): Unit
    
    def update(key: Double, children: Node): Unit
  }
  object PortalMethods {
    
    inline def apply(mount: Node => Double, unmount: Double => Callback, update: (Double, Node) => Callback): PortalMethods = {
      val __obj = js.Dynamic.literal(mount = js.Any.fromFunction1(mount), unmount = js.Any.fromFunction1((t0: Double) => unmount(t0).runNow()), update = js.Any.fromFunction2((t0: Double, t1: Node) => (update(t0, t1)).runNow()))
      __obj.asInstanceOf[PortalMethods]
    }
    
    extension [Self <: PortalMethods](x: Self) {
      
      inline def setMount(value: Node => Double): Self = StObject.set(x, "mount", js.Any.fromFunction1(value))
      
      inline def setUnmount(value: Double => Callback): Self = StObject.set(x, "unmount", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setUpdate(value: (Double, Node) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Double, t1: Node) => (value(t0, t1)).runNow()))
    }
  }
}
