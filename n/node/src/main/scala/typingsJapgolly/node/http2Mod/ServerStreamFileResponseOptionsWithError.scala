package typingsJapgolly.node.http2Mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStreamFileResponseOptionsWithError
  extends StObject
     with ServerStreamFileResponseOptions {
  
  var onError: js.UndefOr[js.Function1[/* err */ ErrnoException, Unit]] = js.undefined
}
object ServerStreamFileResponseOptionsWithError {
  
  inline def apply(): ServerStreamFileResponseOptionsWithError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptionsWithError]
  }
  
  extension [Self <: ServerStreamFileResponseOptionsWithError](x: Self) {
    
    inline def setOnError(value: /* err */ ErrnoException => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ ErrnoException) => value(t0).runNow()))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
  }
}
