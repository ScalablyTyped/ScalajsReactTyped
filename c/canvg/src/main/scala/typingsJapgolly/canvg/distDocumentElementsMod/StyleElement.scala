package typingsJapgolly.canvg.distDocumentElementsMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg/dist/Document/elements", "StyleElement")
@js.native
open class StyleElement protected ()
  extends typingsJapgolly.canvg.distDocumentStyleElementMod.StyleElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
/* static members */
object StyleElement {
  
  @JSImport("canvg/dist/Document/elements", "StyleElement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseExternalUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExternalUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
