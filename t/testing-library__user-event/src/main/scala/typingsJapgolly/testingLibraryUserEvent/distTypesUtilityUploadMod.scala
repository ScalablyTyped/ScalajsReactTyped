package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.File
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityUploadMod {
  
  @JSImport("@testing-library/user-event/dist/types/utility/upload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def upload(element: HTMLElement, fileOrFiles: js.Array[File]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def upload(element: HTMLElement, fileOrFiles: File): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(element.asInstanceOf[js.Any], fileOrFiles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait uploadInit extends StObject {
    
    var changeInit: js.UndefOr[EventInit] = js.undefined
  }
  object uploadInit {
    
    inline def apply(): uploadInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[uploadInit]
    }
    
    extension [Self <: uploadInit](x: Self) {
      
      inline def setChangeInit(value: EventInit): Self = StObject.set(x, "changeInit", value.asInstanceOf[js.Any])
      
      inline def setChangeInitUndefined: Self = StObject.set(x, "changeInit", js.undefined)
    }
  }
}
