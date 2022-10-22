package typingsJapgolly.winrt.Windows.Media.Protection

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaProtectionServiceCompletion
  extends StObject
     with IMediaProtectionServiceCompletion
object MediaProtectionServiceCompletion {
  
  inline def apply(complete: Boolean => Callback): MediaProtectionServiceCompletion = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Boolean) => complete(t0).runNow()))
    __obj.asInstanceOf[MediaProtectionServiceCompletion]
  }
}
