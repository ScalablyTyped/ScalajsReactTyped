package typingsJapgolly.musickitJs.MusicKit

import typingsJapgolly.musickitJs.musickitJsStrings.activities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource object that represents an activity curator.
  * https://developer.apple.com/documentation/applemusicapi/activities-ui5
  */
trait Activities
  extends StObject
     with Resource {
  
  @JSName("attributes")
  var attributes_Activities: js.UndefOr[typingsJapgolly.musickitJs.anon.EditorialNotes] = js.undefined
  
  @JSName("relationships")
  var relationships_Activities: typingsJapgolly.musickitJs.anon.Playlists
  
  @JSName("type")
  var type_Activities: activities
}
object Activities {
  
  inline def apply(href: String, id: String, relationships: typingsJapgolly.musickitJs.anon.Playlists): Activities = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("activities")
    __obj.asInstanceOf[Activities]
  }
  
  extension [Self <: Activities](x: Self) {
    
    inline def setAttributes(value: typingsJapgolly.musickitJs.anon.EditorialNotes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setRelationships(value: typingsJapgolly.musickitJs.anon.Playlists): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    inline def setType(value: activities): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
