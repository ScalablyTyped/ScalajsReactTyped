package typingsJapgolly.reachPortal.components

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachPortal.mod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@reach/portal", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def containerRef(value: RefHandle[Node]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def unstable_skipInitialRender(value: Boolean): this.type = set("unstable_skipInitialRender", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
