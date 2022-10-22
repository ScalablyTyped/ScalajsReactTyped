package typingsJapgolly.sqltoolsFormatter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sqltoolsFormatter.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreInlineBlockMod {
  
  @JSImport("@sqltools/formatter/lib/core/InlineBlock", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with InlineBlock {
    
    /* CompleteClass */
    override def beginIfPossible(tokens: Any, index: Any): Unit = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def isActive(): Boolean = js.native
    
    /* CompleteClass */
    override def isForbiddenToken(hasTypeValue: Type): Boolean = js.native
    
    /* CompleteClass */
    override def isInlineBlock(tokens: Any, index: Any): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var level: Any = js.native
  }
  
  trait InlineBlock extends StObject {
    
    def beginIfPossible(tokens: Any, index: Any): Unit
    
    def end(): Unit
    
    def isActive(): Boolean
    
    def isForbiddenToken(hasTypeValue: Type): Boolean
    
    def isInlineBlock(tokens: Any, index: Any): Boolean
    
    /* private */ var level: Any
  }
  object InlineBlock {
    
    inline def apply(
      beginIfPossible: (Any, Any) => Callback,
      end: Callback,
      isActive: CallbackTo[Boolean],
      isForbiddenToken: Type => Boolean,
      isInlineBlock: (Any, Any) => Boolean,
      level: Any
    ): InlineBlock = {
      val __obj = js.Dynamic.literal(beginIfPossible = js.Any.fromFunction2((t0: Any, t1: Any) => (beginIfPossible(t0, t1)).runNow()), end = end.toJsFn, isActive = isActive.toJsFn, isForbiddenToken = js.Any.fromFunction1(isForbiddenToken), isInlineBlock = js.Any.fromFunction2(isInlineBlock), level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineBlock]
    }
    
    extension [Self <: InlineBlock](x: Self) {
      
      inline def setBeginIfPossible(value: (Any, Any) => Callback): Self = StObject.set(x, "beginIfPossible", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
      
      inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
      
      inline def setIsForbiddenToken(value: Type => Boolean): Self = StObject.set(x, "isForbiddenToken", js.Any.fromFunction1(value))
      
      inline def setIsInlineBlock(value: (Any, Any) => Boolean): Self = StObject.set(x, "isInlineBlock", js.Any.fromFunction2(value))
      
      inline def setLevel(value: Any): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
