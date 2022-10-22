package typingsJapgolly.musickitJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorialNotes extends StObject {
  
  var artwork: typingsJapgolly.musickitJs.MusicKit.Artwork
  
  var editorialNotes: js.UndefOr[typingsJapgolly.musickitJs.MusicKit.EditorialNotes] = js.undefined
  
  var name: String
  
  var url: String
}
object EditorialNotes {
  
  inline def apply(artwork: typingsJapgolly.musickitJs.MusicKit.Artwork, name: String, url: String): EditorialNotes = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorialNotes]
  }
  
  extension [Self <: EditorialNotes](x: Self) {
    
    inline def setArtwork(value: typingsJapgolly.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotes(value: typingsJapgolly.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
