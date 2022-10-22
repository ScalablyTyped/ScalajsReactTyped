package typingsJapgolly.reactDndHtml5Backend

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.dndCore.distInterfacesMod.BackendFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-html5-backend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd-html5-backend", "HTML5Backend")
  @js.native
  val HTML5Backend: BackendFactory = js.native
  
  object NativeTypes {
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.FILE")
    @js.native
    val FILE: /* "__NATIVE_FILE__" */ String = js.native
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.HTML")
    @js.native
    val HTML: /* "__NATIVE_HTML__" */ String = js.native
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.TEXT")
    @js.native
    val TEXT: /* "__NATIVE_TEXT__" */ String = js.native
    
    @JSImport("react-dnd-html5-backend", "NativeTypes.URL")
    @js.native
    val URL: /* "__NATIVE_URL__" */ String = js.native
  }
  
  inline def getEmptyImage(): HTMLImageElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmptyImage")().asInstanceOf[HTMLImageElement]
}
