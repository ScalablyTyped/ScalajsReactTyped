package typingsJapgolly.canvg.mod.elements

import org.scalablytyped.runtime.Instantiable3
import org.scalajs.dom.HTMLElement
import typingsJapgolly.canvg.distDocumentDocumentMod.Document
import typingsJapgolly.canvg.distDocumentLinearGradientElementMod.LinearGradientElement
import typingsJapgolly.canvg.mod.elements.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("canvg", "elements.linearGradient")
@js.native
open class linearGradient protected () extends LinearGradientElement {
  def this(document: Document, node: HTMLElement) = this()
  def this(document: Document, node: HTMLElement, captureTextNodes: Boolean) = this()
}
object linearGradient {
  
  inline def apply: Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    LinearGradientElement
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("linearGradient").asInstanceOf[Instantiable3[
    /* document */ Document, 
    /* node */ HTMLElement, 
    /* captureTextNodes */ js.UndefOr[Boolean], 
    LinearGradientElement
  ]]
}
