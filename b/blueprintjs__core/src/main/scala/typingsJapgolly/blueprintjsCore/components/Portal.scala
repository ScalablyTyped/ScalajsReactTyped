package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPortalPortalMod.IPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("@blueprintjs/core", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Portal] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def container(value: HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def onChildrenMount(value: Callback): this.type = set("onChildrenMount", value.toJsFn)
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IPortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
