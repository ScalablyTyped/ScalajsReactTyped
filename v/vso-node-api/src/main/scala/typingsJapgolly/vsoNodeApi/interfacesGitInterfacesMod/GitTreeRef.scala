package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitTreeRef extends StObject {
  
  var _links: Any
  
  /**
    * SHA1 hash of git object
    */
  var objectId: String
  
  /**
    * Sum of sizes of all children
    */
  var size: Double
  
  /**
    * Blobs and trees under this tree
    */
  var treeEntries: js.Array[GitTreeEntryRef]
  
  /**
    * Url to tree
    */
  var url: String
}
object GitTreeRef {
  
  inline def apply(_links: Any, objectId: String, size: Double, treeEntries: js.Array[GitTreeEntryRef], url: String): GitTreeRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], treeEntries = treeEntries.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitTreeRef]
  }
  
  extension [Self <: GitTreeRef](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTreeEntries(value: js.Array[GitTreeEntryRef]): Self = StObject.set(x, "treeEntries", value.asInstanceOf[js.Any])
    
    inline def setTreeEntriesVarargs(value: GitTreeEntryRef*): Self = StObject.set(x, "treeEntries", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
