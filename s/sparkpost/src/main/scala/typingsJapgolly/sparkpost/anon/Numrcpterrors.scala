package typingsJapgolly.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Numrcpterrors extends StObject {
  
  var num_rcpt_errors: js.UndefOr[Double] = js.undefined
}
object Numrcpterrors {
  
  inline def apply(): Numrcpterrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Numrcpterrors]
  }
  
  extension [Self <: Numrcpterrors](x: Self) {
    
    inline def setNum_rcpt_errors(value: Double): Self = StObject.set(x, "num_rcpt_errors", value.asInstanceOf[js.Any])
    
    inline def setNum_rcpt_errorsUndefined: Self = StObject.set(x, "num_rcpt_errors", js.undefined)
  }
}
