package typingsJapgolly.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var ancestors: js.UndefOr[Any] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var localize: js.UndefOr[js.Function1[/* repeated */ Any, this.type]] = js.undefined
  
  var parent: js.UndefOr[Any] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var reference: js.UndefOr[Any] = js.undefined
}
object State {
  
  inline def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setAncestors(value: Any): Self = StObject.set(x, "ancestors", value.asInstanceOf[js.Any])
    
    inline def setAncestorsUndefined: Self = StObject.set(x, "ancestors", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocalize(value: /* repeated */ Any => State): Self = StObject.set(x, "localize", js.Any.fromFunction1(value))
    
    inline def setLocalizeUndefined: Self = StObject.set(x, "localize", js.undefined)
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReference(value: Any): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
