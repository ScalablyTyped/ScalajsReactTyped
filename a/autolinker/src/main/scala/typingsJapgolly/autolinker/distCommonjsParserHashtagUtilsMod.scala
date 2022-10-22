package typingsJapgolly.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsParserHashtagUtilsMod {
  
  @JSImport("autolinker/dist/commonjs/parser/hashtag-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("autolinker/dist/commonjs/parser/hashtag-utils", "hashtagServices")
  @js.native
  val hashtagServices: js.Array[HashtagService] = js.native
  
  inline def isHashtagTextChar(char: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHashtagTextChar")(char.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidHashtag(hashtag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHashtag")(hashtag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.autolinker.autolinkerStrings.twitter
    - typingsJapgolly.autolinker.autolinkerStrings.facebook
    - typingsJapgolly.autolinker.autolinkerStrings.instagram
    - typingsJapgolly.autolinker.autolinkerStrings.tiktok
  */
  trait HashtagService extends StObject
  object HashtagService {
    
    inline def facebook: typingsJapgolly.autolinker.autolinkerStrings.facebook = "facebook".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.facebook]
    
    inline def instagram: typingsJapgolly.autolinker.autolinkerStrings.instagram = "instagram".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.instagram]
    
    inline def tiktok: typingsJapgolly.autolinker.autolinkerStrings.tiktok = "tiktok".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.tiktok]
    
    inline def twitter: typingsJapgolly.autolinker.autolinkerStrings.twitter = "twitter".asInstanceOf[typingsJapgolly.autolinker.autolinkerStrings.twitter]
  }
}
