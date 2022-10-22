package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess extends StObject {
  
  /** Custom metadata. Dialogflow doesn't impose any structure on this. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccess](x: Self) {
    
    inline def setMetadata(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
