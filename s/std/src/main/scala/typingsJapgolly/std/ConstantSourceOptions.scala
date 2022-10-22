package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstantSourceOptions extends StObject {
  
  /* standard dom */
  var offset: js.UndefOr[Double] = js.undefined
}
object ConstantSourceOptions {
  
  inline def apply(): ConstantSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstantSourceOptions]
  }
  
  extension [Self <: ConstantSourceOptions](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
