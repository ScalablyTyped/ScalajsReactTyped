package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.musickitJsStrings.Genre
import typingsJapgolly.musickitJs.musickitJsStrings.Show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artwork extends StObject {
  
  var artwork: typingsJapgolly.musickitJs.MusicKit.Artwork
  
  var editorialNotes: js.UndefOr[typingsJapgolly.musickitJs.MusicKit.EditorialNotes] = js.undefined
  
  var kind: typingsJapgolly.musickitJs.musickitJsStrings.Curator | Genre | Show
  
  var name: String
  
  var shortName: js.UndefOr[String] = js.undefined
  
  var showHostName: js.UndefOr[String] = js.undefined
  
  var url: String
}
object Artwork {
  
  inline def apply(
    artwork: typingsJapgolly.musickitJs.MusicKit.Artwork,
    kind: typingsJapgolly.musickitJs.musickitJsStrings.Curator | Genre | Show,
    name: String,
    url: String
  ): Artwork = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
  
  extension [Self <: Artwork](x: Self) {
    
    inline def setArtwork(value: typingsJapgolly.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotes(value: typingsJapgolly.musickitJs.MusicKit.EditorialNotes): Self = StObject.set(x, "editorialNotes", value.asInstanceOf[js.Any])
    
    inline def setEditorialNotesUndefined: Self = StObject.set(x, "editorialNotes", js.undefined)
    
    inline def setKind(value: typingsJapgolly.musickitJs.musickitJsStrings.Curator | Genre | Show): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setShowHostName(value: String): Self = StObject.set(x, "showHostName", value.asInstanceOf[js.Any])
    
    inline def setShowHostNameUndefined: Self = StObject.set(x, "showHostName", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
