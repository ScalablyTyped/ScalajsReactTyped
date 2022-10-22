package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/toggler.html#javascript-reference
trait Toggler extends StObject {
  
  def toggle(): Unit
}
object Toggler {
  
  inline def apply(toggle: Callback): Toggler = {
    val __obj = js.Dynamic.literal(toggle = toggle.toJsFn)
    __obj.asInstanceOf[Toggler]
  }
  
  extension [Self <: Toggler](x: Self) {
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
  }
}
