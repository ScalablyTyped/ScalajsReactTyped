package typingsJapgolly.html2canvas

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distTypesDom@MocksDocumentClonerMod` {
  
  @JSImport("html2canvas/dist/types/dom/@/mocks/document-cloner", "DocumentCloner")
  @js.native
  open class DocumentCloner () extends StObject {
    
    var clonedReferenceElement: js.UndefOr[HTMLElement] = js.native
    
    def toIFrame(): js.Promise[HTMLIFrameElement] = js.native
  }
  /* static members */
  object DocumentCloner {
    
    @JSImport("html2canvas/dist/types/dom/@/mocks/document-cloner", "DocumentCloner")
    @js.native
    val ^ : js.Any = js.native
    
    inline def destroy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Boolean]
  }
}
