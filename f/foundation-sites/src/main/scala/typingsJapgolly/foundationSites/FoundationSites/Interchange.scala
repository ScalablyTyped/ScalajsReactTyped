package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/interchange.html#javascript-reference
trait Interchange extends StObject {
  
  def replace(path: String): Unit
}
object Interchange {
  
  inline def apply(replace: String => Callback): Interchange = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction1((t0: String) => replace(t0).runNow()))
    __obj.asInstanceOf[Interchange]
  }
  
  extension [Self <: Interchange](x: Self) {
    
    inline def setReplace(value: String => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
