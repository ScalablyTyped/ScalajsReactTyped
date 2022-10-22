package typingsJapgolly.pdfkit.PDFKit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PDFStructureElement */
trait PDFStructureElement
  extends StObject
     with _PDFStructureElementChild {
  
  def add(el: PDFStructureElementChild): PDFStructureElement
  
  def end(): Unit
  
  def setAttached(): Unit
  
  def setParent(parentRef: PDFKitReference): Unit
}
object PDFStructureElement {
  
  inline def apply(
    add: PDFStructureElementChild => PDFStructureElement,
    end: Callback,
    setAttached: Callback,
    setParent: PDFKitReference => Callback
  ): PDFStructureElement = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), end = end.toJsFn, setAttached = setAttached.toJsFn, setParent = js.Any.fromFunction1((t0: PDFKitReference) => setParent(t0).runNow()))
    __obj.asInstanceOf[PDFStructureElement]
  }
  
  extension [Self <: PDFStructureElement](x: Self) {
    
    inline def setAdd(value: PDFStructureElementChild => PDFStructureElement): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setSetAttached(value: Callback): Self = StObject.set(x, "setAttached", value.toJsFn)
    
    inline def setSetParent(value: PDFKitReference => Callback): Self = StObject.set(x, "setParent", js.Any.fromFunction1((t0: PDFKitReference) => value(t0).runNow()))
  }
}
