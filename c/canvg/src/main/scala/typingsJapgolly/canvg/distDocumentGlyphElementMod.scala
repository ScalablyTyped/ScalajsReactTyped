package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentPathElementMod.PathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentGlyphElementMod {
  
  @JSImport("canvg/dist/Document/GlyphElement", "GlyphElement")
  @js.native
  open class GlyphElement protected () extends PathElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    val arabicForm: js.UndefOr[ArabicForm] = js.native
    
    val horizAdvX: Double = js.native
    
    val unicode: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.canvg.canvgStrings.isolated
    - typingsJapgolly.canvg.canvgStrings.terminal
    - typingsJapgolly.canvg.canvgStrings.medial
    - typingsJapgolly.canvg.canvgStrings.initial
  */
  trait ArabicForm extends StObject
  object ArabicForm {
    
    inline def initial: typingsJapgolly.canvg.canvgStrings.initial = "initial".asInstanceOf[typingsJapgolly.canvg.canvgStrings.initial]
    
    inline def isolated: typingsJapgolly.canvg.canvgStrings.isolated = "isolated".asInstanceOf[typingsJapgolly.canvg.canvgStrings.isolated]
    
    inline def medial: typingsJapgolly.canvg.canvgStrings.medial = "medial".asInstanceOf[typingsJapgolly.canvg.canvgStrings.medial]
    
    inline def terminal: typingsJapgolly.canvg.canvgStrings.terminal = "terminal".asInstanceOf[typingsJapgolly.canvg.canvgStrings.terminal]
  }
}
