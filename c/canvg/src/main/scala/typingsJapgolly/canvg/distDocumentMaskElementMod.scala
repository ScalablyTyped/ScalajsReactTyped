package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentMaskElementMod {
  
  @JSImport("canvg/dist/Document/MaskElement", "MaskElement")
  @js.native
  open class MaskElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(ctx: RenderingContext2D, element: Element): Unit = js.native
  }
  /* static members */
  object MaskElement {
    
    @JSImport("canvg/dist/Document/MaskElement", "MaskElement")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("canvg/dist/Document/MaskElement", "MaskElement.ignoreStyles")
    @js.native
    def ignoreStyles: js.Array[String] = js.native
    inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
  }
}
