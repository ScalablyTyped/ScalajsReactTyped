package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomVerificationEmailTemplateRequest extends StObject {
  
  /**
    * The name of the custom verification email template that you want to delete.
    */
  var TemplateName: EmailTemplateName
}
object DeleteCustomVerificationEmailTemplateRequest {
  
  inline def apply(TemplateName: EmailTemplateName): DeleteCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
  }
  
  extension [Self <: DeleteCustomVerificationEmailTemplateRequest](x: Self) {
    
    inline def setTemplateName(value: EmailTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
  }
}
