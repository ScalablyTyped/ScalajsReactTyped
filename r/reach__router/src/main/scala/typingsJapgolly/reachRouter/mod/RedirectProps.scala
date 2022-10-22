package typingsJapgolly.reachRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectProps[TState] extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var noThrow: js.UndefOr[Boolean] = js.undefined
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[TState] = js.undefined
  
  var to: String
}
object RedirectProps {
  
  inline def apply[TState](to: String): RedirectProps[TState] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectProps[TState]]
  }
  
  extension [Self <: RedirectProps[?], TState](x: Self & RedirectProps[TState]) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setNoThrow(value: Boolean): Self = StObject.set(x, "noThrow", value.asInstanceOf[js.Any])
    
    inline def setNoThrowUndefined: Self = StObject.set(x, "noThrow", js.undefined)
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setState(value: TState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
