package typingsJapgolly.canvg.distDocumentMod.elements

import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentAelementMod.AElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentMod.elements.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg/dist/Document", "elements.a")
@js.native
open class a protected () extends AElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object a {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    AElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("a").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    AElement
  ]]
}
