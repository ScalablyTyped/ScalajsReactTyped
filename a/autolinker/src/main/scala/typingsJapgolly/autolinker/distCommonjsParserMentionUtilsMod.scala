package typingsJapgolly.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsParserMentionUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/mention-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMentionTextChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMentionTextChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidMention(mention: String, serviceName: MentionService): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidMention")(mention.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("autolinker/dist/commonjs/parser/mention-utils", "mentionServices")
  @js.native
  val mentionServices: js.Array[MentionService] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.autolinker.autolinkerStrings.twitter
    - typingsJapgolly.autolinker.autolinkerStrings.instagram
    - typingsJapgolly.autolinker.autolinkerStrings.soundcloud
    - typingsJapgolly.autolinker.autolinkerStrings.tiktok
  */
  trait MentionService extends StObject
  object MentionService {
    
    inline def instagram: typingsJapgolly.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.instagram]
    
    inline def soundcloud: typingsJapgolly.autolinker.autolinkerStrings.soundcloud = "soundcloud".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.soundcloud]
    
    inline def tiktok: typingsJapgolly.autolinker.autolinkerStrings.tiktok = "tiktok".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.tiktok]
    
    inline def twitter: typingsJapgolly.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.twitter]
  }
}
