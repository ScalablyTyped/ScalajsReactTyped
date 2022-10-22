package typingsJapgolly.jasmine.jasmine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NothingMatcher extends StObject {
  
  def nothing(): Unit
}
object NothingMatcher {
  
  inline def apply(nothing: Callback): NothingMatcher = {
    val __obj = js.Dynamic.literal(nothing = nothing.toJsFn)
    __obj.asInstanceOf[NothingMatcher]
  }
  
  extension [Self <: NothingMatcher](x: Self) {
    
    inline def setNothing(value: Callback): Self = StObject.set(x, "nothing", value.toJsFn)
  }
}
