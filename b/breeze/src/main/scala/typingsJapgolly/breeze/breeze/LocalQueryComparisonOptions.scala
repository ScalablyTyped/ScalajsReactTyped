package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalQueryComparisonOptions extends StObject {
  
  def setAsDefault(): Unit
}
object LocalQueryComparisonOptions {
  
  inline def apply(setAsDefault: Callback): LocalQueryComparisonOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = setAsDefault.toJsFn)
    __obj.asInstanceOf[LocalQueryComparisonOptions]
  }
  
  extension [Self <: LocalQueryComparisonOptions](x: Self) {
    
    inline def setSetAsDefault(value: Callback): Self = StObject.set(x, "setAsDefault", value.toJsFn)
  }
}
