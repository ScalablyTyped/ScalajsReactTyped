package typingsJapgolly.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.lokijs.anon.Delimited
  - typingsJapgolly.lokijs.anon.Delimiter
*/
trait DeserializeOptions extends StObject
object DeserializeOptions {
  
  inline def Delimited(): typingsJapgolly.lokijs.anon.Delimited = {
    val __obj = js.Dynamic.literal(delimited = false)
    __obj.asInstanceOf[typingsJapgolly.lokijs.anon.Delimited]
  }
  
  inline def Delimiter(delimiter: String): typingsJapgolly.lokijs.anon.Delimiter = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.lokijs.anon.Delimiter]
  }
}
