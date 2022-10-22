package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesDropzoneMod.DropzoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropzone {
  
  inline def apply(onDrop: js.Array[File] => Callback): Builder = {
    val __props = js.Dynamic.literal(onDrop = js.Any.fromFunction1((t0: js.Array[File]) => onDrop(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[DropzoneProps]))
  }
  
  object Content {
    
    @JSImport("wix-style-react", "Dropzone.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Overlay {
    
    @JSImport("wix-style-react", "Dropzone.Overlay")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Overlay.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "Dropzone")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Dropzone] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DropzoneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
