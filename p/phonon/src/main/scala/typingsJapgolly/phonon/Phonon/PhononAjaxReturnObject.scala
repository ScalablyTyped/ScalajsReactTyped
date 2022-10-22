package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononAjaxReturnObject extends StObject {
  
  def cancel(): Unit
}
object PhononAjaxReturnObject {
  
  inline def apply(cancel: Callback): PhononAjaxReturnObject = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn)
    __obj.asInstanceOf[PhononAjaxReturnObject]
  }
  
  extension [Self <: PhononAjaxReturnObject](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
  }
}
