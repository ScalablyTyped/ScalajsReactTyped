package typingsJapgolly.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  /** Length of the substring in the plain-text message body this annotation corresponds to. */
  var length: js.UndefOr[Double] = js.undefined
  
  /** The metadata for a slash command. */
  var slashCommand: js.UndefOr[SlashCommandMetadata] = js.undefined
  
  /** Start index (0-based, inclusive) in the plain-text message body this annotation corresponds to. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** The type of this annotation. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The metadata of user mention. */
  var userMention: js.UndefOr[UserMentionMetadata] = js.undefined
}
object Annotation {
  
  inline def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setSlashCommand(value: SlashCommandMetadata): Self = StObject.set(x, "slashCommand", value.asInstanceOf[js.Any])
    
    inline def setSlashCommandUndefined: Self = StObject.set(x, "slashCommand", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserMention(value: UserMentionMetadata): Self = StObject.set(x, "userMention", value.asInstanceOf[js.Any])
    
    inline def setUserMentionUndefined: Self = StObject.set(x, "userMention", js.undefined)
  }
}
