package typingsJapgolly.jquery.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.jquery.JQuery._SpecialEventHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDispatch[TTarget]
  extends StObject
     with _SpecialEventHook[TTarget, Any] {
  
  def postDispatch(event: Event): Unit
}
object PostDispatch {
  
  inline def apply[TTarget](postDispatch: Event => Callback): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1((t0: Event) => postDispatch(t0).runNow()))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
  
  extension [Self <: PostDispatch[?], TTarget](x: Self & PostDispatch[TTarget]) {
    
    inline def setPostDispatch(value: Event => Callback): Self = StObject.set(x, "postDispatch", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
  }
}
