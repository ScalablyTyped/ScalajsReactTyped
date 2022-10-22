package typingsJapgolly.reactImages.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactImages.anon.Blanket
import typingsJapgolly.reactImages.mod.ModalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  @JSImport("react-images", "Modal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowFullscreen(value: Boolean): this.type = set("allowFullscreen", value.asInstanceOf[js.Any])
    
    inline def closeOnBackdropClick(value: Boolean): this.type = set("closeOnBackdropClick", value.asInstanceOf[js.Any])
    
    inline def closeOnEsc(value: Boolean): this.type = set("closeOnEsc", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* event */ ReactEventFrom[HTMLButtonElement] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def styles(value: Blanket): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
