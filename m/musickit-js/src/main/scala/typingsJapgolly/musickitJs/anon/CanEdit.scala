package typingsJapgolly.musickitJs.anon

import typingsJapgolly.musickitJs.MusicKit.DescriptionAttribute
import typingsJapgolly.musickitJs.MusicKit.PlayParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanEdit extends StObject {
  
  var artwork: js.UndefOr[typingsJapgolly.musickitJs.MusicKit.Artwork] = js.undefined
  
  var canEdit: Boolean
  
  var dateAdded: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[DescriptionAttribute] = js.undefined
  
  var hasCatalog: Boolean
  
  var name: String
  
  var playParams: js.UndefOr[PlayParameters] = js.undefined
}
object CanEdit {
  
  inline def apply(canEdit: Boolean, hasCatalog: Boolean, name: String): CanEdit = {
    val __obj = js.Dynamic.literal(canEdit = canEdit.asInstanceOf[js.Any], hasCatalog = hasCatalog.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanEdit]
  }
  
  extension [Self <: CanEdit](x: Self) {
    
    inline def setArtwork(value: typingsJapgolly.musickitJs.MusicKit.Artwork): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
    
    inline def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
    
    inline def setCanEdit(value: Boolean): Self = StObject.set(x, "canEdit", value.asInstanceOf[js.Any])
    
    inline def setDateAdded(value: String): Self = StObject.set(x, "dateAdded", value.asInstanceOf[js.Any])
    
    inline def setDateAddedUndefined: Self = StObject.set(x, "dateAdded", js.undefined)
    
    inline def setDescription(value: DescriptionAttribute): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHasCatalog(value: Boolean): Self = StObject.set(x, "hasCatalog", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlayParams(value: PlayParameters): Self = StObject.set(x, "playParams", value.asInstanceOf[js.Any])
    
    inline def setPlayParamsUndefined: Self = StObject.set(x, "playParams", js.undefined)
  }
}
