package typingsJapgolly.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  var Timestamp: String
}
object Timestamp {
  
  inline def apply(Timestamp: String): Timestamp = {
    val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timestamp]
  }
  
  extension [Self <: Timestamp](x: Self) {
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
