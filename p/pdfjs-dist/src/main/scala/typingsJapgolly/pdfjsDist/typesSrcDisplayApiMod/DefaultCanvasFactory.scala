package typingsJapgolly.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.pdfjsDist.anon.OwnerDocument
import typingsJapgolly.pdfjsDist.typesSrcDisplayApiMod.^
import typingsJapgolly.pdfjsDist.typesSrcDisplayDisplayUtilsMod.DOMCanvasFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("pdfjs-dist/types/src/display/api", "DefaultCanvasFactory")
@js.native
open class DefaultCanvasFactory () extends DOMCanvasFactory {
  def this(hasOwnerDocument: OwnerDocument) = this()
}
object DefaultCanvasFactory {
  
  inline def apply: Instantiable1[/* hasOwnerDocument */ js.UndefOr[OwnerDocument], DOMCanvasFactory] = ^.asInstanceOf[js.Dynamic].selectDynamic("DefaultCanvasFactory").asInstanceOf[Instantiable1[/* hasOwnerDocument */ js.UndefOr[OwnerDocument], DOMCanvasFactory]]
}
