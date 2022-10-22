package typingsJapgolly.reactNativePaper

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.PortalMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsPortalPortalConsumerMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalConsumer", JSImport.Default)
  @js.native
  open class default () extends PortalConsumer
  
  @js.native
  trait PortalConsumer
    extends Component[Props, js.Object, Any] {
    
    /* private */ var checkManager: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalConsumer(): js.Promise[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalConsumer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalConsumer(): Unit = js.native
    
    /* private */ var key: Any = js.native
  }
  
  trait Props extends StObject {
    
    var children: Node
    
    var manager: PortalMethods
  }
  object Props {
    
    inline def apply(manager: PortalMethods): Props = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setManager(value: PortalMethods): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
}
