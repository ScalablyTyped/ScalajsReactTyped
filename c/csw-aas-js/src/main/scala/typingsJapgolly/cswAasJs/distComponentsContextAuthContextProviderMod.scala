package typingsJapgolly.cswAasJs

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsContextAuthContextProviderMod {
  
  @JSImport("csw-aas-js/dist/components/context/AuthContextProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AuthContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait AuthContextConfig extends StObject {
    
    var clientId: String
    
    var realm: String
  }
  object AuthContextConfig {
    
    inline def apply(clientId: String, realm: String): AuthContextConfig = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthContextConfig]
    }
    
    extension [Self <: AuthContextConfig](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthContextProps extends StObject {
    
    var children: Node
    
    var config: AuthContextConfig
  }
  object AuthContextProps {
    
    inline def apply(config: AuthContextConfig): AuthContextProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[AuthContextProps]
    }
    
    extension [Self <: AuthContextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setConfig(value: AuthContextConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
