package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  /**
    * The list of audio messages.
    */
  var AudioList: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.AudioList] = js.undefined
  
  /**
    * The list of SSML messages.
    */
  var SsmlList: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.SsmlList] = js.undefined
  
  /**
    * The list of text messages.
    */
  var TextList: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.TextList] = js.undefined
}
object Content {
  
  inline def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setAudioList(value: AudioList): Self = StObject.set(x, "AudioList", value.asInstanceOf[js.Any])
    
    inline def setAudioListUndefined: Self = StObject.set(x, "AudioList", js.undefined)
    
    inline def setAudioListVarargs(value: Audio*): Self = StObject.set(x, "AudioList", js.Array(value*))
    
    inline def setSsmlList(value: SsmlList): Self = StObject.set(x, "SsmlList", value.asInstanceOf[js.Any])
    
    inline def setSsmlListUndefined: Self = StObject.set(x, "SsmlList", js.undefined)
    
    inline def setSsmlListVarargs(value: Ssml*): Self = StObject.set(x, "SsmlList", js.Array(value*))
    
    inline def setTextList(value: TextList): Self = StObject.set(x, "TextList", value.asInstanceOf[js.Any])
    
    inline def setTextListUndefined: Self = StObject.set(x, "TextList", js.undefined)
    
    inline def setTextListVarargs(value: Text*): Self = StObject.set(x, "TextList", js.Array(value*))
  }
}
