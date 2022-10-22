package typingsJapgolly.mapboxMapboxSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reverse extends StObject {
  
  var reverse: js.UndefOr[Boolean] = js.undefined
}
object Reverse {
  
  inline def apply(): Reverse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reverse]
  }
  
  extension [Self <: Reverse](x: Self) {
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
