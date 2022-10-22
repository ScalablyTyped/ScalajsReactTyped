package typingsJapgolly.reactNative

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNative.anon.Headers
  - typingsJapgolly.reactNative.anon.Type
*/
trait FormDataPart extends StObject
object FormDataPart {
  
  inline def Headers(headers: StringDictionary[String], string: String): typingsJapgolly.reactNative.anon.Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNative.anon.Headers]
  }
  
  inline def Type(headers: StringDictionary[String], uri: String): typingsJapgolly.reactNative.anon.Type = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNative.anon.Type]
  }
}
