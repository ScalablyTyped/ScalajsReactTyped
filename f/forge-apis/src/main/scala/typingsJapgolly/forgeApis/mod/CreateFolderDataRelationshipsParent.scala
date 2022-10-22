package typingsJapgolly.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFolderDataRelationshipsParent extends StObject {
  
  var data: CreateFolderDataRelationshipsParentData
}
object CreateFolderDataRelationshipsParent {
  
  inline def apply(data: CreateFolderDataRelationshipsParentData): CreateFolderDataRelationshipsParent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFolderDataRelationshipsParent]
  }
  
  extension [Self <: CreateFolderDataRelationshipsParent](x: Self) {
    
    inline def setData(value: CreateFolderDataRelationshipsParentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
