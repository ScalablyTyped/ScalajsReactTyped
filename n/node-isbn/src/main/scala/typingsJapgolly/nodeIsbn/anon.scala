package typingsJapgolly.nodeIsbn

import typingsJapgolly.nodeIsbn.nodeIsbnStrings.google
import typingsJapgolly.nodeIsbn.nodeIsbnStrings.isbndb
import typingsJapgolly.nodeIsbn.nodeIsbnStrings.openlibrary
import typingsJapgolly.nodeIsbn.nodeIsbnStrings.worldcat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GOOGLE extends StObject {
    
    var GOOGLE: google
    
    var ISBNDB: isbndb
    
    var OPENLIBRARY: openlibrary
    
    var WORLDCAT: worldcat
  }
  object GOOGLE {
    
    inline def apply(): GOOGLE = {
      val __obj = js.Dynamic.literal(GOOGLE = "google", ISBNDB = "isbndb", OPENLIBRARY = "openlibrary", WORLDCAT = "worldcat")
      __obj.asInstanceOf[GOOGLE]
    }
    
    extension [Self <: GOOGLE](x: Self) {
      
      inline def setGOOGLE(value: google): Self = StObject.set(x, "GOOGLE", value.asInstanceOf[js.Any])
      
      inline def setISBNDB(value: isbndb): Self = StObject.set(x, "ISBNDB", value.asInstanceOf[js.Any])
      
      inline def setOPENLIBRARY(value: openlibrary): Self = StObject.set(x, "OPENLIBRARY", value.asInstanceOf[js.Any])
      
      inline def setWORLDCAT(value: worldcat): Self = StObject.set(x, "WORLDCAT", value.asInstanceOf[js.Any])
    }
  }
  
  trait SmallThumbnail extends StObject {
    
    var smallThumbnail: String
    
    var thumbnail: String
  }
  object SmallThumbnail {
    
    inline def apply(smallThumbnail: String, thumbnail: String): SmallThumbnail = {
      val __obj = js.Dynamic.literal(smallThumbnail = smallThumbnail.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[SmallThumbnail]
    }
    
    extension [Self <: SmallThumbnail](x: Self) {
      
      inline def setSmallThumbnail(value: String): Self = StObject.set(x, "smallThumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
}
