package typingsJapgolly.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ranges extends StObject {
  
  var ranges: Boolean
}
object Ranges {
  
  inline def apply(ranges: Boolean): Ranges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranges]
  }
  
  extension [Self <: Ranges](x: Self) {
    
    inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
  }
}
