package typingsJapgolly.rcUtil.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcUtil.anon.GetContainer
import typingsJapgolly.rcUtil.libPortalWrapperMod.PortalWrapperProps
import typingsJapgolly.rcUtil.libPortalWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortalWrapper {
  
  inline def apply(children: GetContainer => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[PortalWrapperProps]))
  }
  
  @JSImport("rc-util/lib/PortalWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def forceRender(value: Boolean): this.type = set("forceRender", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: typingsJapgolly.rcUtil.libPortalWrapperMod.GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def getContainerCallbackTo(value: CallbackTo[HTMLElement]): this.type = set("getContainer", value.toJsFn)
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def wrapperClassName(value: String): this.type = set("wrapperClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PortalWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
