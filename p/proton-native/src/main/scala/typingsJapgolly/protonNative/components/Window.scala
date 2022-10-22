package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.protonNative.anon.W
import typingsJapgolly.protonNative.anon.Y
import typingsJapgolly.protonNative.mod.WindowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Window {
  
  @JSImport("proton-native", "Window")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.protonNative.mod.Window] {
    
    inline def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    
    inline def closed(value: Boolean): this.type = set("closed", value.asInstanceOf[js.Any])
    
    inline def fullscreen(value: Boolean): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    inline def lastWindow(value: Boolean): this.type = set("lastWindow", value.asInstanceOf[js.Any])
    
    inline def margined(value: Boolean): this.type = set("margined", value.asInstanceOf[js.Any])
    
    inline def menuBar(value: Boolean): this.type = set("menuBar", value.asInstanceOf[js.Any])
    
    inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
    
    inline def onContentSizeChange(value: /* size */ Y => Callback): this.type = set("onContentSizeChange", js.Any.fromFunction1((t0: /* size */ Y) => value(t0).runNow()))
    
    inline def size(value: W): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Window.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WindowProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
