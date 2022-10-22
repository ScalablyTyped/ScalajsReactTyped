package typingsJapgolly.styledReactModal.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.styledReactModal.mod.ModalProps
import typingsJapgolly.styledReactModal.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledReactModal {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ModalProps]))
  }
  
  @JSImport("styled-react-modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
    
    inline def afterOpen(value: Callback): this.type = set("afterOpen", value.toJsFn)
    
    inline def allowScroll(value: Boolean): this.type = set("allowScroll", value.asInstanceOf[js.Any])
    
    inline def backgroundProps(value: js.Object): this.type = set("backgroundProps", value.asInstanceOf[js.Any])
    
    inline def beforeClose(value: js.Promise[Unit] | js.Function0[Unit]): this.type = set("beforeClose", value.asInstanceOf[js.Any])
    
    inline def beforeCloseCallback(value: Callback): this.type = set("beforeClose", value.toJsFn)
    
    inline def beforeOpen(value: js.Promise[Unit] | js.Function0[Unit]): this.type = set("beforeOpen", value.asInstanceOf[js.Any])
    
    inline def beforeOpenCallback(value: Callback): this.type = set("beforeOpen", value.toJsFn)
    
    inline def onBackgroundClick(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): this.type = set("onBackgroundClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
    
    inline def onEscapeKeydown(value: /* event */ Event => Callback): this.type = set("onEscapeKeydown", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
  }
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
