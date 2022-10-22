package typingsJapgolly.vsoNodeApi.interfacesWorkItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkItemTemplate
  extends StObject
     with WorkItemTemplateReference {
  
  /**
    * Mapping of field and its templated value.
    */
  var fields: StringDictionary[String]
}
object WorkItemTemplate {
  
  inline def apply(
    _links: Any,
    description: String,
    fields: StringDictionary[String],
    id: String,
    name: String,
    url: String,
    workItemTypeName: String
  ): WorkItemTemplate = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTemplate]
  }
  
  extension [Self <: WorkItemTemplate](x: Self) {
    
    inline def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
  }
}
