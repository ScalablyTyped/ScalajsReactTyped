package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponsiveMode extends StObject {
  
  def isActive(): Unit
}
object ResponsiveMode {
  
  inline def apply(isActive: Callback): ResponsiveMode = {
    val __obj = js.Dynamic.literal(isActive = isActive.toJsFn)
    __obj.asInstanceOf[ResponsiveMode]
  }
  
  extension [Self <: ResponsiveMode](x: Self) {
    
    inline def setIsActive(value: Callback): Self = StObject.set(x, "isActive", value.toJsFn)
  }
}
