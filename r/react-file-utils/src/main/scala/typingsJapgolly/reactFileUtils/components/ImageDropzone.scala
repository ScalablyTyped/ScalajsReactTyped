package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import org.scalajs.dom.FileList
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactFileUtils.distComponentsImageDropzoneMod.ImageDropzoneProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageDropzone {
  
  @JSImport("react-file-utils", "ImageDropzone")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accept(value: String | js.Array[String]): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def acceptVarargs(value: String*): this.type = set("accept", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def handleFiles(value: /* files */ FileList | js.Array[File] => Callback): this.type = set("handleFiles", js.Any.fromFunction1((t0: /* files */ FileList | js.Array[File]) => value(t0).runNow()))
    
    inline def maxNumberOfFiles(value: Double): this.type = set("maxNumberOfFiles", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ImageDropzone.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[ImageDropzoneProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
