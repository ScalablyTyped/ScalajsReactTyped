package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsPortalPortalHostMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", JSImport.Default)
  @js.native
  open class default () extends PortalHost
  /* static members */
  object default {
    
    @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalHost", "PortalContext")
  @js.native
  val PortalContext: Context[PortalMethods] = js.native
  
  @js.native
  trait PortalHost
    extends Component[Props, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalHost(): Unit = js.native
    
    /* private */ var manager: Any = js.native
    
    /* private */ var mount: Any = js.native
    
    /* private */ var nextKey: Any = js.native
    
    /* private */ var queue: Any = js.native
    
    /* private */ var setManager: Any = js.native
    
    /* private */ var unmount: Any = js.native
    
    /* private */ var update: Any = js.native
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
  
  trait Props extends StObject {
    
    var children: Node
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
