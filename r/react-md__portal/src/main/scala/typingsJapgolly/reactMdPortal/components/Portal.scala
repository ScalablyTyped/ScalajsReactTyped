package typingsJapgolly.reactMdPortal.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdPortal.typesGetContainerMod.PortalInto
import typingsJapgolly.reactMdPortal.typesPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@react-md/portal", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def into(value: PortalInto): this.type = set("into", value.asInstanceOf[js.Any])
    
    inline def intoCallbackTo(value: CallbackTo[HTMLElement | Null]): this.type = set("into", value.toJsFn)
    
    inline def intoId(value: String): this.type = set("intoId", value.asInstanceOf[js.Any])
    
    inline def intoNull: this.type = set("into", null)
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
