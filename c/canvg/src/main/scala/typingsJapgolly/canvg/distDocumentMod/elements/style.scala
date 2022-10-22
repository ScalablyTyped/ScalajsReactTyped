package typingsJapgolly.canvg.distDocumentMod.elements

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.anon.TypeofStyleElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentMod.elements.^
import typingsJapgolly.canvg.distDocumentStyleElementMod.StyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document", "elements.style")
@js.native
open class style protected () extends StyleElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object style {
  
  inline def apply: TypeofStyleElement = ^.asInstanceOf[js.Dynamic].selectDynamic("style").asInstanceOf[TypeofStyleElement]
}
