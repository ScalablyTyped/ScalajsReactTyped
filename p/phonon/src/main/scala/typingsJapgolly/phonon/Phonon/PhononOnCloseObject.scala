package typingsJapgolly.phonon.Phonon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononOnCloseObject extends StObject {
  
  def close(): Unit
}
object PhononOnCloseObject {
  
  inline def apply(close: Callback): PhononOnCloseObject = {
    val __obj = js.Dynamic.literal(close = close.toJsFn)
    __obj.asInstanceOf[PhononOnCloseObject]
  }
  
  extension [Self <: PhononOnCloseObject](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
  }
}
