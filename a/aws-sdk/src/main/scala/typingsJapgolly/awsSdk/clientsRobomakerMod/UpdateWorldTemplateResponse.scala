package typingsJapgolly.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorldTemplateResponse extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the world template.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world template was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the world template was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the world template.
    */
  var name: js.UndefOr[TemplateName] = js.undefined
}
object UpdateWorldTemplateResponse {
  
  inline def apply(): UpdateWorldTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorldTemplateResponse]
  }
  
  extension [Self <: UpdateWorldTemplateResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setName(value: TemplateName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
