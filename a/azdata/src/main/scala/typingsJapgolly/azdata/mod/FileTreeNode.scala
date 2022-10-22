package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileTreeNode extends StObject {
  
  var children: js.Array[FileTreeNode]
  
  var fullPath: String
  
  var isExpanded: Boolean
  
  var isFile: Boolean
  
  var name: String
}
object FileTreeNode {
  
  inline def apply(
    children: js.Array[FileTreeNode],
    fullPath: String,
    isExpanded: Boolean,
    isFile: Boolean,
    name: String
  ): FileTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], fullPath = fullPath.asInstanceOf[js.Any], isExpanded = isExpanded.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTreeNode]
  }
  
  extension [Self <: FileTreeNode](x: Self) {
    
    inline def setChildren(value: js.Array[FileTreeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: FileTreeNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
