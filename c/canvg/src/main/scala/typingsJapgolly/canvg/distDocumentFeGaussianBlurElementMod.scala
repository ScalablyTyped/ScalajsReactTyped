package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFeGaussianBlurElementMod {
  
  @JSImport("canvg/dist/Document/FeGaussianBlurElement", "FeGaussianBlurElement")
  @js.native
  open class FeGaussianBlurElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /* protected */ val blurRadius: Double = js.native
    
    val extraFilterDistance: Double = js.native
  }
}
