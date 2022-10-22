package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.File
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileUtils.distComponentsImagePreviewerMod.ImagePreviewerProps
import typingsJapgolly.reactFileUtils.distTypesMod.ImageUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImagePreviewer {
  
  @JSImport("react-file-utils", "ImagePreviewer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def handleFiles(value: /* files */ js.Array[File] => Callback): this.type = set("handleFiles", js.Any.fromFunction1((t0: /* files */ js.Array[File]) => value(t0).runNow()))
    
    inline def handleRemove(value: (/* id */ String, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("handleRemove", js.Any.fromFunction2((t0: /* id */ String, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def handleRetry(value: (/* id */ String, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("handleRetry", js.Any.fromFunction2((t0: /* id */ String, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def imageUploads(value: js.Array[ImageUpload]): this.type = set("imageUploads", value.asInstanceOf[js.Any])
    
    inline def imageUploadsVarargs(value: ImageUpload*): this.type = set("imageUploads", js.Array(value*))
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImagePreviewer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ImagePreviewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
