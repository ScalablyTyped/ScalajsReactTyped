package typingsJapgolly.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.simperium.mod.ModificationChange[T]
  - typingsJapgolly.simperium.mod.RemovalChange
*/
trait Change[T] extends StObject
object Change {
  
  inline def ModificationChange[T](ccid: String, id: String, v: JSONDiff[T]): typingsJapgolly.simperium.mod.ModificationChange[T] = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = "M", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.mod.ModificationChange[T]]
  }
  
  inline def RemovalChange(ccid: String, id: String): typingsJapgolly.simperium.mod.RemovalChange = {
    val __obj = js.Dynamic.literal(ccid = ccid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], o = "-")
    __obj.asInstanceOf[typingsJapgolly.simperium.mod.RemovalChange]
  }
}
