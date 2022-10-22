package typingsJapgolly.asn1js.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStringConvertible extends StObject {
  
  /**
    * Creates a class object from the string
    * @param data Input string to convert from
    */
  def fromString(data: String): Unit
}
object IStringConvertible {
  
  inline def apply(fromString: String => Callback): IStringConvertible = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1((t0: String) => fromString(t0).runNow()))
    __obj.asInstanceOf[IStringConvertible]
  }
  
  extension [Self <: IStringConvertible](x: Self) {
    
    inline def setFromString(value: String => Callback): Self = StObject.set(x, "fromString", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
