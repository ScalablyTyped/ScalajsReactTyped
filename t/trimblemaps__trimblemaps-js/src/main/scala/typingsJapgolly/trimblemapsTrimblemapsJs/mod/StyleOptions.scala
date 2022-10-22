package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOptions extends StObject {
  
  var transition: js.UndefOr[Boolean] = js.undefined
}
object StyleOptions {
  
  inline def apply(): StyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOptions]
  }
  
  extension [Self <: StyleOptions](x: Self) {
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
