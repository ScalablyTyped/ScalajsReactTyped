package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distBoundingBoxMod.BoundingBox
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentRenderedElementMod.RenderedElement
import typingsJapgolly.std.CanvasImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentImageElementMod {
  
  @JSImport("canvg/dist/Document/ImageElement", "ImageElement")
  @js.native
  open class ImageElement protected () extends RenderedElement {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    def getBoundingBox(): BoundingBox = js.native
    
    /* protected */ var image: js.UndefOr[CanvasImageSource | String] = js.native
    
    /* protected */ def loadImage(href: String): js.Promise[Unit] = js.native
    
    /* protected */ def loadSvg(href: String): js.Promise[Unit] = js.native
    
    var loaded: Boolean = js.native
  }
}
