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

object distComponentsAuthorizationRealmRoleMod {
  
  @JSImport("csw-aas-js/dist/components/authorization/RealmRole", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasRealmRoleChildrenError: RealmRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasRealmRoleChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RealmRoleProps extends StObject {
    
    var children: Node
    
    var error: Node
    
    var realmRole: String
  }
  object RealmRoleProps {
    
    inline def apply(realmRole: String): RealmRoleProps = {
      val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any], children = null, error = null)
      __obj.asInstanceOf[RealmRoleProps]
    }
    
    extension [Self <: RealmRoleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setError(value: VdomNode): Self = StObject.set(x, "error", value.rawNode.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setErrorVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "error", js.Array(value*))
      
      inline def setErrorVdomElement(value: VdomElement): Self = StObject.set(x, "error", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRealmRole(value: String): Self = StObject.set(x, "realmRole", value.asInstanceOf[js.Any])
    }
  }
}
