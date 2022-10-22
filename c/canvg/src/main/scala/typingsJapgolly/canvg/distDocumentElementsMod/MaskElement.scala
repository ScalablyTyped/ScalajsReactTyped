package typingsJapgolly.canvg.distDocumentElementsMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg/dist/Document/elements", "MaskElement")
@js.native
open class MaskElement protected ()
  extends typingsJapgolly.canvg.distDocumentMaskElementMod.MaskElement {
  def this(document: Document) = this()
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
}
/* static members */
object MaskElement {
  
  @JSImport("canvg/dist/Document/elements", "MaskElement")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvg/dist/Document/elements", "MaskElement.ignoreStyles")
  @js.native
  def ignoreStyles: js.Array[String] = js.native
  inline def ignoreStyles_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ignoreStyles")(x.asInstanceOf[js.Any])
}
