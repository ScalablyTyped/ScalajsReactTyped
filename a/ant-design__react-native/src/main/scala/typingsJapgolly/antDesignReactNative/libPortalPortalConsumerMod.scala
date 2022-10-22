package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.libPortalPortalHostMod.PortalMethods
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalPortalConsumerMod {
  
  @JSImport("@ant-design/react-native/lib/portal/portal-consumer", JSImport.Default)
  @js.native
  open class default () extends PortalConsumer
  
  @js.native
  trait PortalConsumer
    extends Component[PortalConsumerProps, js.Object, Any] {
    
    var _key: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalConsumer(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalConsumer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalConsumer(): Unit = js.native
  }
  
  trait PortalConsumerProps extends StObject {
    
    var children: Node
    
    var manager: PortalMethods
  }
  object PortalConsumerProps {
    
    inline def apply(manager: PortalMethods): PortalConsumerProps = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[PortalConsumerProps]
    }
    
    extension [Self <: PortalConsumerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setManager(value: PortalMethods): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
}
