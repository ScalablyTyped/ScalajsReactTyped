package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentidOwnerPullnumber extends StObject {
  
  var path: CommentidOwnerPullnumber
}
object PathCommentidOwnerPullnumber {
  
  inline def apply(path: CommentidOwnerPullnumber): PathCommentidOwnerPullnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentidOwnerPullnumber]
  }
  
  extension [Self <: PathCommentidOwnerPullnumber](x: Self) {
    
    inline def setPath(value: CommentidOwnerPullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
