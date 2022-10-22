package typingsJapgolly.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderingConfiguration extends StObject {
  
  /**
    * A URI template containing exactly one variable in ${variableName} format. This can only be set for EXTERNAL knowledge bases. For Salesforce and ServiceNow, the variable must be one of the following:   Salesforce: Id, ArticleNumber, VersionNumber, Title, PublishStatus, or IsDeleted    ServiceNow: number, short_description, sys_mod_count, workflow_state, or active     &lt;p&gt;The variable is replaced with the actual value for a piece of content when calling &lt;a href=&quot;https://docs.aws.amazon.com/wisdom/latest/APIReference/API_GetContent.html&quot;&gt;GetContent&lt;/a&gt;. &lt;/p&gt; 
    */
  var templateUri: js.UndefOr[Uri] = js.undefined
}
object RenderingConfiguration {
  
  inline def apply(): RenderingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingConfiguration]
  }
  
  extension [Self <: RenderingConfiguration](x: Self) {
    
    inline def setTemplateUri(value: Uri): Self = StObject.set(x, "templateUri", value.asInstanceOf[js.Any])
    
    inline def setTemplateUriUndefined: Self = StObject.set(x, "templateUri", js.undefined)
  }
}
