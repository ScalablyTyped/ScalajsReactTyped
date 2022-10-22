package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rsocketTypes.anon.Kind
  - typingsJapgolly.rsocketTypes.anon.`0`
  - typingsJapgolly.rsocketTypes.anon.`1`
  - typingsJapgolly.rsocketTypes.anon.`2`
  - typingsJapgolly.rsocketTypes.anon.Error
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  inline def `0`(): typingsJapgolly.rsocketTypes.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = "CONNECTING")
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.anon.`0`]
  }
  
  inline def `1`(): typingsJapgolly.rsocketTypes.anon.`1` = {
    val __obj = js.Dynamic.literal(kind = "CONNECTED")
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.anon.`1`]
  }
  
  inline def `2`(): typingsJapgolly.rsocketTypes.anon.`2` = {
    val __obj = js.Dynamic.literal(kind = "CLOSED")
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.anon.`2`]
  }
  
  inline def Error(error: js.Error): typingsJapgolly.rsocketTypes.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "ERROR")
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.anon.Error]
  }
  
  inline def Kind(): typingsJapgolly.rsocketTypes.anon.Kind = {
    val __obj = js.Dynamic.literal(kind = "NOT_CONNECTED")
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.anon.Kind]
  }
}
