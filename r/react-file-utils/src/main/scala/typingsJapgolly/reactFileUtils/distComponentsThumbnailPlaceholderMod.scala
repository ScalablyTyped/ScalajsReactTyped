package typingsJapgolly.reactFileUtils

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsThumbnailPlaceholderMod {
  
  @JSImport("react-file-utils/dist/components/ThumbnailPlaceholder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThumbnailPlaceholder(hasMultipleHandleFiles: ThumbnailPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThumbnailPlaceholder")(hasMultipleHandleFiles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ThumbnailPlaceholderProps extends StObject {
    
    def handleFiles(files: js.Array[File]): Unit
    
    var multiple: Boolean
  }
  object ThumbnailPlaceholderProps {
    
    inline def apply(handleFiles: js.Array[File] => Callback, multiple: Boolean): ThumbnailPlaceholderProps = {
      val __obj = js.Dynamic.literal(handleFiles = js.Any.fromFunction1((t0: js.Array[File]) => handleFiles(t0).runNow()), multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThumbnailPlaceholderProps]
    }
    
    extension [Self <: ThumbnailPlaceholderProps](x: Self) {
      
      inline def setHandleFiles(value: js.Array[File] => Callback): Self = StObject.set(x, "handleFiles", js.Any.fromFunction1((t0: js.Array[File]) => value(t0).runNow()))
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
}
