package typingsJapgolly.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsScriptHttpRequestEventPostData extends StObject {
  
  var contents: String
  
  var length: Double
  
  var name: String
  
  var `type`: String
}
object AppsScriptHttpRequestEventPostData {
  
  inline def apply(contents: String, length: Double, name: String, `type`: String): AppsScriptHttpRequestEventPostData = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsScriptHttpRequestEventPostData]
  }
  
  extension [Self <: AppsScriptHttpRequestEventPostData](x: Self) {
    
    inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
