package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.FileList
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconMod.FileIconProps
import typingsJapgolly.reactFileUtils.distComponentsFilePreviewerMod.FilePreviewerProps
import typingsJapgolly.reactFileUtils.distTypesMod.FileUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FilePreviewer {
  
  @JSImport("react-file-utils", "FilePreviewer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fileIconProps(value: FileIconProps): this.type = set("fileIconProps", value.asInstanceOf[js.Any])
    
    inline def handleFiles(value: /* files */ FileList => Callback): this.type = set("handleFiles", js.Any.fromFunction1((t0: /* files */ FileList) => value(t0).runNow()))
    
    inline def handleRemove(value: /* id */ String => Callback): this.type = set("handleRemove", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
    
    inline def handleRetry(value: /* id */ String => Callback): this.type = set("handleRetry", js.Any.fromFunction1((t0: /* id */ String) => value(t0).runNow()))
    
    inline def uploads(value: js.Array[FileUpload]): this.type = set("uploads", value.asInstanceOf[js.Any])
    
    inline def uploadsVarargs(value: FileUpload*): this.type = set("uploads", js.Array(value*))
  }
  
  implicit def make(companion: FilePreviewer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FilePreviewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
