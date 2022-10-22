package typingsJapgolly.rcComponentPortal.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcComponentPortal.esPortalMod.ContainerType
import typingsJapgolly.rcComponentPortal.esPortalMod.GetContainer
import typingsJapgolly.rcComponentPortal.esPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@rc-component/portal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoDestroy(value: Boolean): this.type = set("autoDestroy", value.asInstanceOf[js.Any])
    
    inline def autoLock(value: Boolean): this.type = set("autoLock", value.asInstanceOf[js.Any])
    
    inline def debug(value: String): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def getContainerCallbackTo(value: CallbackTo[ContainerType]): this.type = set("getContainer", value.toJsFn)
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
