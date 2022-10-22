package typingsJapgolly.luminoCoreutils

import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPromiseMod {
  
  @JSImport("@lumino/coreutils/types/promise", "PromiseDelegate")
  @js.native
  /**
    * Construct a new promise delegate.
    */
  open class PromiseDelegate[T] () extends StObject {
    
    /* private */ var _reject: Any = js.native
    
    /* private */ var _resolve: Any = js.native
    
    /**
      * The promise wrapped by the delegate.
      */
    val promise: js.Promise[T] = js.native
    
    /**
      * Reject the wrapped promise with the given value.
      *
      * @reason - The reason for rejecting the promise.
      */
    def reject(reason: Any): Unit = js.native
    
    /**
      * Resolve the wrapped promise with the given value.
      *
      * @param value - The value to use for resolving the promise.
      */
    def resolve(value: T): Unit = js.native
    def resolve(value: PromiseLike[T]): Unit = js.native
  }
}
