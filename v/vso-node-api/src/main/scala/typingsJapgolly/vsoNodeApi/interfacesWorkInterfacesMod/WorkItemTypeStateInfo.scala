package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTypeStateInfo extends StObject {
  
  /**
    * State name to state category map
    */
  var states: StringDictionary[String]
  
  /**
    * Work Item type name
    */
  var workItemTypeName: String
}
object WorkItemTypeStateInfo {
  
  inline def apply(states: StringDictionary[String], workItemTypeName: String): WorkItemTypeStateInfo = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateInfo]
  }
  
  extension [Self <: WorkItemTypeStateInfo](x: Self) {
    
    inline def setStates(value: StringDictionary[String]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
