package typingsJapgolly.knockoutPunches

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutPunchesStatic extends StObject {
  
  def enableAll(): Unit
}
object KnockoutPunchesStatic {
  
  inline def apply(enableAll: Callback): KnockoutPunchesStatic = {
    val __obj = js.Dynamic.literal(enableAll = enableAll.toJsFn)
    __obj.asInstanceOf[KnockoutPunchesStatic]
  }
  
  extension [Self <: KnockoutPunchesStatic](x: Self) {
    
    inline def setEnableAll(value: Callback): Self = StObject.set(x, "enableAll", value.toJsFn)
  }
}
