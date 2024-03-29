package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertSectionBreakRequest extends StObject {
  
  /**
    * Inserts a newline and a section break at the end of the document body. Section breaks cannot be inserted inside a footnote, header or footer. Because section breaks can only be
    * inserted inside the body, the segment ID field must be empty.
    */
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  
  /**
    * Inserts a newline and a section break at a specific index in the document. The section break must be inserted inside the bounds of an existing Paragraph. For instance, it cannot be
    * inserted at a table's start index (i.e. between the table and its preceding paragraph). Section breaks cannot be inserted inside a table, equation, footnote, header, or footer.
    * Since section breaks can only be inserted inside the body, the segment ID field must be empty.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The type of section to insert. */
  var sectionType: js.UndefOr[String] = js.undefined
}
object InsertSectionBreakRequest {
  
  inline def apply(): InsertSectionBreakRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertSectionBreakRequest]
  }
  
  extension [Self <: InsertSectionBreakRequest](x: Self) {
    
    inline def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    inline def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setSectionType(value: String): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    inline def setSectionTypeUndefined: Self = StObject.set(x, "sectionType", js.undefined)
  }
}
