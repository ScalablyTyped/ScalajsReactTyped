package typingsJapgolly.canvg.distDocumentElementsMod.elements

import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.anon.TypeofPathElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentElementsMod.elements.^
import typingsJapgolly.canvg.distDocumentPathElementMod.PathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document/elements", "elements.path")
@js.native
open class path protected () extends PathElement {
  def this(document: Document) = this()
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
  def this(document: Document, node: Unit, captureTextNodes: Boolean) = this()
}
object path {
  
  inline def apply: TypeofPathElement = ^.asInstanceOf[js.Dynamic].selectDynamic("path").asInstanceOf[TypeofPathElement]
}
