package typingsJapgolly.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticReportImage
  extends StObject
     with BackboneElement {
  
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * The provider of the report should make a comment about each image included in the report.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Reference to the image source.
    */
  var link: Reference
}
object DiagnosticReportImage {
  
  inline def apply(link: Reference): DiagnosticReportImage = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReportImage]
  }
  
  extension [Self <: DiagnosticReportImage](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setLink(value: Reference): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
  }
}
