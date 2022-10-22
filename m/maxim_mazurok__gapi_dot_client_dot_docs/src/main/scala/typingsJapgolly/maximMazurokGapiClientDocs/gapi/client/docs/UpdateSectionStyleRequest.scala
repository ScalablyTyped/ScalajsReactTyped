package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSectionStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `section_style` is implied and must not be specified. A single `"*"` can be used as short-hand for
    * listing every field. For example to update the left margin, set `fields` to `"margin_left"`.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The range overlapping the sections to style. Because section breaks can only be inserted inside the body, the segment ID field must be empty. */
  var range: js.UndefOr[Range] = js.undefined
  
  /**
    * The styles to be set on the section. Certain section style changes may cause other changes in order to mirror the behavior of the Docs editor. See the documentation of SectionStyle
    * for more information.
    */
  var sectionStyle: js.UndefOr[SectionStyle] = js.undefined
}
object UpdateSectionStyleRequest {
  
  inline def apply(): UpdateSectionStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSectionStyleRequest]
  }
  
  extension [Self <: UpdateSectionStyleRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSectionStyle(value: SectionStyle): Self = StObject.set(x, "sectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSectionStyleUndefined: Self = StObject.set(x, "sectionStyle", js.undefined)
  }
}
