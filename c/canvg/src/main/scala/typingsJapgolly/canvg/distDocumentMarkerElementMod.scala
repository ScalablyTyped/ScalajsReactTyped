package typingsJapgolly.canvg

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementMod.Element
import typingsJapgolly.canvg.distPointMod.Point
import typingsJapgolly.canvg.distTypesMod.RenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDocumentMarkerElementMod {
  
  @JSImport("canvg/dist/Document/MarkerElement", "MarkerElement")
  @js.native
  open class MarkerElement protected () extends Element {
    def this(document: Document) = this()
    def this(document: Document, node: HTMLElement) = this()
    def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
    def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
    
    def render(ctx: RenderingContext2D, point: Unit, angle: Double): Unit = js.native
    def render(ctx: RenderingContext2D, point: Point): Unit = js.native
    def render(ctx: RenderingContext2D, point: Point, angle: Double): Unit = js.native
  }
}
