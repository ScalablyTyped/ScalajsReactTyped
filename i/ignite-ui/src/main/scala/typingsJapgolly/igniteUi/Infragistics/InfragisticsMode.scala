package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfragisticsMode extends StObject {
  
  def isActive(): Unit
}
object InfragisticsMode {
  
  inline def apply(isActive: Callback): InfragisticsMode = {
    val __obj = js.Dynamic.literal(isActive = isActive.toJsFn)
    __obj.asInstanceOf[InfragisticsMode]
  }
  
  extension [Self <: InfragisticsMode](x: Self) {
    
    inline def setIsActive(value: Callback): Self = StObject.set(x, "isActive", value.toJsFn)
  }
}
