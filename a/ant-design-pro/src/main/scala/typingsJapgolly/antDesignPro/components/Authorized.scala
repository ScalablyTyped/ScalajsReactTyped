package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libAuthorizedAuthorizedRouteMod.authority
import typingsJapgolly.antDesignPro.libAuthorizedMod.IAuthorizedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Authorized {
  
  inline def apply(authority: authority): Builder = {
    val __props = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IAuthorizedProps]))
  }
  
  @JSImport("ant-design-pro/lib/Authorized", "Authorized")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libAuthorizedMod.Authorized] {
    
    inline def noMatch(value: VdomNode): this.type = set("noMatch", value.rawNode.asInstanceOf[js.Any])
    
    inline def noMatchNull: this.type = set("noMatch", null)
    
    inline def noMatchVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("noMatch", js.Array(value*))
    
    inline def noMatchVdomElement(value: VdomElement): this.type = set("noMatch", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: IAuthorizedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
