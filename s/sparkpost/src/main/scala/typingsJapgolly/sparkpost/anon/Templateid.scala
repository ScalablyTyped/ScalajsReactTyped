package typingsJapgolly.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Templateid extends StObject {
  
  var template_id: String
  
  var use_draft_template: js.UndefOr[Boolean] = js.undefined
}
object Templateid {
  
  inline def apply(template_id: String): Templateid = {
    val __obj = js.Dynamic.literal(template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Templateid]
  }
  
  extension [Self <: Templateid](x: Self) {
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setUse_draft_template(value: Boolean): Self = StObject.set(x, "use_draft_template", value.asInstanceOf[js.Any])
    
    inline def setUse_draft_templateUndefined: Self = StObject.set(x, "use_draft_template", js.undefined)
  }
}
