package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcBranchMapping extends StObject {
  
  /**
    * Depth of the branch.
    */
  var depth: String
  
  /**
    * Server item for the branch.
    */
  var serverItem: String
  
  /**
    * Type of the branch.
    */
  var `type`: String
}
object TfvcBranchMapping {
  
  inline def apply(depth: String, serverItem: String, `type`: String): TfvcBranchMapping = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranchMapping]
  }
  
  extension [Self <: TfvcBranchMapping](x: Self) {
    
    inline def setDepth(value: String): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setServerItem(value: String): Self = StObject.set(x, "serverItem", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
