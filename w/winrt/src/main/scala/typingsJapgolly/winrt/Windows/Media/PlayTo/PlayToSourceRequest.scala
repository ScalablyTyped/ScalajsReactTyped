package typingsJapgolly.winrt.Windows.Media.PlayTo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayToSourceRequest
  extends StObject
     with IPlayToSourceRequest
object PlayToSourceRequest {
  
  inline def apply(
    deadline: js.Date,
    displayErrorString: String => Callback,
    getDeferral: CallbackTo[PlayToSourceDeferral],
    setSource: PlayToSource => Callback
  ): PlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1((t0: String) => displayErrorString(t0).runNow()), getDeferral = getDeferral.toJsFn, setSource = js.Any.fromFunction1((t0: PlayToSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[PlayToSourceRequest]
  }
}
