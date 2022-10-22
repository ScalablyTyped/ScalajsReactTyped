package typingsJapgolly.pdfkit.PDFKit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _PDFStructureElementChild extends StObject
object _PDFStructureElementChild {
  
  inline def PDFStructureContent(push: typingsJapgolly.pdfkit.PDFKit.PDFStructureContent => Callback): typingsJapgolly.pdfkit.PDFKit.PDFStructureContent = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1((t0: typingsJapgolly.pdfkit.PDFKit.PDFStructureContent) => push(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.pdfkit.PDFKit.PDFStructureContent]
  }
  
  inline def PDFStructureElement(
    add: PDFStructureElementChild => typingsJapgolly.pdfkit.PDFKit.PDFStructureElement,
    end: Callback,
    setAttached: Callback,
    setParent: PDFKitReference => Callback
  ): typingsJapgolly.pdfkit.PDFKit.PDFStructureElement = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), end = end.toJsFn, setAttached = setAttached.toJsFn, setParent = js.Any.fromFunction1((t0: PDFKitReference) => setParent(t0).runNow()))
    __obj.asInstanceOf[typingsJapgolly.pdfkit.PDFKit.PDFStructureElement]
  }
}
