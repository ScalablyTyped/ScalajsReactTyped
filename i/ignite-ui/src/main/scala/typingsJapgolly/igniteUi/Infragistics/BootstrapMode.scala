package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapMode extends StObject {
  
  def isActive(): Unit
}
object BootstrapMode {
  
  inline def apply(isActive: Callback): BootstrapMode = {
    val __obj = js.Dynamic.literal(isActive = isActive.toJsFn)
    __obj.asInstanceOf[BootstrapMode]
  }
  
  extension [Self <: BootstrapMode](x: Self) {
    
    inline def setIsActive(value: Callback): Self = StObject.set(x, "isActive", value.toJsFn)
  }
}
