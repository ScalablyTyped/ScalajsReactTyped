package typingsJapgolly.knockoutPreRendered

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutComputedDefine[T] extends StObject {
  
  var deferEvaluation: js.UndefOr[Boolean] = js.undefined
  
  var disposeWhen: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var disposeWhenNodeIsRemoved: js.UndefOr[Node] = js.undefined
  
  var owner: js.UndefOr[Any] = js.undefined
  
  var pure: js.UndefOr[Boolean] = js.undefined
  
  def read(): T
  
  var write: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}
object KnockoutComputedDefine {
  
  inline def apply[T](read: CallbackTo[T]): KnockoutComputedDefine[T] = {
    val __obj = js.Dynamic.literal(read = read.toJsFn)
    __obj.asInstanceOf[KnockoutComputedDefine[T]]
  }
  
  extension [Self <: KnockoutComputedDefine[?], T](x: Self & KnockoutComputedDefine[T]) {
    
    inline def setDeferEvaluation(value: Boolean): Self = StObject.set(x, "deferEvaluation", value.asInstanceOf[js.Any])
    
    inline def setDeferEvaluationUndefined: Self = StObject.set(x, "deferEvaluation", js.undefined)
    
    inline def setDisposeWhen(value: CallbackTo[Boolean]): Self = StObject.set(x, "disposeWhen", value.toJsFn)
    
    inline def setDisposeWhenNodeIsRemoved(value: Node): Self = StObject.set(x, "disposeWhenNodeIsRemoved", value.asInstanceOf[js.Any])
    
    inline def setDisposeWhenNodeIsRemovedUndefined: Self = StObject.set(x, "disposeWhenNodeIsRemoved", js.undefined)
    
    inline def setDisposeWhenUndefined: Self = StObject.set(x, "disposeWhen", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setPureUndefined: Self = StObject.set(x, "pure", js.undefined)
    
    inline def setRead(value: CallbackTo[T]): Self = StObject.set(x, "read", value.toJsFn)
    
    inline def setWrite(value: /* value */ T => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: /* value */ T) => value(t0).runNow()))
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
