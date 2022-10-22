package typingsJapgolly.reactNativeWindows

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNativeWindows.anon.Headers
  - typingsJapgolly.reactNativeWindows.anon.Name
*/
trait FormDataPart extends StObject
object FormDataPart {
  
  inline def Headers(headers: StringDictionary[String], string: String): typingsJapgolly.reactNativeWindows.anon.Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeWindows.anon.Headers]
  }
  
  inline def Name(headers: StringDictionary[String], uri: String): typingsJapgolly.reactNativeWindows.anon.Name = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNativeWindows.anon.Name]
  }
}
