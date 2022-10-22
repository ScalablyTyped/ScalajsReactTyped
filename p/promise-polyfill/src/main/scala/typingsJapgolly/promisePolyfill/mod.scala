package typingsJapgolly.promisePolyfill

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.Promise
import typingsJapgolly.std.PromiseConstructor
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("promise-polyfill", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with Promise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used to resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    /* standard es2015.promise */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ T | PromiseLike[T], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  @JSImport("promise-polyfill", JSImport.Namespace)
  @js.native
  val ^ : PromisePolyfillConstructor = js.native
  
  @js.native
  trait PromisePolyfillConstructor
    extends StObject
       with PromiseConstructor {
    
    var _immediateFn: js.UndefOr[js.Function1[/* handler */ js.Function0[Unit] | String, Unit]] = js.native
  }
  
  type _To = PromisePolyfillConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PromisePolyfillConstructor = ^
}
