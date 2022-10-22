package typingsJapgolly.wordpressJestConsole

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jest {
  
  trait Matchers[R, T] extends StObject {
    
    /**
    		 * Ensure that `console.error` function was called.
    		 */
    def toHaveErrored(): R
    
    /**
    		 * Ensure that `console.error` function was called with specific arguments.
    		 */
    def toHaveErroredWith(args: Any*): R
    
    /**
    		 * Ensure that `console.info` function was called.
    		 */
    def toHaveInformed(): R
    
    /**
    		 * Ensure that `console.info` function was called with specific arguments.
    		 */
    def toHaveInformedWith(args: Any*): R
    
    /**
    		 * Ensure that `console.log` function was called.
    		 */
    def toHaveLogged(): R
    
    /**
    		 * Ensure that `console.log` function was called with specific arguments.
    		 */
    def toHaveLoggedWith(args: Any*): R
    
    /**
    		 * Ensure that `console.warn` function was called.
    		 */
    def toHaveWarned(): R
    
    /**
    		 * Ensure that `console.warn` function was called with specific arguments.
    		 */
    def toHaveWarnedWith(args: Any*): R
  }
  object Matchers {
    
    inline def apply[R, T](
      toHaveErrored: CallbackTo[R],
      toHaveErroredWith: /* repeated */ Any => R,
      toHaveInformed: CallbackTo[R],
      toHaveInformedWith: /* repeated */ Any => R,
      toHaveLogged: CallbackTo[R],
      toHaveLoggedWith: /* repeated */ Any => R,
      toHaveWarned: CallbackTo[R],
      toHaveWarnedWith: /* repeated */ Any => R
    ): Matchers[R, T] = {
      val __obj = js.Dynamic.literal(toHaveErrored = toHaveErrored.toJsFn, toHaveErroredWith = js.Any.fromFunction1(toHaveErroredWith), toHaveInformed = toHaveInformed.toJsFn, toHaveInformedWith = js.Any.fromFunction1(toHaveInformedWith), toHaveLogged = toHaveLogged.toJsFn, toHaveLoggedWith = js.Any.fromFunction1(toHaveLoggedWith), toHaveWarned = toHaveWarned.toJsFn, toHaveWarnedWith = js.Any.fromFunction1(toHaveWarnedWith))
      __obj.asInstanceOf[Matchers[R, T]]
    }
    
    extension [Self <: Matchers[?, ?], R, T](x: Self & (Matchers[R, T])) {
      
      inline def setToHaveErrored(value: CallbackTo[R]): Self = StObject.set(x, "toHaveErrored", value.toJsFn)
      
      inline def setToHaveErroredWith(value: /* repeated */ Any => R): Self = StObject.set(x, "toHaveErroredWith", js.Any.fromFunction1(value))
      
      inline def setToHaveInformed(value: CallbackTo[R]): Self = StObject.set(x, "toHaveInformed", value.toJsFn)
      
      inline def setToHaveInformedWith(value: /* repeated */ Any => R): Self = StObject.set(x, "toHaveInformedWith", js.Any.fromFunction1(value))
      
      inline def setToHaveLogged(value: CallbackTo[R]): Self = StObject.set(x, "toHaveLogged", value.toJsFn)
      
      inline def setToHaveLoggedWith(value: /* repeated */ Any => R): Self = StObject.set(x, "toHaveLoggedWith", js.Any.fromFunction1(value))
      
      inline def setToHaveWarned(value: CallbackTo[R]): Self = StObject.set(x, "toHaveWarned", value.toJsFn)
      
      inline def setToHaveWarnedWith(value: /* repeated */ Any => R): Self = StObject.set(x, "toHaveWarnedWith", js.Any.fromFunction1(value))
    }
  }
}
