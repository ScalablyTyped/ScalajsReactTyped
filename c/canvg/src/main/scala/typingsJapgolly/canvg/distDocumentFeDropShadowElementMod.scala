package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentFeDropShadowElementMod {
  
  @JSImport("canvg/dist/Document/FeDropShadowElement", "FeDropShadowElement")
  @js.native
  open class FeDropShadowElement protected () extends Element {
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    
    @JSName("apply")
    def apply(_underscore: RenderingContext2D, _x: Double, _y: Double, _width: Double, _height: Double): Unit = js.native
  }
}
