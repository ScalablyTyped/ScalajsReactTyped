package typingsJapgolly.cswAasJs.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cswAasJs.distComponentsAuthorizationRealmRoleMod.RealmRoleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RealmRole {
  
  inline def apply(realmRole: String): Builder = {
    val __props = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RealmRoleProps]))
  }
  
  @JSImport("csw-aas-js", "RealmRole")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def error(value: VdomNode): this.type = set("error", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorNull: this.type = set("error", null)
    
    inline def errorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("error", js.Array(value*))
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: RealmRoleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
