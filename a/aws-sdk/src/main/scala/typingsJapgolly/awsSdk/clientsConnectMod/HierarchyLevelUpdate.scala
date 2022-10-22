package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchyLevelUpdate extends StObject {
  
  /**
    * The name of the user hierarchy level. Must not be more than 50 characters.
    */
  var Name: HierarchyLevelName
}
object HierarchyLevelUpdate {
  
  inline def apply(Name: HierarchyLevelName): HierarchyLevelUpdate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyLevelUpdate]
  }
  
  extension [Self <: HierarchyLevelUpdate](x: Self) {
    
    inline def setName(value: HierarchyLevelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
