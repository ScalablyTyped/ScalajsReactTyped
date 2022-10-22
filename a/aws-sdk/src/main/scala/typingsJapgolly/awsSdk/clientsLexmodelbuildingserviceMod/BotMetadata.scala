package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotMetadata extends StObject {
  
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The date that the bot was updated. When you create a bot, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the bot. 
    */
  var name: js.UndefOr[BotName] = js.undefined
  
  /**
    * The status of the bot.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object BotMetadata {
  
  inline def apply(): BotMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotMetadata]
  }
  
  extension [Self <: BotMetadata](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
