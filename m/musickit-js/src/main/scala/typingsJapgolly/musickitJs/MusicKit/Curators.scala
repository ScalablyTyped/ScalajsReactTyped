package typingsJapgolly.musickitJs.MusicKit

import typingsJapgolly.musickitJs.musickitJsStrings.curators
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents a curator.
  * https://developer.apple.com/documentation/applemusicapi/curators-uja
  */
trait Curators
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Curators: js.UndefOr[typingsJapgolly.musickitJs.anon.EditorialNotes] = js.undefined
  
  @JSName("relationships")
  var relationships_Curators: typingsJapgolly.musickitJs.anon.Playlists
  
  @JSName("type")
  var type_Curators: curators
}
object Curators {
  
  inline def apply(href: String, id: String, relationships: typingsJapgolly.musickitJs.anon.Playlists): Curators = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("curators")
    __obj.asInstanceOf[Curators]
  }
  
  extension [Self <: Curators](x: Self) {
    
    inline def setAttributes(value: typingsJapgolly.musickitJs.anon.EditorialNotes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: typingsJapgolly.musickitJs.anon.Playlists): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: curators): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
