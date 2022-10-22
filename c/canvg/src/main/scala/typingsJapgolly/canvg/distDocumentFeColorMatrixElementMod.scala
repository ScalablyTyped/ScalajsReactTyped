package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFeColorMatrixElementMod {
  
  @JSImport("canvg/dist/Document/FeColorMatrixElement", "FeColorMatrixElement")
  @js.native
  open class FeColorMatrixElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, _x: Double, _y: Double, width: Double, height: Double): Unit = js.native
    
    /* protected */ val includeOpacity: Boolean = js.native
    
    /* protected */ val matrix: js.Array[Double] = js.native
  }
}
