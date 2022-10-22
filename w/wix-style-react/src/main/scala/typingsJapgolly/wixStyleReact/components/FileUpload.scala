package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.FileList
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ClassicElement
import typingsJapgolly.wixStyleReact.distTypesFileUploadMod.FileUploadChildrenProps
import typingsJapgolly.wixStyleReact.distTypesFileUploadMod.FileUploadProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.environment
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileUpload {
  
  inline def apply(children: FileUploadChildrenProps => ClassicElement[Any], onChange: FileList => Callback): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), onChange = js.Any.fromFunction1((t0: FileList) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[FileUploadProps]))
  }
  
  @JSImport("wix-style-react", "FileUpload")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FileUpload] {
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def capture(value: user | environment | none_): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FileUploadProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
