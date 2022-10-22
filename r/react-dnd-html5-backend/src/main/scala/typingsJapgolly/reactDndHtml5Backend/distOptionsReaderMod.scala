package typingsJapgolly.reactDndHtml5Backend

import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.reactDndHtml5Backend.distBrowserDetectorMod.global.Window
import typingsJapgolly.reactDndHtml5Backend.distTypesMod.HTML5BackendContext
import typingsJapgolly.reactDndHtml5Backend.distTypesMod.HTML5BackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsReaderMod {
  
  @JSImport("react-dnd-html5-backend/dist/OptionsReader", "OptionsReader")
  @js.native
  open class OptionsReader protected () extends StObject {
    def this(globalContext: HTML5BackendContext) = this()
    def this(globalContext: HTML5BackendContext, options: HTML5BackendOptions) = this()
    
    def document: js.UndefOr[Document] = js.native
    
    /* private */ var globalContext: Any = js.native
    
    /* private */ var optionsArgs: Any = js.native
    
    var ownerDocument: Document | Null = js.native
    
    def rootElement: js.UndefOr[Node] = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}
