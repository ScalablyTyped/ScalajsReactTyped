package typingsJapgolly.iobroker.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sorted extends StObject {
  
  var sorted: js.UndefOr[Boolean] = js.undefined
}
object Sorted {
  
  inline def apply(): Sorted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sorted]
  }
  
  extension [Self <: Sorted](x: Self) {
    
    inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
    
    inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
  }
}
