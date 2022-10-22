package typingsJapgolly.ejWebAll

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryDeferred[T] extends StObject {
  
  /**
    * Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
}
object JQueryDeferred {
  
  inline def apply[T](): JQueryDeferred[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDeferred[T]]
  }
  
  extension [Self <: JQueryDeferred[?], T](x: Self & JQueryDeferred[T]) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
  }
}
