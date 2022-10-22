package typingsJapgolly.twit.mod

import typingsJapgolly.twit.anon.Id
import typingsJapgolly.twit.anon.Sharedcoordinate
import typingsJapgolly.twit.twitStrings.location
import typingsJapgolly.twit.twitStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachement extends StObject {
  
  var location: js.UndefOr[Sharedcoordinate] = js.undefined
  
  var media: js.UndefOr[Id] = js.undefined
  
  var `type`: location | media
}
object Attachement {
  
  inline def apply(`type`: location | media): Attachement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachement]
  }
  
  extension [Self <: Attachement](x: Self) {
    
    inline def setLocation(value: Sharedcoordinate): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMedia(value: Id): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setType(value: location | media): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
