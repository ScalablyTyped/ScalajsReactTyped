package typingsJapgolly.kendoUi.anon

import typingsJapgolly.kendoUi.kendo.ui.PDFViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPDFViewer extends StObject {
  
  /* static member */
  def extend(proto: js.Object): PDFViewer
  
  /* static member */
  var fn: PDFViewer
}
object TypeofPDFViewer {
  
  inline def apply(extend: js.Object => PDFViewer, fn: PDFViewer): TypeofPDFViewer = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPDFViewer]
  }
  
  extension [Self <: TypeofPDFViewer](x: Self) {
    
    inline def setExtend(value: js.Object => PDFViewer): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setFn(value: PDFViewer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
