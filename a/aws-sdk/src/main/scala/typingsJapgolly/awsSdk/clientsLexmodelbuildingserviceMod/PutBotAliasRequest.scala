package typingsJapgolly.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBotAliasRequest extends StObject {
  
  /**
    * The name of the bot.
    */
  var botName: BotName
  
  /**
    * The version of the bot.
    */
  var botVersion: Version
  
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new bot alias, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot alias, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * Settings for conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsRequest] = js.undefined
  
  /**
    * A description of the alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the alias. The name is not case sensitive.
    */
  var name: AliasName
  
  /**
    * A list of tags to add to the bot alias. You can only add tags when you create an alias, you can't use the PutBotAlias operation to update the tags on a bot alias. To update tags, use the TagResource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object PutBotAliasRequest {
  
  inline def apply(botName: BotName, botVersion: Version, name: AliasName): PutBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotAliasRequest]
  }
  
  extension [Self <: PutBotAliasRequest](x: Self) {
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: Version): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setConversationLogs(value: ConversationLogsRequest): Self = StObject.set(x, "conversationLogs", value.asInstanceOf[js.Any])
    
    inline def setConversationLogsUndefined: Self = StObject.set(x, "conversationLogs", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
