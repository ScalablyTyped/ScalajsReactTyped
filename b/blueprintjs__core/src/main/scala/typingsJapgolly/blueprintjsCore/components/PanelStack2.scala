package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStack2PanelStack2Mod.PanelStack2Props
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStack2PanelTypesMod.Panel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanelStack2 {
  
  inline def apply[T /* <: Panel[js.Object] */](): Builder[T] = {
    val __props = js.Dynamic.literal()
    new Builder[T](js.Array(this.component, __props.asInstanceOf[PanelStack2Props[T]]))
  }
  
  @JSImport("@blueprintjs/core", "PanelStack2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Panel[js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def initialPanel(value: T): this.type = set("initialPanel", value.asInstanceOf[js.Any])
    
    inline def onClose(value: T => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def onOpen(value: T => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    
    inline def renderActivePanelOnly(value: Boolean): this.type = set("renderActivePanelOnly", value.asInstanceOf[js.Any])
    
    inline def showPanelHeader(value: Boolean): this.type = set("showPanelHeader", value.asInstanceOf[js.Any])
    
    inline def stack(value: js.Array[T]): this.type = set("stack", value.asInstanceOf[js.Any])
    
    inline def stackVarargs(value: T*): this.type = set("stack", js.Array(value*))
  }
  
  implicit def make[T /* <: Panel[js.Object] */](companion: PanelStack2.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[T /* <: Panel[js.Object] */](p: PanelStack2Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
