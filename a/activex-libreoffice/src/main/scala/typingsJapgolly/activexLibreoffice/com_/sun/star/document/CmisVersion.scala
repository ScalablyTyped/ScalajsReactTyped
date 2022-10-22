package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a CMIS document version. */
trait CmisVersion extends StObject {
  
  /** contains the author that created the version. */
  var Author: String
  
  /** contains the comment the author has left. */
  var Comment: String
  
  /** unique ID of the Cmis version */
  var Id: String
  
  /** specifies the time when the revision was created. */
  var TimeStamp: DateTime
}
object CmisVersion {
  
  inline def apply(Author: String, Comment: String, Id: String, TimeStamp: DateTime): CmisVersion = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmisVersion]
  }
  
  extension [Self <: CmisVersion](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: DateTime): Self = StObject.set(x, "TimeStamp", value.asInstanceOf[js.Any])
  }
}
