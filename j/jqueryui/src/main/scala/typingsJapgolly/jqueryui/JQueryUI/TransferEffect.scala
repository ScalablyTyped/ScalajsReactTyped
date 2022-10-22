package typingsJapgolly.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferEffect extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object TransferEffect {
  
  inline def apply(): TransferEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferEffect]
  }
  
  extension [Self <: TransferEffect](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
