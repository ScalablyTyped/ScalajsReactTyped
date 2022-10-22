package typingsJapgolly.appleMusicApi.AppleMusicApi

import typingsJapgolly.appleMusicApi.appleMusicApiStrings.artists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://developer.apple.com/documentation/applemusicapi/artist
trait Artist
  extends StObject
     with Resource {
  
  var attributes: js.UndefOr[typingsJapgolly.appleMusicApi.anon.EditorialNotes] = js.undefined
  
  var relationships: js.UndefOr[ArtistRelationships] = js.undefined
  
  @JSName("type")
  var type_Artist: artists
}
object Artist {
  
  inline def apply(id: String): Artist = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("artists")
    __obj.asInstanceOf[Artist]
  }
  
  extension [Self <: Artist](x: Self) {
    
    inline def setAttributes(value: typingsJapgolly.appleMusicApi.anon.EditorialNotes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: ArtistRelationships): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    inline def setType(value: artists): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
