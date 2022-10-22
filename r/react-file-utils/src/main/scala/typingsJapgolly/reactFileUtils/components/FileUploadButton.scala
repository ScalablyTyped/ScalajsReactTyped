package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import org.scalajs.dom.FileList
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactFileUtils.distComponentsFileUploadButtonMod.FileUploadButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileUploadButton {
  
  inline def apply(handleFiles: js.Array[File] | FileList => Callback): Builder = {
    val __props = js.Dynamic.literal(handleFiles = js.Any.fromFunction1((t0: js.Array[File] | FileList) => handleFiles(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[FileUploadButtonProps]]))
  }
  
  @JSImport("react-file-utils", "FileUploadButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accepts(value: String | js.Array[String]): this.type = set("accepts", value.asInstanceOf[js.Any])
    
    inline def acceptsVarargs(value: String*): this.type = set("accepts", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def resetOnChange(value: Boolean): this.type = set("resetOnChange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[FileUploadButtonProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
