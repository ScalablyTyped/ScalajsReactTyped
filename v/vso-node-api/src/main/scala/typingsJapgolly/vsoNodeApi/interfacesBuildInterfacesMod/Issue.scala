package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issue extends StObject {
  
  /**
    * The category.
    */
  var category: String
  
  var data: StringDictionary[String]
  
  /**
    * A description of the issue.
    */
  var message: String
  
  /**
    * The type (error, warning) of the issue.
    */
  var `type`: IssueType
}
object Issue {
  
  inline def apply(category: String, data: StringDictionary[String], message: String, `type`: IssueType): Issue = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
  
  extension [Self <: Issue](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: IssueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
