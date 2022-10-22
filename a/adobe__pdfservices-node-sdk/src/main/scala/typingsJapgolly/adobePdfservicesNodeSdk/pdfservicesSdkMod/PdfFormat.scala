package typingsJapgolly.adobePdfservicesNodeSdk.pdfservicesSdkMod

import typingsJapgolly.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.applicationSlashpdf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PdfFormat extends StObject {
  
  /**
    * Represents "application/pdf" media type
    */
  var pdf: applicationSlashpdf
}
object PdfFormat {
  
  inline def apply(): PdfFormat = {
    val __obj = js.Dynamic.literal(pdf = "application/pdf")
    __obj.asInstanceOf[PdfFormat]
  }
  
  extension [Self <: PdfFormat](x: Self) {
    
    inline def setPdf(value: applicationSlashpdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
  }
}
