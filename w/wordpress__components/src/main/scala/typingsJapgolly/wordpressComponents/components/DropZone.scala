package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.dropZoneMod.DropZone.HoverPosition
import typingsJapgolly.wordpressComponents.dropZoneMod.DropZone.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DropZone {
  
  @JSImport("@wordpress/components", "DropZone")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def onDrop(value: (/* event */ ReactDragEventFrom[HTMLDivElement], /* position */ HoverPosition) => Callback): this.type = set("onDrop", js.Any.fromFunction2((t0: /* event */ ReactDragEventFrom[HTMLDivElement], t1: /* position */ HoverPosition) => (value(t0, t1)).runNow()))
    
    inline def onFilesDrop(value: (/* files */ js.Array[File], /* position */ HoverPosition) => Callback): this.type = set("onFilesDrop", js.Any.fromFunction2((t0: /* files */ js.Array[File], t1: /* position */ HoverPosition) => (value(t0, t1)).runNow()))
    
    inline def onHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Callback): this.type = set("onHTMLDrop", js.Any.fromFunction2((t0: /* html */ String, t1: /* position */ HoverPosition) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: DropZone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
