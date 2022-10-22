package typingsJapgolly.reactMdPortal.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdPortal.typesConditionalPortalMod.ConditionalPortalProps
import typingsJapgolly.reactMdPortal.typesGetContainerMod.PortalInto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConditionalPortal {
  
  @JSImport("@react-md/portal", "ConditionalPortal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    
    inline def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
    
    inline def portalIntoCallbackTo(value: CallbackTo[HTMLElement | Null]): this.type = set("portalInto", value.toJsFn)
    
    inline def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
    
    inline def portalIntoNull: this.type = set("portalInto", null)
  }
  
  implicit def make(companion: ConditionalPortal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ConditionalPortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
