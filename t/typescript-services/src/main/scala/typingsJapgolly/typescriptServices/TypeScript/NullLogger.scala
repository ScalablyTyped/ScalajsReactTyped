package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLogger
  extends StObject
     with ILogger
object NullLogger {
  
  inline def apply(
    debug: CallbackTo[Boolean],
    error: CallbackTo[Boolean],
    fatal: CallbackTo[Boolean],
    information: CallbackTo[Boolean],
    log: String => Callback,
    warning: CallbackTo[Boolean]
  ): NullLogger = {
    val __obj = js.Dynamic.literal(debug = debug.toJsFn, error = error.toJsFn, fatal = fatal.toJsFn, information = information.toJsFn, log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), warning = warning.toJsFn)
    __obj.asInstanceOf[NullLogger]
  }
}
