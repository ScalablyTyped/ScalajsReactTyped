package typingsJapgolly.blazorJavascriptInterop.DotNet

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the .NET instance passed by reference to JavaScript.
  */
trait DotNetObject extends js.Object {
  /**
    * Invokes the specified .NET instance public method synchronously. Not all hosting scenarios support
    * synchronous invocation, so if possible use invokeMethodAsync instead.
    *
    * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
    * @param args Arguments to pass to the method, each of which must be JSON-serializable.
    * @returns The result of the operation.
    */
  def invokeMethod[T](methodIdentifier: String, args: js.Any*): T
  /**
    * Invokes the specified .NET instance public method asynchronously.
    *
    * @param methodIdentifier The identifier of the method to invoke. The method must have a [JSInvokable] attribute specifying this identifier.
    * @param args Arguments to pass to the method, each of which must be JSON-serializable.
    * @returns A promise representing the result of the operation.
    */
  def invokeMethodAsync[T](methodIdentifier: String, args: js.Any*): js.Promise[T]
}

object DotNetObject {
  @scala.inline
  def apply(
    invokeMethod: (String, /* repeated */ js.Any) => CallbackTo[js.Any],
    invokeMethodAsync: (String, /* repeated */ js.Any) => CallbackTo[js.Promise[js.Any]]
  ): DotNetObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("invokeMethod")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => invokeMethod(t0, t1).runNow()))
    __obj.updateDynamic("invokeMethodAsync")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => invokeMethodAsync(t0, t1).runNow()))
    __obj.asInstanceOf[DotNetObject]
  }
}

