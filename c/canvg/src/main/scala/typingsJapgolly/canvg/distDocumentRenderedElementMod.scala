package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentRenderedElementMod {
  
  /* note: abstract class */ @JSImport("canvg/dist/Document/RenderedElement", "RenderedElement")
  @js.native
  open class RenderedElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    
    /* protected */ def calculateOpacity(): Double = js.native
    
    /* private */ var modifiedEmSizeStack: Any = js.native
    
    def setContext(ctx: RenderingContext2D, fromMeasure: Boolean): Unit = js.native
  }
}
