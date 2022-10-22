package typingsJapgolly.canvg.distDocumentMod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("canvg/dist/Document", "Element")
@js.native
open class Element protected ()
  extends typingsJapgolly.canvg.distDocumentElementsMod.Element {
  def this(document: typingsJapgolly.canvg.distDocumentDocumentMod.Document) = this()
  def this(document: typingsJapgolly.canvg.distDocumentDocumentMod.Document, node: HTMLElement) = this()
  def this(
    document: typingsJapgolly.canvg.distDocumentDocumentMod.Document,
    node: HTMLElement,
    captureTextNodes: Boolean
  ) = this()
  def this(
    document: typingsJapgolly.canvg.distDocumentDocumentMod.Document,
    node: Unit,
    captureTextNodes: Boolean
  ) = this()
}
/* static members */
object Element {
  
  @JSImport("canvg/dist/Document", "Element.ignoreChildTypes")
  @js.native
  val ignoreChildTypes: js.Array[String] = js.native
}
