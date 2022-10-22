package typingsJapgolly.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTemplateRequest extends StObject {
  
  /**
    * The content of the email, composed of a subject line, an HTML part, and a text-only part.
    */
  var Template: typingsJapgolly.awsSdk.clientsSesMod.Template
}
object CreateTemplateRequest {
  
  inline def apply(Template: Template): CreateTemplateRequest = {
    val __obj = js.Dynamic.literal(Template = Template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateRequest]
  }
  
  extension [Self <: CreateTemplateRequest](x: Self) {
    
    inline def setTemplate(value: Template): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
