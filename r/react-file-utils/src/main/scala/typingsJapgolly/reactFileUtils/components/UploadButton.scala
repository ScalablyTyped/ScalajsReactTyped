package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileUtils.distComponentsUploadButtonMod.UploadButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UploadButton {
  
  inline def apply(onFileChange: js.Array[File] => Callback): Builder = {
    val __props = js.Dynamic.literal(onFileChange = js.Any.fromFunction1((t0: js.Array[File]) => onFileChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[UploadButtonProps]))
  }
  
  @JSImport("react-file-utils", "UploadButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def resetOnChange(value: Boolean): this.type = set("resetOnChange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UploadButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
