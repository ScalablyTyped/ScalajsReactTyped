package typingsJapgolly.reactOverlays.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactOverlays.esmPortalMod.PortalProps
import typingsJapgolly.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portal {
  
  @JSImport("react-overlays/esm", "Portal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def container(value: DOMContainer[HTMLElement]): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def containerCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): this.type = set("container", value.toJsFn)
    
    inline def containerNull: this.type = set("container", null)
    
    inline def onRendered(value: /* element */ Any => Callback): this.type = set("onRendered", js.Any.fromFunction1((t0: /* element */ Any) => value(t0).runNow()))
  }
  
  implicit def make(companion: Portal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PortalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
