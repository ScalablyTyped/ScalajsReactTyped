package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsFilePickerButtonFilePickerButtonMod.FilePickerButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilePickerButton {
  
  @JSImport("wix-ui-core/dist/es/src", "FilePickerButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixUiCore.distEsSrcMod.FilePickerButton] {
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: js.Function): this.type = set("onBlur", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* files */ js.Array[File] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* files */ js.Array[File]) => value(t0).runNow()))
    
    inline def onFocus(value: js.Function): this.type = set("onFocus", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FilePickerButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FilePickerButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
