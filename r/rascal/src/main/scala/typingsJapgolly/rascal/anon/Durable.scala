package typingsJapgolly.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Durable extends StObject {
  
  var durable: Boolean
}
object Durable {
  
  inline def apply(durable: Boolean): Durable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durable]
  }
  
  extension [Self <: Durable](x: Self) {
    
    inline def setDurable(value: Boolean): Self = StObject.set(x, "durable", value.asInstanceOf[js.Any])
  }
}
