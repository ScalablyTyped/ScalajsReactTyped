package typingsJapgolly.canvg.distDocumentElementsMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("canvg/dist/Document/elements", "Element")
@js.native
open class Element protected ()
  extends typingsJapgolly.canvg.distDocumentElementMod.Element {
  def this(document: Document) = this()
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
}
/* static members */
object Element {
  
  @JSImport("canvg/dist/Document/elements", "Element.ignoreChildTypes")
  @js.native
  val ignoreChildTypes: js.Array[String] = js.native
}
