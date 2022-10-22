package typingsJapgolly.ret

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSetLookupMod {
  
  trait SetLookup extends StObject {
    
    var len: Double
    
    def lookup(): Record[String | Double, Boolean]
  }
  object SetLookup {
    
    inline def apply(len: Double, lookup: CallbackTo[Record[String | Double, Boolean]]): SetLookup = {
      val __obj = js.Dynamic.literal(len = len.asInstanceOf[js.Any], lookup = lookup.toJsFn)
      __obj.asInstanceOf[SetLookup]
    }
    
    extension [Self <: SetLookup](x: Self) {
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: CallbackTo[Record[String | Double, Boolean]]): Self = StObject.set(x, "lookup", value.toJsFn)
    }
  }
}
