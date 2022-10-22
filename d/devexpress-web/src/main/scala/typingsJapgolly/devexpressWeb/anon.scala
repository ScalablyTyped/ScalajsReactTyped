package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ModifyPdfDocument extends StObject {
    
    var modifyPdfDocument: js.UndefOr[js.Function1[/* pdfDocument */ Any, Unit]] = js.undefined
    
    var modifyPdfPage: js.UndefOr[js.Function1[/* pdfDocument */ Any, Unit]] = js.undefined
  }
  object ModifyPdfDocument {
    
    inline def apply(): ModifyPdfDocument = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifyPdfDocument]
    }
    
    extension [Self <: ModifyPdfDocument](x: Self) {
      
      inline def setModifyPdfDocument(value: /* pdfDocument */ Any => Callback): Self = StObject.set(x, "modifyPdfDocument", js.Any.fromFunction1((t0: /* pdfDocument */ Any) => value(t0).runNow()))
      
      inline def setModifyPdfDocumentUndefined: Self = StObject.set(x, "modifyPdfDocument", js.undefined)
      
      inline def setModifyPdfPage(value: /* pdfDocument */ Any => Callback): Self = StObject.set(x, "modifyPdfPage", js.Any.fromFunction1((t0: /* pdfDocument */ Any) => value(t0).runNow()))
      
      inline def setModifyPdfPageUndefined: Self = StObject.set(x, "modifyPdfPage", js.undefined)
    }
  }
}
