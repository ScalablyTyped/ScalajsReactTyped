package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEmailTemplatesResponse extends StObject {
  
  /**
    * A token indicating that there are additional email templates available to be listed. Pass this token to a subsequent ListEmailTemplates call to retrieve the next 10 email templates.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
  
  /**
    * An array the contains the name and creation time stamp for each template in your Amazon SES account.
    */
  var TemplatesMetadata: js.UndefOr[EmailTemplateMetadataList] = js.undefined
}
object ListEmailTemplatesResponse {
  
  inline def apply(): ListEmailTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailTemplatesResponse]
  }
  
  extension [Self <: ListEmailTemplatesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTemplatesMetadata(value: EmailTemplateMetadataList): Self = StObject.set(x, "TemplatesMetadata", value.asInstanceOf[js.Any])
    
    inline def setTemplatesMetadataUndefined: Self = StObject.set(x, "TemplatesMetadata", js.undefined)
    
    inline def setTemplatesMetadataVarargs(value: EmailTemplateMetadata*): Self = StObject.set(x, "TemplatesMetadata", js.Array(value*))
  }
}
