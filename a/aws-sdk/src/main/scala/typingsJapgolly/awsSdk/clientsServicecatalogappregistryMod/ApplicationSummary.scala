package typingsJapgolly.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The Amazon resource name (ARN) that specifies the application across services.
    */
  var arn: js.UndefOr[ApplicationArn] = js.undefined
  
  /**
    * The ISO-8601 formatted timestamp of the moment when the application was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the application.
    */
  var id: js.UndefOr[ApplicationId] = js.undefined
  
  /**
    *  The ISO-8601 formatted timestamp of the moment when the application was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the application. The name must be unique in the region in which you are creating the application.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object ApplicationSummary {
  
  inline def apply(): ApplicationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  extension [Self <: ApplicationSummary](x: Self) {
    
    inline def setArn(value: ApplicationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ApplicationId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
