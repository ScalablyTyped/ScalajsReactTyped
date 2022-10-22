package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitLastChangeItem extends StObject {
  
  /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
  var commitId: String
  
  /**
    * Gets or sets the path of the item.
    */
  var path: String
}
object GitLastChangeItem {
  
  inline def apply(commitId: String, path: String): GitLastChangeItem = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitLastChangeItem]
  }
  
  extension [Self <: GitLastChangeItem](x: Self) {
    
    inline def setCommitId(value: String): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
