package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3Changelog extends StObject {
  
  /** The action of the change. */
  var action: js.UndefOr[String] = js.undefined
  
  /** The timestamp of the change. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** The affected resource display name of the change. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the changelog. Format: `projects//locations//agents//changelogs/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The affected resource name of the change. */
  var resource: js.UndefOr[String] = js.undefined
  
  /** The affected resource type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Email address of the authenticated user. */
  var userEmail: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3Changelog {
  
  inline def apply(): GoogleCloudDialogflowCxV3Changelog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3Changelog]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3Changelog](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
    
    inline def setUserEmailUndefined: Self = StObject.set(x, "userEmail", js.undefined)
  }
}
