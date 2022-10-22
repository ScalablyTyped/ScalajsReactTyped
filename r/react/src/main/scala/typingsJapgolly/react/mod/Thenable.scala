package typingsJapgolly.react.mod

import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T]
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T]
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T]
  - typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T]
*/
trait Thenable[T] extends StObject
object Thenable {
  
  inline def FulfilledThenable[T](
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
    value: T
  ): typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.FulfilledThenable[T]]
  }
  
  inline def PendingThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T] = {
    val __obj = js.Dynamic.literal(status = "pending")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.PendingThenable[T]]
  }
  
  inline def RejectedThenable[T](
    reason: Any,
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.RejectedThenable[T]]
  }
  
  inline def UntrackedThenable[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.UntrackedThenable[T]]
  }
}
