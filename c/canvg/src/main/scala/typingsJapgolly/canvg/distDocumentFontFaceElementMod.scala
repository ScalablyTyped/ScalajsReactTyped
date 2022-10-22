package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFontFaceElementMod {
  
  @JSImport("canvg/dist/Document/FontFaceElement", "FontFaceElement")
  @js.native
  open class FontFaceElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    val ascent: Double = js.native
    
    val descent: Double = js.native
    
    val unitsPerEm: Double = js.native
  }
}
