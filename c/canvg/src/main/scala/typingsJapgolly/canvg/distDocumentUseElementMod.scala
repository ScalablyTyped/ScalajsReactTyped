package typingsJapgolly.canvg

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentPathElementMod.PathElement
import typingsJapgolly.canvg.distDocumentRenderedElementMod.RenderedElement
import typingsJapgolly.canvg.distTransformMod.Transform
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import typingsJapgolly.canvg.mod.BoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentUseElementMod {
  
  @JSImport("canvg/dist/Document/UseElement", "UseElement")
  @js.native
  open class UseElement protected () extends RenderedElement {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    
    /* private */ var cachedElement: Any = js.native
    
    /* protected */ def element: PathElement = js.native
    
    def elementTransform(): Transform = js.native
    
    def getBoundingBox(ctx: CanvasRenderingContext2D): BoundingBox = js.native
    
    def path(ctx: RenderingContext2D): Unit = js.native
  }
}
