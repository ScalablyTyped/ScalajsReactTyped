package typingsJapgolly.hashJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RipemdSet extends StObject {
  
  def ripemd160(): Ripemd160
  @JSName("ripemd160")
  var ripemd160_Original: Ripemd160Constructor
}
object RipemdSet {
  
  inline def apply(ripemd160: CallbackTo[Ripemd160]): RipemdSet = {
    val __obj = js.Dynamic.literal(ripemd160 = ripemd160.toJsFn)
    __obj.asInstanceOf[RipemdSet]
  }
  
  extension [Self <: RipemdSet](x: Self) {
    
    inline def setRipemd160(value: CallbackTo[Ripemd160]): Self = StObject.set(x, "ripemd160", value.toJsFn)
  }
}
