package typingsJapgolly.minappEnv.global

import typingsJapgolly.minappEnv.PromiseConstructor
import typingsJapgolly.minappEnv.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Promise")
@js.native
open class Promise[T] protected ()
  extends StObject
     with typingsJapgolly.minappEnv.Promise[T] {
  /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
        Unit
      ]) = this()
}
object Promise {
  
  inline def apply: PromiseConstructor = js.Dynamic.global.selectDynamic("Promise").asInstanceOf[PromiseConstructor]
}
