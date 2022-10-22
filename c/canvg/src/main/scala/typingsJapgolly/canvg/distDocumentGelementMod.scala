package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distBoundingBoxMod.BoundingBox
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentRenderedElementMod.RenderedElement
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentGelementMod {
  
  @JSImport("canvg/dist/Document/GElement", "GElement")
  @js.native
  open class GElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    
    def getBoundingBox(ctx: RenderingContext2D): BoundingBox = js.native
  }
}
