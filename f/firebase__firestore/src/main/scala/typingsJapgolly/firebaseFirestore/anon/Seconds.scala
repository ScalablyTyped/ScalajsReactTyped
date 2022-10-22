package typingsJapgolly.firebaseFirestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seconds extends StObject {
  
  var nanos: js.UndefOr[Double] = js.undefined
  
  var seconds: js.UndefOr[String | Double] = js.undefined
}
object Seconds {
  
  inline def apply(): Seconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seconds]
  }
  
  extension [Self <: Seconds](x: Self) {
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: String | Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
