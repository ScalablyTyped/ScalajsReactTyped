package typingsJapgolly.html2canvas

import org.scalajs.dom.Element
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesCssLayoutBoundsMod.Bounds
import typingsJapgolly.html2canvas.distTypesCssMod.CSSParsedDeclaration
import typingsJapgolly.html2canvas.distTypesDomTextContainerMod.TextContainer
import typingsJapgolly.html2canvas.html2canvasInts.`16`
import typingsJapgolly.html2canvas.html2canvasInts.`2`
import typingsJapgolly.html2canvas.html2canvasInts.`4`
import typingsJapgolly.html2canvas.html2canvasInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDomElementContainerMod {
  
  @JSImport("html2canvas/dist/types/dom/element-container", "ElementContainer")
  @js.native
  open class ElementContainer protected () extends StObject {
    def this(context: Context, element: Element) = this()
    
    var bounds: Bounds = js.native
    
    /* protected */ val context: Context = js.native
    
    val elements: js.Array[ElementContainer] = js.native
    
    var flags: Double = js.native
    
    val styles: CSSParsedDeclaration = js.native
    
    val textNodes: js.Array[TextContainer] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.html2canvas.html2canvasInts.`2`
    - typingsJapgolly.html2canvas.html2canvasInts.`4`
    - typingsJapgolly.html2canvas.html2canvasInts.`8`
    - typingsJapgolly.html2canvas.html2canvasInts.`16`
  */
  trait FLAGS extends StObject
  object FLAGS {
    
    inline def CREATES_REAL_STACKING_CONTEXT: `4` = 4.asInstanceOf[`4`]
    
    inline def CREATES_STACKING_CONTEXT: `2` = 2.asInstanceOf[`2`]
    
    inline def DEBUG_RENDER: `16` = 16.asInstanceOf[`16`]
    
    inline def IS_LIST_OWNER: `8` = 8.asInstanceOf[`8`]
  }
}
