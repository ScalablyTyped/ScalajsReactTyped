package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFViewerView extends StObject {
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PDFViewerView {
  
  inline def apply(): PDFViewerView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFViewerView]
  }
  
  extension [Self <: PDFViewerView](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
