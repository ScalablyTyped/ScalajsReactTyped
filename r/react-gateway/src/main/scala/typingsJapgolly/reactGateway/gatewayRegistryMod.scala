package typingsJapgolly.reactGateway

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayRegistryMod {
  
  @JSImport("react-gateway/GatewayRegistry", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GatewayRegistry {
    
    /* CompleteClass */
    var _children: StringDictionary[js.UndefOr[StringDictionary[Node]]] = js.native
    
    /* CompleteClass */
    var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]] = js.native
    
    /* CompleteClass */
    var _currentId: Double = js.native
    
    /* CompleteClass */
    override def _renderContainer(name: String): Unit = js.native
    
    /* CompleteClass */
    override def addChild(name: String, gatewayId: String, child: Node): Unit = js.native
    
    /* CompleteClass */
    override def addContainer(name: String, container: Component[js.Object, js.Object]): Unit = js.native
    
    /* CompleteClass */
    override def clearChild(name: String, gatewayId: String): Unit = js.native
    
    /* CompleteClass */
    override def register(name: String, child: Node): String = js.native
    
    /* CompleteClass */
    override def removeContainer(name: String): Unit = js.native
    
    /* CompleteClass */
    override def unregister(name: String, gatewayId: String): Unit = js.native
  }
  
  trait GatewayRegistry extends StObject {
    
    var _children: StringDictionary[js.UndefOr[StringDictionary[Node]]]
    
    var _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]]
    
    var _currentId: Double
    
    def _renderContainer(name: String): Unit
    
    def addChild(name: String, gatewayId: String, child: Node): Unit
    
    def addContainer(name: String, container: Component[js.Object, js.Object]): Unit
    
    def clearChild(name: String, gatewayId: String): Unit
    
    def register(name: String, child: Node): String
    
    def removeContainer(name: String): Unit
    
    def unregister(name: String, gatewayId: String): Unit
  }
  object GatewayRegistry {
    
    inline def apply(
      _children: StringDictionary[js.UndefOr[StringDictionary[Node]]],
      _containers: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]],
      _currentId: Double,
      _renderContainer: String => Callback,
      addChild: (String, String, Node) => Callback,
      addContainer: (String, Component[js.Object, js.Object]) => Callback,
      clearChild: (String, String) => Callback,
      register: (String, Node) => String,
      removeContainer: String => Callback,
      unregister: (String, String) => Callback
    ): GatewayRegistry = {
      val __obj = js.Dynamic.literal(_children = _children.asInstanceOf[js.Any], _containers = _containers.asInstanceOf[js.Any], _currentId = _currentId.asInstanceOf[js.Any], _renderContainer = js.Any.fromFunction1((t0: String) => _renderContainer(t0).runNow()), addChild = js.Any.fromFunction3((t0: String, t1: String, t2: Node) => (addChild(t0, t1, t2)).runNow()), addContainer = js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object]) => (addContainer(t0, t1)).runNow()), clearChild = js.Any.fromFunction2((t0: String, t1: String) => (clearChild(t0, t1)).runNow()), register = js.Any.fromFunction2(register), removeContainer = js.Any.fromFunction1((t0: String) => removeContainer(t0).runNow()), unregister = js.Any.fromFunction2((t0: String, t1: String) => (unregister(t0, t1)).runNow()))
      __obj.asInstanceOf[GatewayRegistry]
    }
    
    extension [Self <: GatewayRegistry](x: Self) {
      
      inline def setAddChild(value: (String, String, Node) => Callback): Self = StObject.set(x, "addChild", js.Any.fromFunction3((t0: String, t1: String, t2: Node) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddContainer(value: (String, Component[js.Object, js.Object]) => Callback): Self = StObject.set(x, "addContainer", js.Any.fromFunction2((t0: String, t1: Component[js.Object, js.Object]) => (value(t0, t1)).runNow()))
      
      inline def setClearChild(value: (String, String) => Callback): Self = StObject.set(x, "clearChild", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setRegister(value: (String, Node) => String): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setRemoveContainer(value: String => Callback): Self = StObject.set(x, "removeContainer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUnregister(value: (String, String) => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def set_children(value: StringDictionary[js.UndefOr[StringDictionary[Node]]]): Self = StObject.set(x, "_children", value.asInstanceOf[js.Any])
      
      inline def set_containers(value: StringDictionary[js.UndefOr[(Component[js.Object, js.Object]) | Null]]): Self = StObject.set(x, "_containers", value.asInstanceOf[js.Any])
      
      inline def set_currentId(value: Double): Self = StObject.set(x, "_currentId", value.asInstanceOf[js.Any])
      
      inline def set_renderContainer(value: String => Callback): Self = StObject.set(x, "_renderContainer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
