package typingsJapgolly.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An array of dialog nodes. */
trait DialogNodeCollection extends StObject {
  
  /** An array of objects describing the dialog nodes defined for the workspace. */
  var dialog_nodes: js.Array[DialogNode]
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination
}
object DialogNodeCollection {
  
  inline def apply(dialog_nodes: js.Array[DialogNode], pagination: Pagination): DialogNodeCollection = {
    val __obj = js.Dynamic.literal(dialog_nodes = dialog_nodes.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogNodeCollection]
  }
  
  extension [Self <: DialogNodeCollection](x: Self) {
    
    inline def setDialog_nodes(value: js.Array[DialogNode]): Self = StObject.set(x, "dialog_nodes", value.asInstanceOf[js.Any])
    
    inline def setDialog_nodesVarargs(value: DialogNode*): Self = StObject.set(x, "dialog_nodes", js.Array(value*))
    
    inline def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
