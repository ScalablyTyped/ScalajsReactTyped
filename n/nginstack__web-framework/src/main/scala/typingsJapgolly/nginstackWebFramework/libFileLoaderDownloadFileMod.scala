package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileLoaderDownloadFileMod {
  
  inline def apply(name: String, contentFileName: String, contentType: String): Unit = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], contentFileName.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/file-loader/DownloadFile", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DownloadFile {
    def this(name: String, contentFileName: String, contentType: String) = this()
    
    /* CompleteClass */
    override def openFile(): typingsJapgolly.nginstackEngine.libIoFileMod.^ = js.native
  }
  @JSImport("@nginstack/web-framework/lib/file-loader/DownloadFile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DownloadFile extends StObject {
    
    def openFile(): typingsJapgolly.nginstackEngine.libIoFileMod.^
  }
  object DownloadFile {
    
    inline def apply(openFile: CallbackTo[typingsJapgolly.nginstackEngine.libIoFileMod.^]): DownloadFile = {
      val __obj = js.Dynamic.literal(openFile = openFile.toJsFn)
      __obj.asInstanceOf[DownloadFile]
    }
    
    extension [Self <: DownloadFile](x: Self) {
      
      inline def setOpenFile(value: CallbackTo[typingsJapgolly.nginstackEngine.libIoFileMod.^]): Self = StObject.set(x, "openFile", value.toJsFn)
    }
  }
}
